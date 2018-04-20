package com.dk.service;

import java.math.BigInteger;
import java.util.List;

import com.dk.model.UserDetail;


public interface IUserDetailService {
	public UserDetail findByUserId(BigInteger id);
    public UserDetail findByEmail(String email);
    public List<UserDetail> findAll ();
    
    public UserDetail save(UserDetail user);
    
    public UserDetail update(UserDetail user);
    
    public void delete(UserDetail user);
}
