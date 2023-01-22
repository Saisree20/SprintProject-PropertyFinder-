package com.property_finder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property_finder.entity.Login;
import com.property_finder.entity.LoginResult;
import com.property_finder.entity.UserLoginEntity;
import com.property_finder.enums.Role;
import com.property_finder.exceptions.InvalidCredentialsException;
import com.property_finder.repo.UserLoginRepo;
import com.property_finder.service.UserLoginService;
@CrossOrigin
@RestController
@RequestMapping("/userlogin")
public class UserLoginController {
	
	@Autowired
	UserLoginService userloginservice;

	    @PostMapping("/saveUserLogin")
	    public UserLoginEntity saveUserLogin(@RequestBody UserLoginEntity userlogin)
	    {
	        UserLoginEntity response=userloginservice.saveUserLoginEntity(userlogin);
	        return response;
	    }
	    
	    @PostMapping("/validateUserLogin")
	    public LoginResult  validateUserLogin(@RequestBody Login login)
	    {  // System.out.println(login);
	        LoginResult valid=userloginservice.validateUserLoginEntity(login);
	        return valid;
	    }


}

