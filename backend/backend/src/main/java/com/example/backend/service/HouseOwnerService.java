package com.example.backend.service;

import com.example.backend.model.common.Address;
import com.example.backend.model.dto.HouseOwnerDTO;
import com.example.backend.model.enums.StatusOfProfile;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.model.users.Role;
import com.example.backend.repository.HouseOwnerRepository;
import com.example.backend.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service // bez ove anotacije nije radilo
public class HouseOwnerService {

    final private HouseOwnerRepository houseOwnerRepository;
    final private RoleRepository roleRepository;
    final private PasswordEncoder encoder;
    final private EmailSender sender;
    final private AddressService addressService;

    public List<HouseOwner> findAll() {

        return houseOwnerRepository.findAll();
    }

    public HouseOwner create(HouseOwnerDTO hod) {
        HouseOwner ho = houseOwnerRepository.getHouseOwnerByEmail(hod.getEmail());

        if (ho != null) {
            throw new IllegalArgumentException("Email already exists!");
        }

        HouseOwner houseOwner = new HouseOwner();

        houseOwner.setFirstName(hod.getFirstName());
        houseOwner.setLastName(hod.getLastName());
        houseOwner.setEmail(hod.getEmail());
        houseOwner.setPassword(encoder.encode(hod.getPassword()));
        houseOwner.setPhoneNumber(hod.getPhoneNumber());

        Address a = new Address();
        a.setStreet(hod.getAddress());
        a.setCity(hod.getCity());

        houseOwner.setAddress(addressService.create(a));

        houseOwner.setFirstLogin(true);
        houseOwner.setStatus(StatusOfProfile.REGISTERED);

        Set<Role> roles = new HashSet<>();
        Role role = roleRepository.getRoleByRoleName("ROLE_HOUSE_OWNER");
        roles.add(role);
        houseOwner.setRoles(roles);

        HouseOwner newHouseOwner =  houseOwnerRepository.save(houseOwner);

        return newHouseOwner;
    }

    public HouseOwner update(HouseOwner houseOwner){
        HouseOwner ho = houseOwnerRepository.getHouseOwnerByEmail(houseOwner.getEmail());

        if (ho == null) {
            throw new UsernameNotFoundException("User not found in database!");
        }

        ho.setPassword(houseOwner.getPassword());
        ho.setFirstName(houseOwner.getFirstName());
        ho.setLastName(houseOwner.getLastName());
        ho.setPhoneNumber(houseOwner.getPhoneNumber());
        ho.setAddress(houseOwner.getAddress());

        return houseOwnerRepository.save(ho);
    }


}
