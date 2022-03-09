package com.example.backend.service;

import com.example.backend.model.common.City;
import com.example.backend.model.users.User;
import com.example.backend.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public City create(City city){
        return cityRepository.save(city);
    }

    public List<City> findAllByCountry(UUID countryId) {
        return cityRepository.findByCountry(countryId);
    }


}
