package com.spring.boot.rest.repository;

import java.util.List;

import com.spring.boot.rest.entity.User;

public interface UserRepositoryCustom {
	
	List<User> listaPorId(Long id);
}
