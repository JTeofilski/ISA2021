package com.example.backend.model.users;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customers")
public class Customer extends User{

    private Integer points;
}
