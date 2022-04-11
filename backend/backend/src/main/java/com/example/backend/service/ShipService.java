package com.example.backend.service;

import com.example.backend.model.other.House;
import com.example.backend.model.other.Ship;
import com.example.backend.model.users.User;
import com.example.backend.repository.ShipRepository;
import com.example.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ShipService {


    private ShipRepository shipRepository;

    @Autowired
    public ShipService(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    public List<Ship> findAll() {
        return shipRepository.findAll();
    }

    public Ship create(Ship ship){
        return shipRepository.save(ship);
    }

    public Ship findById(UUID shipId){
        Ship tempShip = this.shipRepository.findById(shipId).orElseThrow(()-> new NoSuchElementException("No ship by id"));
        return tempShip;
    }
}
