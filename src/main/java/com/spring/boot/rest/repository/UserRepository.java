package com.spring.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.rest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>, UserRepositoryCustom {

}
