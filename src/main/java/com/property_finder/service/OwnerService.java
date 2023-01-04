package com.property_finder.service;

import java.util.List;

import com.property_finder.entity.OwnerEntity;
import com.property_finder.entity.Property;
import com.property_finder.entity.PropertyLocation;
import com.property_finder.enums.PropertyPurpose;

public interface OwnerService {
		public String updateOwner(long Ownerid,OwnerEntity ownerentity);
	    public List<OwnerEntity> viewOwner();
	    public OwnerEntity createOwner(OwnerEntity owner);
	    public String deleteOwner(long ownerid);
	    public List<Property> checkProperty(PropertyLocation propertyLocation,PropertyPurpose purpose);
	    public Property getPropertyDetails(long propertyId);

	 
}
