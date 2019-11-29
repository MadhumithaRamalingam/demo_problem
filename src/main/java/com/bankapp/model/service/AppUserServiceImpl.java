package com.bankapp.model.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.dao.AppUser;
import com.bankapp.model.dao.AppUserRepo;

@Service
@Transactional
public class AppUserServiceImpl implements AppUserService{

	
	private AppUserRepo userRepo;
	
	
	@Autowired
	public AppUserServiceImpl(AppUserRepo userRepo) {
		
		this.userRepo = userRepo;
	}

	@Override
	public void addAppUser(AppUser user) {
		userRepo.save(user);
		
	}

	@Override
	public AppUser findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

}
