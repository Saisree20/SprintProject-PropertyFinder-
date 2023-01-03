package com.property_finder.service;

import java.util.List;

import com.property_finder.entity.PropertyState;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;


public interface PropertyStateService {
	public PropertyState addPropertyState(PropertyState p)throws NullFieldsException;
	public String updatePropertyState(long id,PropertyState p)throws InvalidUpdationException;
	public List<PropertyState> getPropertyState();
	public String deletePropertyState(long id) throws InvalidDeletionException; 
}
