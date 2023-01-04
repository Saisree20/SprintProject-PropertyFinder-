package com.property_finder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PropertyDistrict {
	@Id
	@Column(name="district_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long districtId;
	@Column(name="district_name")
	private String name;
	
public long getDistrictId() {
	return districtId;
}
public void setDistrictId(long districtId) {
	this.districtId = districtId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "PropertyDistrict [districtId=" + districtId + ", name=" + name + "]";
}
public PropertyDistrict(long districtId, String name) {
	super();
	this.districtId = districtId;
	this.name = name;
}
public PropertyDistrict() {
	super();
	// TODO Auto-generated constructor stub
}

}
