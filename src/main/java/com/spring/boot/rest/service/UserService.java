package com.spring.boot.rest.service;

import java.util.List;

import com.spring.boot.rest.entity.User;
import com.spring.boot.rest.exception.BusinessException;

public interface UserService {
	
	List<User> listar();

	User cadastrar(User user) throws BusinessException;

	User alterar(User user) throws BusinessException;

	boolean pesquisarPorId(String user);
}
