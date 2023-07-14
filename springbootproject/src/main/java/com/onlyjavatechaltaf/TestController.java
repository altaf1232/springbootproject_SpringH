package com.onlyjavatechaltaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController 
{
	@RequestMapping("/test")
	//this handler method
  public String firstHandler() 
  {
	return "just for testing !!"; //iss return ko hame return karana tu used karnge(@ResponseBody)Annotation
	//aap key web page per dikhega just for testing  
  }
}
