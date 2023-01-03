package com.property_finder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property_finder.entity.Property;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.exceptions.NullFieldsException;
import com.property_finder.exceptions.PropertyNotFoundException;
import com.property_finder.service.PropertyService;

@RestController
@RequestMapping("/property")
public class PropertyController {
@Autowired
	private PropertyService service;
@PostMapping("/add")
public Property addProperty(@RequestBody Property property) throws NullFieldsException {
//	System.out.println(property);
	Property p=this.service.addProperty(property);
	return p;
}
@GetMapping("/get")
public List<Property> viewPropertyDetails() {
	List<Property> p=this.service.viewPropertyDetails();
	return p;
}
@GetMapping("/get{id}")
public Property viewPropertyById(long id) {
	Property p=this.service.viewPropertyById(id);
	return p;
}

@PutMapping("/update/{id}")
public String updateProperty(@PathVariable("id") long id,@RequestBody Property p) throws PropertyNotFoundException, InvalidUpdationException {
	this.service.updateProperty(id,p);
	return "Record Updated Successfully";
}
@DeleteMapping("/delete/{id}")
public String deleteProperty(@PathVariable("id") long id) throws InvalidDeletionException {
	this.service.deleteProperty(id);
	return "Record Deleted Successfully";
}

}
