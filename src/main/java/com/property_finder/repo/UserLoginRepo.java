package com.property_finder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.property_finder.entity.UserLoginEntity;

public interface UserLoginRepo extends JpaRepository<UserLoginEntity, String> {

}
