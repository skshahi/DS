package com.app.rest.web.services.user.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.rest.web.services.user.User;

public interface UserJPARepository extends JpaRepository<User, Integer>{

}
