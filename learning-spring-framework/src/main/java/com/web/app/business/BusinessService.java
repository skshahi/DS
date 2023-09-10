package com.web.app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.app.data.DataService;

@Component
public class BusinessService 
{
	@Autowired
	private DataService dataService;
	public long calculateSum()
	{
		return dataService.getData().stream().reduce(Integer::sum).get();
	}
	
}
