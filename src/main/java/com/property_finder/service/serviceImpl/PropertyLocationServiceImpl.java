package com.property_finder.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.PropertyLocation;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.repo.PropertyLocationRepo;
import com.property_finder.service.PropertyLocationService;

@Service
public class PropertyLocationServiceImpl implements PropertyLocationService {

	@Autowired
	private PropertyLocationRepo plrepo;
	@Override
	public PropertyLocation addPropertyLocation(PropertyLocation p) throws NullFieldsException {
		// TODO Auto-generated method stub
		PropertyLocation pl;
		
		if(!p.equals(null)) {
	 pl=this.plrepo.save(p);
		}
		else {
			throw new NullFieldsException("All fields must be filled");
		}
		return pl;
	}

	@Override
	public String updatePropertyLocation(long id, PropertyLocation p) throws InvalidUpdationException {
		// TODO Auto-generated method stub
if(plrepo.existsById(p.getLocationId())) {
	plrepo.save(p);
	
}
else
	throw new InvalidUpdationException("Property location not found");
	
	return "Record Updated Successfully";
}

	@Override
	public List<PropertyLocation> getPropertyLocation() {
		// TODO Auto-generated method stub
		List<PropertyLocation> p=this.plrepo.findAll();
		return p;
		//return null;
	}

	@Override
	public String deletePropertyLocation(long id) throws InvalidDeletionException {
		String str="";
		// TODO Auto-generated method stub
		if(plrepo.existsById(id)) {
		this.plrepo.deleteById(id);
	str="Record deleted successfully";
		}
		else {
			str="Invalid Deletion";
			throw new InvalidDeletionException("The Entered id is not present in the record");
		}
			return str;
	}

}
