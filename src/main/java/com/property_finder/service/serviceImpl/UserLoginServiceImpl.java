package com.property_finder.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property_finder.entity.Login;
import com.property_finder.entity.LoginResult;
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

	        UserLoginEntity user=this.repo.save(userlogin2);
	        return user;
	}


	@Override
	public LoginResult validateUserLoginEntity(Login login) {
        // TODO Auto-generated method stub
		LoginResult result=new LoginResult();
	
		Optional<UserLoginEntity> userLoginEntityOptional=repo.findByUsernameAndPassword(login.getUsername()  ,login.getPassword());
		if(userLoginEntityOptional.isPresent()) {
			result.setLoginMessage("Login Successful");
			result.setRole(userLoginEntityOptional.get().getRole());
		}
		else {
			result.setLoginMessage("Invalid user and password");
			
		}
		return result;
	
    }


}

