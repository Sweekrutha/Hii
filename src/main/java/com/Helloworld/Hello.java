package com.Helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
@GetMapping("/Hii")
private String Hii()
{
	return "Welcome";
}

}
