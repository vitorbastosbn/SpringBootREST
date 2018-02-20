package com.spring.boot.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.rest.entity.User;
import com.spring.boot.rest.exception.BusinessException;
import com.spring.boot.rest.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService us;

	@GetMapping
	private List<User> listar() {
		return us.listar();
	}

	@PostMapping
	private User cadastrar(@RequestBody @Valid User user) throws BusinessException {
		User cadastrar = us.cadastrar(user);
		System.out.println("Entrou por aqui");
		return cadastrar;
	}

	@PutMapping
	private User alterar(@RequestBody @Valid User user) throws BusinessException {
		return us.alterar(user);
	}
}
