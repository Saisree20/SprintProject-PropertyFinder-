package com.property_finder.service;

import java.util.List;

import com.property_finder.entity.PropertyDistrict;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;

public interface PropertyDistrictService {
	public PropertyDistrict addPropertyDistrict(PropertyDistrict p)throws NullFieldsException;
	public String updatePropertyDistrict(long id,PropertyDistrict p) throws InvalidUpdationException;
	public List<PropertyDistrict> getPropertyDistrict();
	public String deletePropertyDistrict(long id) throws InvalidDeletionException; 
}
