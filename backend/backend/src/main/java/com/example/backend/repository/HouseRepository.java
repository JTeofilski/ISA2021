package com.example.backend.repository;

import com.example.backend.model.common.City;
import com.example.backend.model.other.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface HouseRepository extends JpaRepository<House, UUID> {


}
