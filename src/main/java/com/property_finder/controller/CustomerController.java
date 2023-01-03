package com.property_finder.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property_finder.entity.CustomerEntity;
import com.property_finder.entity.Property;
import com.property_finder.entity.PropertyDTO;
import com.property_finder.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
    private CustomerService service;
	@Autowired
	private CustomerService customerService;	
    @PutMapping("/update/{id}")
    public String updateCustomer(@PathVariable("id")long customerId,@RequestBody CustomerEntity entity) {
        // TODO Auto-generated method stub
    	service.updateCustomer(customerId,entity);
        return "update sucessfully";
    }
    @GetMapping("/view")
    public List<CustomerEntity> viewCustomer(){
        List<CustomerEntity> list=service.viewCustomer();
        return list;

    }
    @PostMapping("/add")
    public CustomerEntity createCustomer(@RequestBody CustomerEntity customer) {
        CustomerEntity o=service.createCustomer(customer);
        return o;
    }
    @DeleteMapping("delete/{id}")
    public String deleteCustomer(@PathVariable("id") long customerid) {
        this.service.deleteCustomer(customerid);
        return "entity deleted"+customerid;
    }
    
    @RequestMapping("/checkProperty")
    public List<Property> checkProperty(@RequestBody PropertyDTO dto)
     {
        // TODO Auto-generated method stub
        List<Property> allProperty=customerService.checkProperty(dto.getLocation(),dto.getPurpose(),dto.getAmount());
       // List<Property> p=allProperty.stream().filter((x->x.getLocation().equals(dto.getLocation())&&x.getPurpose().equals(dto.getPurpose())&&x.getAmount()==dto.getAmount())).collect(Collectors.toList());
        return allProperty;
    }
    
    @GetMapping("/get/{id}")
    public Property getPropertyDetails(@PathVariable("id") long propertyId) {
        // TODO Auto-generated method stub
        Property p=customerService.getPropertyDetails(propertyId);
        return p;
    }
    
    
}

