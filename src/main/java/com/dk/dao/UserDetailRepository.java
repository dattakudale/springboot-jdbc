package com.dk.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dk.model.UserDetail;




public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
	
	public UserDetail findByUserId( BigInteger email );
	public UserDetail findByEmail( String email );
	
}