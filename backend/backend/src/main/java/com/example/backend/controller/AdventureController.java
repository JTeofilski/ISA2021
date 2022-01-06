package com.example.backend.controller;

import com.example.backend.model.other.Adventure;
import com.example.backend.model.users.User;
import com.example.backend.service.AdventureService;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/adventure", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdventureController {

    private AdventureService adventureService;

    @Autowired
    public AdventureController(AdventureService adventureService) {
        this.adventureService = adventureService;
    }

    @GetMapping
    public ResponseEntity<List<Adventure>> findAll() {
        return ResponseEntity.ok().body(this.adventureService.findAll());
    }

    @PostMapping
    public ResponseEntity<Adventure> create(@RequestBody Adventure adventure){
        return ResponseEntity.ok().body(adventureService.create(adventure));

    }
}
