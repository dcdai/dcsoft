package com.dcsoft.demo.service;

import java.util.List;

import com.dcsoft.demo.entity.User;

public interface UserService {

	public List<User> findAll();

	public void saveUser(User book);

	public User findOne(long id);

	public void delete(long id);

	public List<User> findByName(String name);
}
