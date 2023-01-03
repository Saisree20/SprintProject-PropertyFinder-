package com.property_finder.service;

import com.property_finder.entity.Login;
import com.property_finder.entity.UserLoginEntity;
import com.property_finder.exceptions.InvalidCredentialsException;

public interface UserLoginService {


    public UserLoginEntity saveUserLoginEntity( UserLoginEntity userlogin2);

    public String validateRole(UserLoginEntity userlogin2);

    public UserLoginEntity validateUserLoginEntity(Login login)throws InvalidCredentialsException;

 


}