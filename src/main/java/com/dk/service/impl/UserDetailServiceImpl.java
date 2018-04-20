package com.dk.service.impl;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dk.dao.UserDetailRepository;
import com.dk.model.UserDetail;
import com.dk.service.IUserDetailService;



@Service("userDetailService")
@Transactional(readOnly = true)
public class UserDetailServiceImpl implements IUserDetailService{

	@Autowired
    private UserDetailRepository userRepository;
	
	@PersistenceContext
	private EntityManager entityManager;	
	
	@Override
	public UserDetail findByUserId(BigInteger id) {
		return userRepository.findByUserId(id);
	}

	@Override
	public UserDetail findByEmail(String username) {
		
		return userRepository.findByEmail(username);
	}

	@Override
	public List<UserDetail> findAll() {
		
		return userRepository.findAll();
	}
	
	@Transactional(readOnly = false)
	public UserDetail save(UserDetail user){
		return userRepository.save(user);
	}

	@Override
	@Transactional(readOnly = false)
	public UserDetail update(UserDetail user) {
		
		return entityManager.merge(user);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(UserDetail user) {
		
		userRepository.delete(user);
	}
	

}
