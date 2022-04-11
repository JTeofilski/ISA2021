package com.example.backend.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.backend.model.other.House;
import com.example.backend.model.users.Customer;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.model.users.Instructor;
import com.example.backend.model.users.Role;
import com.example.backend.repository.InstructorRepository;
import com.example.backend.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class InstructorService {

    final private InstructorRepository instructorRepository;
    final private RoleRepository roleRepository;
    final private PasswordEncoder encoder;
    final private EmailSender sender;

    public Instructor create(Instructor instructor){

        Instructor i = instructorRepository.getInstructorByEmail(instructor.getEmail());

        if (i != null) {
            throw new IllegalArgumentException("Email already exists!");
        }

        instructor.setPassword(encoder.encode(instructor.getPassword()));
        Set<Role> roles = new HashSet<>();
        Role role = roleRepository.getRoleByRoleName("ROLE_INSTRUCTOR");
        roles.add(role);
        instructor.setRoles(roles);

        Instructor newInstructor =  instructorRepository.save(instructor);

        sender.SendVerificationMailForCustomer(newInstructor.getEmail(), newInstructor.getId().toString());
        return newInstructor;
    }

    public Instructor findById(UUID instructorId){
        Instructor tempInstructor = this.instructorRepository.findById(instructorId).orElseThrow(()-> new NoSuchElementException("No instructor by id"));
        System.out.println(tempInstructor);
        return tempInstructor;
    }


    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }


}
