package com.example.backend.model.users;

import com.example.backend.model.other.House;
import com.example.backend.model.other.Revision;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "house_owners")
public class HouseOwner extends User {

    @OneToOne(fetch = FetchType.LAZY)
    private House house;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "houseOwner")
    private Set<Revision> revisions = new HashSet<Revision>();
}
