package com.property_finder.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import com.property_finder.service.serviceImpl.PropertyServiceImpl;
@CrossOrigin
@RestController
@RequestMapping("/property")
public class PropertyController {
@Autowired
	private PropertyService service;
private static final Logger logger = LoggerFactory.getLogger(PropertyServiceImpl.class);
@PostMapping("/add")
public Property addProperty(@RequestBody Property property) {

	
	Property p=null;
	try {
		p = this.service.addProperty(property);
	} catch (NullFieldsException e) {
		// TODO Auto-generated catch block
		logger.info(e.getMessage());
	}
	return p;
}
@GetMapping("/get")
public List<Property> viewPropertyDetails() {
	List<Property> p=this.service.viewPropertyDetails();
	return p;
}
@GetMapping("/get{id}")
public Property viewPropertyById(long id) {
	Property p=null;
	try {
		p = this.service.viewPropertyById(id);
	} catch (PropertyNotFoundException e) {
		// TODO Auto-generated catch block
		logger.info(e.getMessage());
	}
	return p;
}

@PutMapping("/update/{id}")
public String updateProperty(@PathVariable("id") long id,@RequestBody Property p) {
	
	String str="";
	try {
		this.service.updateProperty(id,p);
		str="Record Updated Successfully";
	} catch (InvalidUpdationException e) {
		// TODO Auto-generated catch block
		str="Invalid Id";
		logger.info("Enter Valid Id to update the record");
	}
	return str;
}
@DeleteMapping("/delete/{id}")
public String deleteProperty(@PathVariable("id") long id)  {
	String str="";
	try {
		this.service.deleteProperty(id);
		str="Record Deleted Successfully";
	} catch (InvalidDeletionException e) {
		// TODO Auto-generated catch block
		str="Invalid Id";
		logger.info("Invalid id entered to delete");
	}
	return str;
}

}
