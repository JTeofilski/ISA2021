package com.example.backend.model.users;

import com.example.backend.model.other.Revision;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "customers")
public class Customer extends User{

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private Set<Revision> revisions = new HashSet<Revision>();
}
