package com.spring.boot.rest.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.boot.rest.entity.User;
import com.spring.boot.rest.repository.UserRepositoryCustom;

@Repository("ur")
public class UserRepositoryImpl implements UserRepositoryCustom {

	@Override
	public List<User> listaPorId(Long id) {
		return null;
	}

}
