package com.mpb.basic.auth.backend.repository;

import com.mpb.basic.auth.backend.entity.auth.Role;
import com.mpb.basic.auth.backend.entity.type.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, UUID> {
    Optional<Role> findByName(ERole name);
}
