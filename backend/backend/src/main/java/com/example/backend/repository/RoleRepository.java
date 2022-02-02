package com.example.backend.repository;

import com.example.backend.model.users.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {

    public Role getRoleByRoleName(String roleName);
}
