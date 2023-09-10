package com.app.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.spring.boot.configuration.CurrencyServiceConfiguration;

@RestController
public class CurrencyServiceController {
	
	
	
	@Autowired
	 private CurrencyServiceConfiguration configuration;
	 
	 @RequestMapping("/currency-config")
	public CurrencyServiceConfiguration getCurrencyCOnfiguration()
	{
		 return configuration;
	}

}
