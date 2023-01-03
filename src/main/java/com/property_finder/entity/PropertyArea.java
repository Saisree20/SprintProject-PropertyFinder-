package com.property_finder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CollectionId;

@Entity
public class PropertyArea {
	@Id
	@Column(name="area_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long areaId;
	@Column(name="area_name")
private String name;
public long getAreaId() {
	return areaId;
}
public void setAreaId(long areaId) {
	this.areaId = areaId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "PropertyArea [areaId=" + areaId + ", name=" + name + "]";
}
public PropertyArea(long areaId, String name) {
	super();
	this.areaId = areaId;
	this.name = name;
}
public PropertyArea() {
	super();
	// TODO Auto-generated constructor stub
}

}
