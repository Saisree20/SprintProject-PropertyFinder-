package com.property_finder.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.Login;
import com.property_finder.entity.UserLoginEntity;
import com.property_finder.enums.Role;
import com.property_finder.exceptions.InvalidCredentialsException;
import com.property_finder.repo.UserLoginRepo;
import com.property_finder.service.UserLoginService;
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginRepo repo;
	@Override
	public UserLoginEntity saveUserLoginEntity(UserLoginEntity userlogin2) {
		// TODO Auto-generated method stub
		 UserLoginEntity newuser=new UserLoginEntity();
	        newuser.setUserId(userlogin2.getUserId());
	        newuser.setUsername(userlogin2.getUsername());
	        newuser.setPassword(userlogin2.getPassword());
	        newuser.setRole(userlogin2.getRole());
	        newuser.setMobilenumber(userlogin2.getMobilenumber());

	        UserLoginEntity user=this.repo.save(newuser);
	        return user;
	}

	@Override
	public String validateRole(UserLoginEntity userlogin2) {
		// TODO Auto-generated method stub
		 String str="";

	        if(userlogin2.getRole()==Role.CUSTOMER)

	            {

	             str="CUSTOMER logged in 0";
	            }
	        else {
	            str="OWNER logged in 1";
	        }
	        return str;
	    
	}

	@Override
	public UserLoginEntity validateUserLoginEntity(Login login) throws InvalidCredentialsException {
        // TODO Auto-generated method stub
        Optional<UserLoginEntity> user=repo.findById(Long.parseLong(login.getUserId()));
        if(user.isPresent())
        {
            UserLoginEntity u=user.get();
            if(u.getPassword().equals(login.getPassword()))
            {
                return u;

            }
            else
            {
                throw new InvalidCredentialsException("Invalid Password");
            }

        }else


        {
            throw new InvalidCredentialsException("Invalid Username");
        }


    }


}

