package com.anna.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anna.entity.User;

public interface UserDao extends JpaRepository<User, String> {

	public User findByUserNameAndPassword(String userName, String password);
}
