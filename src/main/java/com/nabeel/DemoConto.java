package com.nabeel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConto {
	
@GetMapping("/demo")
public String show()
{
	return "welcome to amdocs";
}
}
