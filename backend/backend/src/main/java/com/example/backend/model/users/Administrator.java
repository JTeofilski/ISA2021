package com.example.backend.model.users;

import com.example.backend.model.enums.AdminEnum;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "administrators")
@PrimaryKeyJoinColumn(name = "user_id")
public class Administrator extends User {

    @Column
    private AdminEnum adminType;
}
