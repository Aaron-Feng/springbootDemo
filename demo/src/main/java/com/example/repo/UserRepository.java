package com.example.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByName(String name);

}
