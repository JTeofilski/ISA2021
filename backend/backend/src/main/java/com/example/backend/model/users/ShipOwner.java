package com.example.backend.model.users;

import com.example.backend.model.other.Revision;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "ship_owners")
// nna foru housewnera
public class ShipOwner extends User {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "shipOwner")
    private Set<Revision> revisions = new HashSet<Revision>();
}
