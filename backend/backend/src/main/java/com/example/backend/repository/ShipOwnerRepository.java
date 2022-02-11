package com.example.backend.repository;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.ShipOwner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShipOwnerRepository extends JpaRepository<ShipOwner, UUID> {

    public ShipOwner getShipOwnerByEmail(String email);
}
