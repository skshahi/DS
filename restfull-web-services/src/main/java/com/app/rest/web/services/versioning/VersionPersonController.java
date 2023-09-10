package com.app.rest.web.services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionPersonController {
	
	//URI Versioning
	
	@GetMapping("/personv1")
	public PersionV1 getFirstVersionOfPersonURI()
	{
		
		return new PersionV1("Sonu Kumar");
	}
	
	@GetMapping("/personv2")
	public PersionV2 getSecondVersionOfPersonURI()
	{
		
		return new PersionV2(new Name("Sonu","Kumar"));
	}
	//Request Parameter Versioning

	@GetMapping(path="/person", params = "version=1")
	public PersionV1 getFirstVersionOfPersonRequestParam()
	{
		
		return new PersionV1("Sonu Kumar");
	}
	
	@GetMapping(path="/person",params = "version=2")
	public PersionV2 getSecondVersionOfPersonRequestParam()
	{
		
		return new PersionV2(new Name("Sonu","Kumar"));
	}
	
	//header versioning
	@GetMapping(path="/person/header",headers ="X-API-VERSION=2")
	public PersionV2 getSecondVersionOfPersonRequestHeader()
	{
		
		return new PersionV2(new Name("Sonu","Kumar"));
	}
	
	//Media type versioning
	//header versioning
		@GetMapping(path="/person/accept",produces  ="application/X-API-VERSION-V2+json")
		public PersionV2 getSecondVersionOfPersonRequestAccept()
		{
			
			return new PersionV2(new Name("Sonu","Kumar"));
		}

}
