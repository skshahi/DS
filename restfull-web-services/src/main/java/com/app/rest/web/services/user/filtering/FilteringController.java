package com.app.rest.web.services.user.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	//static filtering
	@GetMapping("/filtering")
	public SomeBean filtering()
	{
		
		
		return new  SomeBean("field1","field2","field3");
	}
	
	//dynamic filtering
	
	@GetMapping("/filtering-dynamic")
	public MappingJacksonValue filteringDynamic()
	{
		
		
		SomeBean someBean = new  SomeBean("field1","field2","field3");
		MappingJacksonValue mappingJacksonValue=new MappingJacksonValue(someBean);
		
		SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.filterOutAllExcept("field1","field2");
		FilterProvider filters=new SimpleFilterProvider().addFilter("FilterSomeBean", filter);
		mappingJacksonValue.setFilters(filters);
		
		return mappingJacksonValue;
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> filteringList()
	{
		
		
		return Arrays.asList(new SomeBean("field1","field2","field3"),new SomeBean("field4","field5","field6"))  ;
	}

}
