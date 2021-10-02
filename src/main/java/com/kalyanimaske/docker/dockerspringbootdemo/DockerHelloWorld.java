package com.kalyanimaske.docker.dockerspringbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class DockerHelloWorld {
	@GetMapping
public String getName() {
	return "Welcome to My first springboot application using docker";
	
}
	
}
