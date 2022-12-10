package com.gaatvul.bugtracker.DAOs;

import org.springframework.security.core.userdetails.UserDetails;

import com.gaatvul.bugtracker.DTOs.NewUserFormDTO;
import com.gaatvul.bugtracker.DTOs.UserAccountDTO;

public interface UserDetailsDAO {
    
    public UserDetails retrieveUserByEmailAddress(String emailAddress);

    public UserAccountDTO retrieveUserAccountDetailsByEmailAddress(String emailAddress);

    public void saveNewUserToDatabase(NewUserFormDTO newUser);
}