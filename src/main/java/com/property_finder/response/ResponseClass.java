package com.property_finder.response;

import javax.persistence.OneToOne;

import com.property_finder.enums.PropertyPurpose;
import com.property_finder.enums.PropertyType;

public class ResponseClass {

	private String name;
	private long ownerId;

	private PropertyType type;

	private PropertyPurpose purpose;
	private double amount;

	
	private LocationResponse location;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getOwnerId() {
		return ownerId;
	}


	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}


	public PropertyType getType() {
		return type;
	}


	public void setType(PropertyType type) {
		this.type = type;
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


	public LocationResponse getLocation() {
		return location;
	}


	public void setLocation(LocationResponse location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "ResponseClass [name=" + name + ", ownerId=" + ownerId + ", type=" + type + ", purpose=" + purpose
				+ ", amount=" + amount + ", location=" + location + "]";
	}


	public ResponseClass(String name, long ownerId, PropertyType type, PropertyPurpose purpose, double amount,
			LocationResponse location) {
		super();
		this.name = name;
		this.ownerId = ownerId;
		this.type = type;
		this.purpose = purpose;
		this.amount = amount;
		this.location = location;
	}


	public ResponseClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
