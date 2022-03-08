package com.example.backend.model.dto;

import com.example.backend.model.common.Address;
import com.example.backend.model.common.City;
import com.example.backend.model.common.Country;

public class UserDTO {
   private String email;
   private String password;
   private  String checkPassword;
   private String firstName;
   private String lastName;
   private String phoneNumber;
   private Address address;
   private Country country;
   private City city;
}
