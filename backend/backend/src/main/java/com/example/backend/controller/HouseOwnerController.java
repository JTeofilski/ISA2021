package com.example.backend.controller;


import com.example.backend.model.dto.HouseOwnerDTO;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.service.HouseOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/house-owner", produces = MediaType.APPLICATION_JSON_VALUE)
public class HouseOwnerController {

    final private HouseOwnerService houseOwnerService;

    @Autowired
    public HouseOwnerController(HouseOwnerService houseOwnerService){

        this.houseOwnerService = houseOwnerService;
    }

    @GetMapping
    public ResponseEntity<List<HouseOwner>> findAll() {

        return ResponseEntity.ok().body(this.houseOwnerService.findAll());
    }



    @PostMapping
    public ResponseEntity<?> create(@RequestBody HouseOwnerDTO houseOwnerDTO){
        try {
            return ResponseEntity.ok().body(houseOwnerService.create(houseOwnerDTO));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody HouseOwner houseOwner){
        try {
           HouseOwner h = houseOwnerService.update(houseOwner);
            return new ResponseEntity<>(h, HttpStatus.OK);
        } catch (UsernameNotFoundException e) {
            return new ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
        }
    }

}
