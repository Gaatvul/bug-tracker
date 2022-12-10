package com.gaatvul.bugtracker.services;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gaatvul.bugtracker.DAOs.UserDetailsDAOImpl;
import com.gaatvul.bugtracker.DTOs.NewUserFormDTO;
import com.gaatvul.bugtracker.DTOs.UserAccountDTO;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsDAOImpl userAccountDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return userAccountDAO.retrieveUserByEmailAddress(username);
    }

    public UserAccountDTO loadUserAccountDetailsByUsername(String username) throws UsernameNotFoundException {

        return userAccountDAO.retrieveUserAccountDetailsByEmailAddress(username);
    }

    public void saveNewUserToDatabase(NewUserFormDTO newUser) {

        userAccountDAO.saveNewUserToDatabase(newUser);
    }
    
}