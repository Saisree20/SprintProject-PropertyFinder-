package com.property_finder.response;

import com.property_finder.entity.PropertyArea;
import com.property_finder.entity.PropertyDistrict;
import com.property_finder.entity.PropertyState;

public class LocationResponse {
	private long locationId;
		
	private PropertyState stateId;
	
	private PropertyDistrict districtId;
	
	private PropertyArea areaId;

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public PropertyState getStateId() {
		return stateId;
	}

	public void setStateId(PropertyState stateId) {
		this.stateId = stateId;
	}

	public PropertyDistrict getDistrictId() {
		return districtId;
	}

	public void setDistrictId(PropertyDistrict districtId) {
		this.districtId = districtId;
	}

	public PropertyArea getAreaId() {
		return areaId;
	}

	public void setAreaId(PropertyArea areaId) {
		this.areaId = areaId;
	}

	@Override
	public String toString() {
		return "LocationResponse [locationId=" + locationId + ", stateId=" + stateId + ", districtId=" + districtId
				+ ", areaId=" + areaId + "]";
	}

	public LocationResponse(long locationId, PropertyState stateId, PropertyDistrict districtId, PropertyArea areaId) {
		super();
		this.locationId = locationId;
		this.stateId = stateId;
		this.districtId = districtId;
		this.areaId = areaId;
	}

	public LocationResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
