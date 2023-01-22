package com.property_finder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property_finder.entity.PropertyState;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.service.PropertyService;
import com.property_finder.service.PropertyStateService;
@CrossOrigin
@RestController
@RequestMapping("/propertyState")
public class PropertyStateController {
	@Autowired
	private PropertyStateService service;
@PostMapping("/add")
public PropertyState addPropertyState(@RequestBody PropertyState property) throws NullFieldsException {
	PropertyState pState=this.service.addPropertyState(property);
	return pState;
}
@GetMapping("/get")
public List<PropertyState> getPropertyState() {
	List<PropertyState> pStateList=this.service.getPropertyState();
	return pStateList;
}
@PutMapping("/update/{id}")
public String updatePropertyState(@PathVariable("id") long id,@RequestBody PropertyState p) throws InvalidUpdationException {
	this.service.updatePropertyState(id,p);
	return "Record Updated Successfully";
}
@DeleteMapping("/delete/{id}")
public String deletePropertyState(@PathVariable("id") long id) throws InvalidDeletionException {
	this.service.deletePropertyState(id);
	return "Record Deleted Successfully";
}
}
