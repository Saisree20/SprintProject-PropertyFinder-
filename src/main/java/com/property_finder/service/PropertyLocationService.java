package com.property_finder.service;


import java.util.List;

import com.property_finder.entity.PropertyLocation;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.response.LocationResponse;
import com.property_finder.response.ResponseClass;

public interface PropertyLocationService {
	public PropertyLocation addPropertyLocation(PropertyLocation p) throws NullFieldsException;
	public String updatePropertyLocation(long id,PropertyLocation p) throws InvalidUpdationException;
	public List<PropertyLocation> getPropertyLocation();
	public String deletePropertyLocation(long id) throws InvalidDeletionException; 
}
