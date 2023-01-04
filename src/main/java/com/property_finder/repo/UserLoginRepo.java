package com.property_finder.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property_finder.entity.UserLoginEntity;
@Repository
public interface UserLoginRepo extends JpaRepository<UserLoginEntity, Long> {
public Optional<UserLoginEntity> findByUsernameAndPassword(String username,String password);
}
