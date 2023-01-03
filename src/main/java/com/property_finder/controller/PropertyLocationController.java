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

import com.property_finder.entity.PropertyLocation;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.service.PropertyLocationService;
import com.property_finder.service.PropertyService;

@RestController
@RequestMapping("/propertyLocation")
public class PropertyLocationController {
	@Autowired
	private PropertyLocationService service;
@PostMapping("/add")
public PropertyLocation addPropertyLocation(@RequestBody PropertyLocation property) throws NullFieldsException {
	PropertyLocation p=this.service.addPropertyLocation(property);
	return p;
}
@GetMapping("/get")
public List<PropertyLocation> getPropertyLocation() {
	List<PropertyLocation> p=this.service.getPropertyLocation();
	return p;
}
@PutMapping("/update/{id}")
public String updatePropertyLocation(@PathVariable("id") long id,@RequestBody PropertyLocation p) throws PropertyNotFoundException, InvalidUpdationException {
	this.service.updatePropertyLocation(id,p);
	return "Record Updated Successfully";
}
@DeleteMapping("/delete/{id}")
public String deletePropertyLocation(@PathVariable("id") long id) throws InvalidDeletionException {
	this.service.deletePropertyLocation(id);
	return "Record Deleted Successfully";
}
}
