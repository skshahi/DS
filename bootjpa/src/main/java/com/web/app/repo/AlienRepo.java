package com.web.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.web.app.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{

	List<Alien> findByAname(String string);

	List<Alien> findByAidAndAname(int i, String string);

	@Query("from Alien order by aname")
	List<Alien> findOrderByName();

}
