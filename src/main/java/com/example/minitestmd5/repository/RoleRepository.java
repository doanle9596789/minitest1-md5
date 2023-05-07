package com.example.minitestmd5.repository;


import com.example.minitestmd5.models.ERole;
import com.example.minitestmd5.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
