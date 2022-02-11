package com.example.backend.service;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.model.users.Role;
import com.example.backend.model.users.ShipOwner;
import com.example.backend.repository.RoleRepository;
import com.example.backend.repository.ShipOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class ShipOwnerService {

    final private ShipOwnerRepository shipOwnerRepository;
    final private RoleRepository roleRepository;
    final private PasswordEncoder encoder;
    final private EmailSender sender;

    public ShipOwner create(ShipOwner shipOwner){

        ShipOwner so = shipOwnerRepository.getShipOwnerByEmail(shipOwner.getEmail());

        if (so != null) {
            throw new IllegalArgumentException("Email already exists!");
        }

        shipOwner.setPassword(encoder.encode(shipOwner.getPassword()));
        Set<Role> roles = new HashSet<>();
        Role role = roleRepository.getRoleByRoleName("ROLE_SHIP_OWNER");
        roles.add(role);
        shipOwner.setRoles(roles);

        ShipOwner newShipOwner = shipOwnerRepository.save(shipOwner);

        sender.SendVerificationMailForCustomer(newShipOwner.getEmail(), newShipOwner.getUserId().toString());
        return newShipOwner;
    }
}
