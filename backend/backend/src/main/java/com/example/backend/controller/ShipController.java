package com.example.backend.controller;

import com.example.backend.model.other.House;
import com.example.backend.model.other.Ship;
import com.example.backend.model.users.User;
import com.example.backend.service.ShipService;
import com.example.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/ship", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShipController {

    private ShipService shipService;

    @Autowired
    public ShipController(ShipService shipService) {
        this.shipService = shipService;
    }

    @GetMapping
    public ResponseEntity<List<Ship>> findAll() {
        return ResponseEntity.ok().body(this.shipService.findAll());
    }

    @PostMapping
    public ResponseEntity<Ship> create(@RequestBody Ship ship){
        return ResponseEntity.ok().body(shipService.create(ship));

    }
}
