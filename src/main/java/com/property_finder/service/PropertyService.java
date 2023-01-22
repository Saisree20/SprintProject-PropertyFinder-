package com.property_finder.service;

import java.util.List;

import com.property_finder.entity.Property;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.response.ResponseClass;

public interface PropertyService {
public Property addProperty(Property p)throws NullFieldsException;
public String updateProperty(long id,Property p) throws InvalidUpdationException;
public List<Property> viewPropertyDetails();
public String deleteProperty(long id)throws InvalidDeletionException; 
public Property viewPropertyById(long id)throws PropertyNotFoundException;
}
