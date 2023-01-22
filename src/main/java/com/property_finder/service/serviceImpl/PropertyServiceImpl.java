package com.property_finder.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.Property;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.repo.PropertyAreaRepo;
import com.property_finder.repo.PropertyDistrictRepo;
import com.property_finder.repo.PropertyLocationRepo;
import com.property_finder.repo.PropertyRepo;
import com.property_finder.repo.PropertyStateRepo;
import com.property_finder.response.LocationResponse;
import com.property_finder.response.ResponseClass;
import com.property_finder.service.PropertyService;



@Service
public class PropertyServiceImpl implements PropertyService{
@Autowired
private PropertyRepo propertyRepo;
@Autowired
private PropertyLocationRepo propertyLocationRepo;
@Autowired
private PropertyAreaRepo propertyAreaRepo;
@Autowired
private PropertyDistrictRepo propertyDistrictRepo;
@Autowired
private PropertyStateRepo propertyStateRepo;
private static final Logger logger = LoggerFactory.getLogger(PropertyServiceImpl.class);
	@Override
	public Property addProperty(Property p) throws NullFieldsException {
		// TODO Auto-generated method stub
		Property property=null;
		
		if(!p.equals(null)) {
			
		this.propertyLocationRepo.save(p.getLocation());
		property=this.propertyRepo.save(p);
		}
		else {
			throw new NullFieldsException("All fields must be filled");
		}
		
		
			
		return property;
	}

	@Override
	public String updateProperty(long id,Property p) throws InvalidUpdationException {
		// TODO Auto-generated method stub
		String str="";
		if(propertyRepo.existsById(p.getId())) {
			propertyRepo.save(p);
			str="Record Updated Successfully";
		}
		else {
			str="Invalid id";
			throw new InvalidUpdationException("Property not found");
		}
			return str;
	}

	@Override
	public String deleteProperty(long id) throws InvalidDeletionException {
		// TODO Auto-generated method stub
		String str="";
		if(propertyRepo.existsById(id)) {
		this.propertyRepo.deleteById(id);
		str="Record deleted successfully";
		}
		else {
			str="Invalid Deletion";
			throw new InvalidDeletionException("Entered id does not exist in the record");
		}
		return str;
	}

	@Override
	public List<Property> viewPropertyDetails() {
		// TODO Auto-generated method stub
		List<Property> p=this.propertyRepo.findAll();
		return p;
	}

	@Override
	public Property viewPropertyById(long id) throws PropertyNotFoundException{
		// TODO Auto-generated method stub
		Property property=null;
		if(propertyRepo.existsById(id)) {
		property=propertyRepo.findById(id).get();
		}
		else
			throw new PropertyNotFoundException("Invalid Deletion");
		return property;
	}

}
