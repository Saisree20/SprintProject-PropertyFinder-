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

import com.property_finder.entity.OwnerEntity;
import com.property_finder.entity.Property;
import com.property_finder.entity.PropertyDTO;
import com.property_finder.entity.PropertyOwnerDTO;
import com.property_finder.service.OwnerService;
@RestController
@RequestMapping("/owner")
public class OwnerController {
	
	@Autowired
    private OwnerService ownerService;

 
	
	@PutMapping("/update/{id}")
    public String updateOwner(@PathVariable("id")long Ownerid,@RequestBody OwnerEntity ownerentity) {
        // TODO Auto-generated method stub
		ownerService.updateOwner(Ownerid,ownerentity);
        return "update sucessfully";
    }
	@GetMapping("/view")
    public List<OwnerEntity> viewOwner() {
        // TODO Auto-generated method stub
        List<OwnerEntity> list=ownerService.viewOwner();
        return list;
    }
	@PostMapping("/add")
    public OwnerEntity createOwner( @RequestBody OwnerEntity owner) {
        // TODO Auto-generated method stub
        OwnerEntity o=ownerService.createOwner(owner);
        return o;
    }
	@DeleteMapping("delete/{id}")
    public String deleteOwner(@PathVariable("id") long ownerid) {
        // TODO Auto-generated method stub
        this.ownerService.deleteOwner(ownerid);
        return "entity deleted"+ownerid;
    }
	
	 @PostMapping("/checkProperty")
	    public List<Property> checkProperty(@RequestBody PropertyOwnerDTO dto)
	     {
	        // TODO Auto-generated method stub
	        List<Property> allProperty=ownerService.checkProperty(dto.getLocation(),dto.getPurpose());
	       // List<Property> p=allProperty.stream().filter((x->x.getLocation().equals(dto.getLocation())&&x.getPurpose().equals(dto.getPurpose())&&x.getAmount()==dto.getAmount())).collect(Collectors.toList());
	        return allProperty;
	    }
	    
	    @GetMapping("/get/{id}")
	    public Property getPropertyDetails(@PathVariable("id") long propertyId) {
	        // TODO Auto-generated method stub
	        Property p=ownerService.getPropertyDetails(propertyId);
	        return p;
	    }
	
	
	
}

