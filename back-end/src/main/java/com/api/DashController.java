package com.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DashController {

	
	@GetMapping(value="/dash")
	public String dash() {
		return "Hello dash";
	}
}
