package com.property_finder.service;

import com.property_finder.entity.Login;
import com.property_finder.entity.LoginResult;
import com.property_finder.entity.UserLoginEntity;
import com.property_finder.exceptions.InvalidCredentialsException;

public interface UserLoginService {


    public UserLoginEntity saveUserLoginEntity( UserLoginEntity userlogin2);

    public LoginResult validateUserLoginEntity(Login login);

 


}