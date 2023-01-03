package com.property_finder.service;

import java.util.List;

import com.property_finder.entity.PropertyArea;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;


public interface PropertyAreaService {
	public PropertyArea addPropertyArea(PropertyArea p) throws NullFieldsException;
	public String updatePropertyArea(long id,PropertyArea p)throws InvalidUpdationException;
	public List<PropertyArea> getPropertyArea();
	public String deletePropertyArea(long id) throws InvalidDeletionException; 
}
