package com.example.backend.repository;

import com.example.backend.model.common.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CityRepository extends JpaRepository<City, UUID> {

    @Query("SELECT city FROM City city WHERE city.country.id=?1")
    public List<City> findByCountry(UUID countryId);
}
