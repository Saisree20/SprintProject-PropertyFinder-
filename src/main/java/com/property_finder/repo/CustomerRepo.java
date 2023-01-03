package com.property_finder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.property_finder.entity.CustomerEntity;
@Repository
public interface CustomerRepo extends JpaRepository<CustomerEntity, Long>{

}
