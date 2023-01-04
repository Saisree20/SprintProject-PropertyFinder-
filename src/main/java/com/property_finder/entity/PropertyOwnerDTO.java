package com.property_finder.entity;

import com.property_finder.enums.PropertyPurpose;

public class PropertyOwnerDTO {
	
	private PropertyLocation location;
	private PropertyPurpose purpose;
	
	public PropertyLocation getLocation() {
		return location;
	}
	public void setLocation(PropertyLocation location) {
		this.location = location;
	}
	public PropertyPurpose getPurpose() {
		return purpose;
	}
	public void setPurpose(PropertyPurpose purpose) {
		this.purpose = purpose;
	}
	@Override
	public String toString() {
		return "PropertyOwnerDTO [location=" + location + ", purpose=" + purpose + "]";
	}
	public PropertyOwnerDTO(PropertyLocation location, PropertyPurpose purpose) {
		super();
		this.location = location;
		this.purpose = purpose;
	}
	public PropertyOwnerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
