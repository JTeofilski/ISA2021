package com.example.backend.controller;

import com.example.backend.model.users.Customer;
import com.example.backend.model.users.HouseOwner;
import com.example.backend.model.users.Instructor;
import com.example.backend.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/instructor", produces = MediaType.APPLICATION_JSON_VALUE)
public class InstructorController {

    final private InstructorService instructorService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Instructor instructor){
        try {
            return ResponseEntity.ok().body(instructorService.create(instructor));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }
}
