package com.property_finder.service;

import java.util.List;

import com.property_finder.entity.CustomerEntity;
import com.property_finder.entity.Property;
import com.property_finder.entity.PropertyLocation;
import com.property_finder.enums.PropertyPurpose;
import com.property_finder.entity.CustomerEntity;

public interface CustomerService {

    public String updateCustomer(long Customerid,CustomerEntity customer);
    public List<CustomerEntity> viewCustomer();
    public CustomerEntity createCustomer(CustomerEntity customer);
    public String deleteCustomer(long customerid);

    public List<Property> checkProperty(PropertyLocation propertyLocation,PropertyPurpose purpose,double budgetAmount);
    public Property getPropertyDetails(long propertyId);

     

}