package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 测试springmvc的开发环境 */
@Controller

public class TestSpringMVC {
	
	@RequestMapping("/testmvc")
	public String testSpringmvc() {
		return "test";
	}
	
	
}





