/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bpr.service;

import com.bpr.entity.master.RoleSecurity;
import com.bpr.entity.master.UserSecurity;
import com.bpr.repository.RoleRepository;
import com.bpr.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bubun
 */
@Repository
@Transactional(readOnly=true)
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    
    public List<RoleSecurity>listRole(){
        return this.roleRepository.findAll();
    }
    
    public List<UserSecurity>findUser(){
        return this.userRepository.findAll();
    }
    
    public UserSecurity findByUsername (String username){
        return this.userRepository.findByName(username);
    }
}
