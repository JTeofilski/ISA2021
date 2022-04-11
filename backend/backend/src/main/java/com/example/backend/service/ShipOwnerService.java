package com.example.backend.service;

import com.example.backend.model.dto.ShipOwnerDTO;
import com.example.backend.model.enums.StatusOfProfile;
import com.example.backend.model.users.Role;
import com.example.backend.model.users.ShipOwner;
import com.example.backend.repository.RoleRepository;
import com.example.backend.repository.ShipOwnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class ShipOwnerService {

    final private ShipOwnerRepository shipOwnerRepository;
    final private RoleRepository roleRepository;
    final private PasswordEncoder encoder;
    final private EmailSender sender;

    public List<ShipOwner> findAll() {

        return shipOwnerRepository.findAll();
    }

    public ShipOwner create(ShipOwnerDTO sod){

        ShipOwner so = shipOwnerRepository.getShipOwnerByEmail(sod.getEmail());

        if (so != null) {
            throw new IllegalArgumentException("Email already exists!");
        }

        ShipOwner shipOwner = new ShipOwner();

        shipOwner.setFirstName(sod.getFirstName());
        shipOwner.setLastName(sod.getLastName());
        shipOwner.setEmail(sod.getEmail());
        shipOwner.setPassword(encoder.encode(sod.getPassword()));
        shipOwner.setPhoneNumber(sod.getPhoneNumber());

//        Address a = new Address();
//        a.setStreet(sod.getAddress());
//        a.setCity(sod.getCity());
//
//        shipOwner.setAddress(addressService.create(a));


        shipOwner.setFirstLogin(true);
        shipOwner.setStatus(StatusOfProfile.REGISTERED);

        Set<Role> roles = new HashSet<>();
        Role role = roleRepository.getRoleByRoleName("ROLE_SHIP_OWNER");
        roles.add(role);
        shipOwner.setRoles(roles);

        ShipOwner newShipOwner =  shipOwnerRepository.save(shipOwner);

        return newShipOwner;

    }

    public ShipOwner update(ShipOwner shipOwner){
        ShipOwner so = shipOwnerRepository.getShipOwnerByEmail(shipOwner.getEmail());

        if (so == null) {
            throw new UsernameNotFoundException("User not found in database!");
        }

        so.setPassword(shipOwner.getPassword());
        so.setFirstName(shipOwner.getFirstName());
        so.setLastName(shipOwner.getLastName());
        so.setPhoneNumber(shipOwner.getPhoneNumber());
        so.setAddress(shipOwner.getAddress());

        return shipOwnerRepository.save(so);
    }

}
