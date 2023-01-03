package com.property_finder.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class PropertyLocation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long locationId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="state_id")
private PropertyState state;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="district_id")
private PropertyDistrict district;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="area_id")
private PropertyArea area;
	public long getLocationId() {
		return locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
	public PropertyState getState() {
		return state;
	}
	public void setState(PropertyState state) {
		this.state = state;
	}
	public PropertyDistrict getDistrict() {
		return district;
	}
	public void setDistrict(PropertyDistrict district) {
		this.district = district;
	}
	public PropertyArea getArea() {
		return area;
	}
	public void setArea(PropertyArea area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "PropertyLocation [locationId=" + locationId + ", state=" + state + ", district=" + district + ", area="
				+ area + "]";
	}
	public PropertyLocation(long locationId, PropertyState state, PropertyDistrict district, PropertyArea area) {
		super();
		this.locationId = locationId;
		this.state = state;
		this.district = district;
		this.area = area;
	}
	public PropertyLocation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	
////@OneToOne(mappedBy = "stateId")	
//private long stateId;
////@OneToOne(mappedBy = "districtId")
//private long districtId;
////@OneToOne(mappedBy = "areaId")
//private long areaId;
//////@ManyToOne
//////private Property property;
////@OneToMany(mappedBy = "location")
////private List<Property> property;
	
	
	
public long getLocationId() {
	return locationId;
}
public void setLocationId(long locationId) {
	this.locationId = locationId;
}
public long getStateId() {
	return stateId;
}
public void setStateId(long stateId) {
	this.stateId = stateId;
}
public long getDistrictId() {
	return districtId;
}
public void setDistrictId(long districtId) {
	this.districtId = districtId;
}
public long getAreaId() {
	return areaId;
}
public void setAreaId(long areaId) {
	this.areaId = areaId;
}
public PropertyLocation(long locationId, long stateId, long districtId, long areaId) {
	super();
	this.locationId = locationId;
	this.stateId = stateId;
	this.districtId = districtId;
	this.areaId = areaId;
}
public PropertyLocation() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "PropertyLocation [locationId=" + locationId + ", stateId=" + stateId + ", districtId=" + districtId
			+ ", areaId=" + areaId + "]";
}
*/
}
