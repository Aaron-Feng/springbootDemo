package com.example.services;

import java.util.Optional;

import com.example.entity.User;

public interface UserService {
	Optional<User> findUserByName(String name);

	void saveUser(User user);

	void saveAdminUser(User user);
}
