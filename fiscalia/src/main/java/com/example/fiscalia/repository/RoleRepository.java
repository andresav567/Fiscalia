package com.example.fiscalia.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fiscalia.model.UserRole;


@Repository
public interface RoleRepository  extends JpaRepository<UserRole, Integer>{

}
