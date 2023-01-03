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

import com.property_finder.entity.PropertyArea;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.service.PropertyAreaService;

@RestController
@RequestMapping("/propertyArea")
public class PropertyAreaController {
	@Autowired
	private PropertyAreaService service;
@PostMapping("/add")
public PropertyArea addPropertyState(@RequestBody PropertyArea property) throws NullFieldsException {
	PropertyArea pArea=this.service.addPropertyArea(property);
	return pArea;
}
@GetMapping("/get")
public List<PropertyArea> getPropertyArea() {
	List<PropertyArea> pAreaList=this.service.getPropertyArea();
	return pAreaList;
}
@PutMapping("/update/{id}")
public String updatePropertyArea(@PathVariable("id") long id,@RequestBody PropertyArea p) throws PropertyNotFoundException, InvalidUpdationException {
	this.service.updatePropertyArea(id,p);
	return "Record Updated Successfully";
}
@DeleteMapping("/delete/{id}")
public String deletePropertyArea(@PathVariable("id") long id) throws InvalidDeletionException {
	this.service.deletePropertyArea(id);
	return "Record Deleted Successfully";
}
}
