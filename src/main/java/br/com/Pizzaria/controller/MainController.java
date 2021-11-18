package br.com.Pizzaria.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class MainController {
	
	@RequestMapping("/api")
	public String Hello() {
		return "Hello World";
	}

}
