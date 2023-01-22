package com.property_finder.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.PropertyArea;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.repo.PropertyAreaRepo;
import com.property_finder.repo.PropertyStateRepo;
import com.property_finder.service.PropertyAreaService;

@Service
public class PropertyAreaServiceImpl implements PropertyAreaService{
	@Autowired
	private PropertyAreaRepo parepo;
	@Override
	public PropertyArea addPropertyArea(PropertyArea p) throws NullFieldsException {
		// TODO Auto-generated method stub
		PropertyArea pa;
		
		if(!p.equals(null)) {
		pa=this.parepo.save(p);
		
		}
		else {
			throw new NullFieldsException("All fields must be entered");
		}
		
		
		return pa;
	}

	@Override
	public String updatePropertyArea(long id, PropertyArea p) throws InvalidUpdationException {
		// TODO Auto-generated method stub
		try {
		if(parepo.existsById(p.getAreaId())) {
			parepo.save(p);
			
		}
		else
			throw new InvalidUpdationException("Property Area not found");
		}catch(InvalidUpdationException e) {
			return e.getMessage();
		}
			
			return "Record Updated Successfully";
	}

	@Override
	public List<PropertyArea> getPropertyArea() {
		// TODO Auto-generated method stub
		List<PropertyArea> p=this.parepo.findAll();
		return p;
	}

	@Override
	public String deletePropertyArea(long id) throws InvalidDeletionException {
		// TODO Auto-generated method stub
		String str="";
		if(parepo.existsById(id)) {
		this.parepo.deleteById(id);
		str="Record deleted successfully";
		}
		else
		{
			str="Invalid Deletion";
			throw new InvalidDeletionException("Entered Id is not present in the database");
		
		}
		return str;
	}

}
