package com.bankapp.model.service;

import com.bankapp.model.dao.AppUser;

public interface AppUserService {
public void addAppUser(AppUser user);
public AppUser findByEmail(String email);
}
