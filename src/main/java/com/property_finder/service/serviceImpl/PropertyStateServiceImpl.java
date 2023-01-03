package com.property_finder.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.PropertyState;
import com.property_finder.exceptions.InvalidDeletionException;
import com.property_finder.exceptions.InvalidUpdationException;
import com.property_finder.repo.PropertyLocationRepo;
import com.property_finder.repo.PropertyStateRepo;
import com.property_finder.service.PropertyStateService;

@Service
public class PropertyStateServiceImpl implements PropertyStateService{
	@Autowired
	private PropertyStateRepo psrepo;
	@Override
	public String updatePropertyState(long id, PropertyState p) throws InvalidUpdationException {
		// TODO Auto-generated method stub
		if(psrepo.existsById(p.getStateId()))
			psrepo.save(p);
		else 
			throw new InvalidUpdationException("Property State not found");
		return "Record Updated Successfully";
	}

	@Override
	public List<PropertyState> getPropertyState() {
		// TODO Auto-generated method stub
		List<PropertyState> p=this.psrepo.findAll();
		return p;
	}

	@Override
	public String deletePropertyState(long id)throws InvalidDeletionException {
		// TODO Auto-generated method stub
		String str="";
		if(psrepo.existsById(id)) {
		this.psrepo.deleteById(id);
		str="Record deleted successfully";
		}
		else {
			str="Invalid Deletion";
			throw new InvalidDeletionException("Entered id does not exists in the record");
			
		}
		return str;
	}

	@Override
	public PropertyState addPropertyState(PropertyState p) {
		// TODO Auto-generated method stub
		PropertyState ps=this.psrepo.save(p);
		return ps;
	}


}
