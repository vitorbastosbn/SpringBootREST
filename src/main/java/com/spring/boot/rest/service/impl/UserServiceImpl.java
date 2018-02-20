package com.spring.boot.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.rest.entity.User;
import com.spring.boot.rest.exception.BusinessException;
import com.spring.boot.rest.repository.UserRepository;
import com.spring.boot.rest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository ur;

	@Override
	public List<User> listar() {
		return ur.findAll();
	}

	@Override
	public User cadastrar(User user) throws BusinessException {
		boolean existeRegistro = ur.findOne(user.getUser()) != null;
		if (existeRegistro) {
			throw new BusinessException("Usuário já existente no banco de dados");
		} else {
			return ur.save(user);
		}
	}

	@Override
	public User alterar(User user) throws BusinessException {
		boolean existeRegistro = ur.findOne(user.getUser()) != null;
		if (!existeRegistro) {
			throw new BusinessException("Usuário não existente no banco de dados");
		} else {
			return ur.save(user);
		}
	}

	@Override
	public boolean pesquisarPorId(String user) {
		return ur.findOne(user) != null;
	}

}
