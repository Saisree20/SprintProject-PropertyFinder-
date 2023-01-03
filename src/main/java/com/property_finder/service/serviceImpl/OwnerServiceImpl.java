package com.property_finder.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.OwnerEntity;
import com.property_finder.entity.Property;
import com.property_finder.entity.PropertyLocation;
import com.property_finder.enums.PropertyPurpose;
import com.property_finder.repo.OwnerRepo;
import com.property_finder.repo.PropertyRepo;
import com.property_finder.service.OwnerService;
@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	private OwnerRepo ownerRepo;
	@Autowired
	private PropertyRepo propertyRepo;
	 
	@Override
	public String updateOwner(long Ownerid, OwnerEntity ownerentity) {
		// TODO Auto-generated method stub
		OwnerEntity oe=new OwnerEntity();
        oe.setOwnerid(Ownerid);
        oe.setOwnername(ownerentity.getOwnername());

        this.ownerRepo.save(oe);
        return "update sucessfully";
	}

	@Override
	public List<OwnerEntity> viewOwner() {
		// TODO Auto-generated method stub
		 List<OwnerEntity> list=this.ownerRepo.findAll();
	        return list;
	}

	@Override
	public OwnerEntity createOwner(OwnerEntity owner) {
		// TODO Auto-generated method stub
		 return ownerRepo.save(owner);
	}

	@Override
	public String deleteOwner(long ownerid) {
		// TODO Auto-generated method stub
		this.ownerRepo.deleteById(ownerid);
        return "entity deleted"+ownerid;
	}
	
	@Override
	public List<Property> checkProperty(PropertyLocation propertyLocation, PropertyPurpose purpose) {
		// TODO Auto-generated method stub
		List<Property> allProperty=propertyRepo.findAll();
		List<Property> p=allProperty.stream().filter((x->x.getLocation().equals(propertyLocation)&&x.getPurpose().equals(purpose))).collect(Collectors.toList());

		        return p;
	}

	@Override
	public Property getPropertyDetails(long propertyId) {
		// TODO Auto-generated method stub
		 Property p=propertyRepo.findById(propertyId).get();
	        return p;
	}
	
	
	
	

}
