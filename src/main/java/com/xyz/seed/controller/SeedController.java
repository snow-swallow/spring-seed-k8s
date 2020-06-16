package com.xyz.seed.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SeedController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/test")
    public String test(){
		logger.info("Test");
        return "Success";
    }
}
