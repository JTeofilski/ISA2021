package com.example.backend.service;


import com.example.backend.model.other.Adventure;
import com.example.backend.model.users.User;
import com.example.backend.repository.AdventureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AdventureService {

    private AdventureRepository adventureRepository;

    @Autowired
    public AdventureService(AdventureRepository adventureRepository) {
        this.adventureRepository = adventureRepository;
    }

    public List<Adventure> findAll() {
        return adventureRepository.findAll();
    }

    public Adventure create(Adventure adventure){
        return adventureRepository.save(adventure);
    }
}
