package com.app.rest.web.services.user.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.rest.web.services.user.Post;

public interface PostJPARepository extends JpaRepository<Post, Integer>{

}
