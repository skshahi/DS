package com.app.rest.web.services.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControlller {
	
	@Autowired
	private MessageSource messageSource;
	@GetMapping("helloworldi18n")
	public String  helloWorldI18n()
	{
		Locale locale=LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Sonu Kumar", locale);
	}
	

}
