package com.example.backend.service;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.model.users.Role;
import com.example.backend.repository.HouseOwnerRepository;
import com.example.backend.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service // bez ove anotacije nije radilo
public class HouseOwnerService {

   final private HouseOwnerRepository houseOwnerRepository;
   final private RoleRepository roleRepository;

    public HouseOwner create(HouseOwner houseOwner) {
        HouseOwner ho = houseOwnerRepository.getHouseOwnerByEmail(houseOwner.getEmail());

        if (ho != null) {
            throw new IllegalArgumentException("HouseOwner Email already exists!");
        }

        Role r = roleRepository.getRoleByRoleName("ROLE_HOUSE_OWNER");
        Set<Role> roles = new HashSet<>();
        roles.add(r);
        houseOwner.setRoles(roles);

        HouseOwner newHouseOwner =  houseOwnerRepository.save(houseOwner);

        return newHouseOwner;
    }
}
