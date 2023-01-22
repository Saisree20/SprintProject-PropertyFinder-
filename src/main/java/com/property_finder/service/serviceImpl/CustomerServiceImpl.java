package com.property_finder.service.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.CustomerEntity;
import com.property_finder.entity.Property;
import com.property_finder.entity.PropertyLocation;
import com.property_finder.enums.PropertyPurpose;
import com.property_finder.repo.CustomerRepo;
import com.property_finder.repo.PropertyRepo;
import com.property_finder.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private PropertyRepo propertyRepo;

	@Override
	public String updateCustomer(long Customerid, CustomerEntity customer) {
		// TODO Auto-generated method stub
		
		CustomerEntity oe=new CustomerEntity();
	    oe.setCustomerid(Customerid);
	    oe.setCustomername(customer.getCustomername());
	    this.customerRepo.save(oe);
	    return "update successfully";
	}

	@Override
	public List<CustomerEntity> viewCustomer() {
		// TODO Auto-generated method stub
		 List<CustomerEntity> list=this.customerRepo.findAll();
		    return list;
	}

	@Override
	public CustomerEntity createCustomer(CustomerEntity customer) {
		// TODO Auto-generated method stub
		return customerRepo.save(customer);
	}

	@Override
	public String deleteCustomer(long customerid) {
		// TODO Auto-generated method stub
		  this.customerRepo.deleteById(customerid);
		    return "entity deleted"+customerid;
	}

	@Override
	public List<Property> checkProperty(PropertyLocation propertyLocation, PropertyPurpose purpose,
			double budgetAmount) {
		// TODO Auto-generated method stub
		    return propertyRepo.findByLocationAndPurposeAndAmount(propertyLocation, purpose, budgetAmount);
	}

	@Override
	public Property getPropertyDetails(long propertyId) {
		// TODO Auto-generated method stub
		 Property p=propertyRepo.findById(propertyId).get();
	        return p;
	}

}
