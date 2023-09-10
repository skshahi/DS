package com.web.app;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.web.app.repo.AlienRepo;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		//System.out.println("Alien");
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView addAlienId(@RequestParam int  aid)
	{
		ModelAndView mv=new ModelAndView("show.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findByAname("Vivaan"));
		System.out.println(repo.findByAidAndAname(1,"Vivaan"));
		System.out.println(repo.findOrderByName());
		mv.addObject(alien);
		
		return mv;
	}
	
	// spring rest example

	@RequestMapping("/aliens")
	@ResponseBody	
	public String getAliens()
	{
		
		
		return repo.findAll().toString();
	}
	@RequestMapping("/aliens/{aid}")
	@ResponseBody	
	public String getAliens(@PathVariable int aid)
	{
		
		
		return repo.findById(aid).toString();
	}
	
	//spring rest with json
	
	@RequestMapping("/alienss")
	@ResponseBody	
	public List<Alien> getAlienss()
	{
		
		
		return repo.findAll();
	}
	@RequestMapping("/alienss/{aid}")
	@ResponseBody	
	public Optional<Alien> getAlienss(@PathVariable int aid)
	{
		
		
		return repo.findById(aid);
	}
	
}
