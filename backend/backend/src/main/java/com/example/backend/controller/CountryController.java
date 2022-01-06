package com.example.backend.controller;

import com.example.backend.model.common.Country;
import com.example.backend.model.users.User;
import com.example.backend.service.CountryService;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/country", produces = MediaType.APPLICATION_JSON_VALUE)
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public ResponseEntity<List<Country>> findAll() {
        return ResponseEntity.ok().body(this.countryService.findAll());
    }

    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country){
        return ResponseEntity.ok().body(countryService.create(country));

    }
}
