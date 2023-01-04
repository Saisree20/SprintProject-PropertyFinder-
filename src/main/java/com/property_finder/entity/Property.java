package com.property_finder.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.property_finder.enums.PropertyPurpose;
import com.property_finder.enums.PropertyType;

@Entity
public class Property {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String name;
private long ownerId;
private PropertyType type;
private PropertyPurpose purpose;
private double amount;

@OneToOne(cascade = CascadeType.ALL)
private PropertyLocation location;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
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
public PropertyLocation getLocation() {
	return location;
}
public void setLocation(PropertyLocation location) {
	this.location = location;
}
@Override
public String toString() {
	return "Property [id=" + id + ", name=" + name + ", ownerId=" + ownerId + ", type=" + type + ", purpose=" + purpose
			+ ", amount=" + amount + ", location=" + location + "]";
}
public Property(long id, String name, long ownerId, PropertyType type, PropertyPurpose purpose, double amount,
		PropertyLocation location) {
	super();
	this.id = id;
	this.name = name;
	this.ownerId = ownerId;
	this.type = type;
	this.purpose = purpose;
	this.amount = amount;
	this.location = location;
}
public Property() {
	super();
	// TODO Auto-generated constructor stub
}

}
