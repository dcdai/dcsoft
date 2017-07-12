package com.dcsoft.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dcsoft.demo.entity.User;
import com.dcsoft.demo.repository.UserJpaRepository;
import com.dcsoft.demo.repository.UserRepository;
import com.dcsoft.demo.service.UserService;

@Service("userService")

public class UserServiceImpl implements UserService {
	@Autowired
	private UserJpaRepository userJpaRepository;
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userJpaRepository.findAll();
	}

	public List<User> findByName(String name) {
		/*List<User> userList1 = userRepository.findByName1(name);
		List<User> userList2 = userRepository.findByName2(name);
		List<User> userList3 = userRepository.findByNameAndAddress(name, "3");*/
		/*System.out.println("userList1:" + userList1);
		System.out.println("userList2:" + userList2);
		System.out.println("userList3:" + userList3);*/
		return userRepository.findByName(name);
	}

	@Transactional(rollbackFor=Exception.class)
	public void saveUser(User book) {
		userJpaRepository.save(book);
	}

	//@Cacheable("users")   //使用缓存查找
	public User findOne(long id) {
		System.out.println("Cached Pages");
		return userJpaRepository.findOne(id);
	}

	@Transactional(rollbackFor=Exception.class)
	public void delete(long id) {
		userJpaRepository.delete(id);
	}
}
