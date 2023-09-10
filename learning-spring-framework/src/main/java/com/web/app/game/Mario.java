package com.web.app.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements Game {
	
	
	public void up()
	{
		System.out.println("Mario game up");
	}
	
	public void down()
	{
		System.out.println("Mario game down");
	}
	public void left()
	{
		System.out.println("Mario game left");
	}
	public void right()
	{
		System.out.println("Mario game right");
	}

}
