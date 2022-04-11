package com.example.backend.model.dto;

import com.example.backend.model.common.City;
import com.example.backend.model.common.Country;
import lombok.Data;

@Data
public class InstructorDTO {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private Country country;
    private City city;
}
