package com.dcsoft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcsoft.demo.entity.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {

}
