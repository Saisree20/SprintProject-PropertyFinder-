package com.property_finder.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.property_finder.entity.Property;
import com.property_finder.entity.PropertyLocation;
import com.property_finder.enums.PropertyPurpose;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Long> {
	@Query("SELECT p FROM Property p WHERE p.location = :location AND p.purpose = :purpose AND p.amount = :amount")
	List<Property> findByLocationAndPurposeAndAmount(@Param("location") PropertyLocation location, @Param("purpose") PropertyPurpose purpose, @Param("amount") double amount);
	
	@Query("SELECT p FROM Property p WHERE p.location = :location AND p.purpose = :purpose")
	List<Property> findByLocationAndPurposeAndAmount(@Param("location") PropertyLocation location, @Param("purpose") PropertyPurpose purpose);
	
}
