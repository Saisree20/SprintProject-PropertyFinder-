package com.property_finder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionId;

@Entity

public class PropertyState {
	@Id
	@Column(name="state_id")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
private long stateId;
	@Column(name="state_name")
private String name;
public long getStateId() {
	return stateId;
}
public void setStateId(long stateId) {
	this.stateId = stateId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PropertyState(long stateId, String name) {
	super();
	this.stateId = stateId;
	this.name = name;
}
public PropertyState() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PropertyState [stateId=" + stateId + ", name=" + name + "]";
}

}
