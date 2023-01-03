package com.property_finder.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

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
	//ArrayList<Property> ar=new ArrayList<Property>();
	@Override
	public Property addProperty(Property p) throws NullFieldsException {
		// TODO Auto-generated method stub
		//ar.add(p);
		Property property;
		if(!p.equals(null)) {
		this.propertyLocationRepo.save(p.getLocation());
		property=this.propertyRepo.save(p);
		}
		else {
			throw new NullFieldsException("All fields must be filled");
		}
		
		//this.propertyLocationRepo.findById(property.getLocation());
		//------------------------------------------------------------------
		
//		PropertyArea propertyArea = this.propertyAreaRepo.findById(property.getLocation().getAreaId()).get();
//		
//		PropertyState propertyState = this.propertyStateRepo.findById(property.getLocation().getStateId()).get();
//		
//		PropertyDistrict propertyDistrict = this.propertyDistrictRepo.findById(property.getLocation().getDistrictId()).get();
//		
//		LocationResponse lr=new LocationResponse();
//		lr.setLocationId(property.getLocation().getLocationId());
//		lr.setAreaId(propertyArea);
//		lr.setDistrictId(propertyDistrict);
//		lr.setStateId(propertyState);
//		ResponseClass rc=new ResponseClass();
//		rc.setAmount(property.getAmount());
//		rc.setLocation(lr);
//		rc.setName(property.getName());
//		rc.setOwnerId(property.getOwnerId());
//		rc.setPurpose(property.getPurpose());
//		rc.setType(property.getType());
//		return rc;
		//--------------------------------------------------------------------------
//		this.propertyLocationRepo.save(p.getLocation());
//		
//		PropertyArea pa=this.propertyAreaRepo.findById(p.getLocation().getAreaId()).get();
//		PropertyArea pArea=this.propertyAreaRepo.save(pa);
//		
//		PropertyDistrict pd=this.propertyDistrictRepo.getById(p.getLocation().getDistrictId());
//		PropertyDistrict pDistrict=this.propertyDistrictRepo.save(pd);
//		
//		PropertyState ps=this.propertyStateRepo.getById(p.getLocation().getDistrictId());
//		PropertyState pState=this.propertyStateRepo.save(ps);
		
//		PropertyDistrict pd=this.propertyDistrictRepo.getById(p.getLocation().getDistrictId());
//		PropertyDistrict pDistrict=this.propertyDistrictRepo.save(pd);
			
		return property;
	}

	@Override
	public String updateProperty(long id,Property p) throws InvalidUpdationException {
		// TODO Auto-generated method stub
//		Property prop=this.propertyRepo.getById(id);
//		prop.setAmount(p.getAmount());
//		prop.setName(p.getName());
//		prop.setOwnerId(p.getOwnerId());
//		prop.setPurpose(p.getPurpose());
//		prop.setType(p.getType());
//		this.propertyRepo.save(prop);
//		return "Record Updated Successfully";
		if(propertyRepo.existsById(p.getId())) {
			propertyRepo.save(p);
			
		}
		else
			throw new InvalidUpdationException("Property not found");
			
			return "Record Updated Successfully";
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
	public Property viewPropertyById(long id) {
		// TODO Auto-generated method stub
		Property property=propertyRepo.findById(id).get();
		return property;
	}

}
