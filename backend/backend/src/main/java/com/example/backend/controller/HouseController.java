package com.example.backend.controller;

import com.example.backend.model.common.City;
import com.example.backend.model.other.House;
import com.example.backend.model.users.User;
import com.example.backend.service.HouseService;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/house", produces = MediaType.APPLICATION_JSON_VALUE)
public class HouseController {

    @Autowired
    private HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    public ResponseEntity<List<House>> findAll() {
       // System.out.println("Usao u kontroler");
        return ResponseEntity.ok().body(this.houseService.findAll());
    }

    @GetMapping("/{houseId}")
    public House findById(@PathVariable UUID houseId){
        System.out.println("Usao u kontroler");
       return this.houseService.findById(houseId);

    }


    @PostMapping
    public ResponseEntity<House> create(@RequestBody House house){
        return ResponseEntity.ok().body(houseService.create(house));

    }
}
