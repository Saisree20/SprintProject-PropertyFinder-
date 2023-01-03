package com.property_finder.entity;

import com.property_finder.enums.PropertyPurpose;

public class PropertyDTO {

	private PropertyLocation location;
	private PropertyPurpose purpose;
	private double amount;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "PropertyDTO [location=" + location + ", purpose=" + purpose + ", amount=" + amount + "]";
	}
	public PropertyDTO(PropertyLocation location, PropertyPurpose purpose, double amount) {
		super();
		this.location = location;
		this.purpose = purpose;
		this.amount = amount;
	}
	public PropertyDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
