package com.example.demo;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping(method=RequestMethod.GET,value="/sample",consumes = "application/json",produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String execute1() {
		System.out.println("execute1");
		return "{\"success\":\"aaa\"}";
	}

	@RequestMapping(method=RequestMethod.GET,value="/sample",consumes = "application/x-www-form-urlencoded",produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String execute2() {
		System.out.println("execute2");
		return "<test>success</test>";
	}
}
