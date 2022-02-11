package com.example.backend.repository;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InstructorRepository extends JpaRepository<Instructor, UUID> {

    public Instructor getInstructorByEmail(String email);
}
