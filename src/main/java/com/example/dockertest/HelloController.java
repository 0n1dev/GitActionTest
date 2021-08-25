package com.example.dockertest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
	public ResponseEntity<?> hello() {
		return new ResponseEntity<String>("Test", HttpStatus.OK);
	}
}
