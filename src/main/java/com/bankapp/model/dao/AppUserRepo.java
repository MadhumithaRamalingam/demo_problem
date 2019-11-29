package com.bankapp.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AppUserRepo extends CrudRepository<AppUser, Long>{
public AppUser findByEmail(String email);
}
