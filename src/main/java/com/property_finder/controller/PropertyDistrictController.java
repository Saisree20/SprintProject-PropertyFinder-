package com.property_finder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property_finder.entity.PropertyDistrict;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.service.PropertyAreaService;
import com.property_finder.service.PropertyDistrictService;

@RestController
@RequestMapping("/propertyDistrict")
public class PropertyDistrictController {
	@Autowired
	private PropertyDistrictService service;
@PostMapping("/add")
public PropertyDistrict addPropertyState(@RequestBody PropertyDistrict property) throws NullFieldsException {
	PropertyDistrict pDistrict=this.service.addPropertyDistrict(property);
	return pDistrict;
}
@GetMapping("/get")
public List<PropertyDistrict> getPropertyDistrict() {
	List<PropertyDistrict> pDistrictList=this.service.getPropertyDistrict();
	return pDistrictList;
}
@PutMapping("/update/{id}")
public String updatePropertyDistrict(@PathVariable("id") long id,@RequestBody PropertyDistrict p) throws PropertyNotFoundException, InvalidUpdationException {
	this.service.updatePropertyDistrict(id,p);
	return "Record Updated Successfully";
}
@DeleteMapping("/delete/{id}")
public String deletePropertyDistrict(@PathVariable("id") long id) throws InvalidDeletionException {
	this.service.deletePropertyDistrict(id);
	return "Record Deleted Successfully";
}
}

