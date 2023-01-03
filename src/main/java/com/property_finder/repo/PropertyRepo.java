package com.property_finder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property_finder.entity.Property;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Long> {

}
