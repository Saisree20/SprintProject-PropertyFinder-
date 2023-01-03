package com.property_finder.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.PropertyDistrict;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.repo.PropertyAreaRepo;
import com.property_finder.repo.PropertyDistrictRepo;
import com.property_finder.repo.PropertyLocationRepo;
import com.property_finder.service.PropertyDistrictService;

@Service
public class PropertyDistrictServiceImpl implements PropertyDistrictService {
	@Autowired
	private PropertyDistrictRepo pdrepo;
	@Override
	public PropertyDistrict addPropertyDistrict(PropertyDistrict p) throws NullFieldsException {
		// TODO Auto-generated method stub
		PropertyDistrict pd;
		if(!p.equals(null)) {
		pd=this.pdrepo.save(p);
		}
		else
			throw new NullFieldsException("All fields must be entered");
		return pd;
	}

	@Override
	public String updatePropertyDistrict(long id, PropertyDistrict p) throws InvalidUpdationException {
		// TODO Auto-generated method stub
		if(pdrepo.existsById(p.getDistrictId())) {
			pdrepo.save(p);
			
		}
		else
			throw new InvalidUpdationException("Property District not found");
			
			return "Record Updated Successfully";
	}

	@Override
	public List<PropertyDistrict> getPropertyDistrict() {
		// TODO Auto-generated method stub
		List<PropertyDistrict> p=this.pdrepo.findAll();
		return p;
	}

	@Override
	public String deletePropertyDistrict(long id) throws InvalidDeletionException {
		// TODO Auto-generated method stub
		
		if(pdrepo.existsById(id)) {
		this.pdrepo.deleteById(id);
		}
		else {
		
			throw new InvalidDeletionException("Entered id is not present in the database");
		}
		return 	"Record deleted successfully";
	}
	
}
