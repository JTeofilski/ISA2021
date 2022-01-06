package com.example.backend.model.users;

import com.example.backend.model.other.Adventure;
import com.example.backend.model.other.Revision;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "instructors")
public class Instructor extends User{

    @OneToOne(fetch = FetchType.LAZY)
    private Adventure adventure;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "instructor")
    private Set<Revision> revisions = new HashSet<Revision>();

}
