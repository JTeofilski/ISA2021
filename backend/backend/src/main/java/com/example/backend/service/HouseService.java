package com.example.backend.service;

import com.example.backend.model.other.House;
import com.example.backend.model.users.User;
import com.example.backend.repository.HouseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class HouseService {

    @Autowired
    private HouseRepository houseRepository;

   // @Autowired
    //public HouseService(HouseRepository houseRepository) {
     //   this.houseRepository = houseRepository;
    //}

    public List<House> findAll() {
        return houseRepository.findAll();
    }

    public House create(House house){
        return houseRepository.save(house);
    }

   public House findById(UUID houseId){
       House tempHouse = this.houseRepository.findById(houseId).orElseThrow(()-> new NoSuchElementException("No house by id"));
       return tempHouse;
    }

}
