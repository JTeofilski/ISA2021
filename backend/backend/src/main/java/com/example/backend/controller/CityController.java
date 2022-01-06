package com.example.backend.controller;

import com.example.backend.model.common.City;
import com.example.backend.model.users.User;
import com.example.backend.service.CityService;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/city", produces = MediaType.APPLICATION_JSON_VALUE)
public class CityController {

    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public ResponseEntity<List<City>> findAll() {
        return ResponseEntity.ok().body(this.cityService.findAll());
    }

    @PostMapping
    public ResponseEntity<City> create(@RequestBody City city){
        return ResponseEntity.ok().body(cityService.create(city));

    }
}
