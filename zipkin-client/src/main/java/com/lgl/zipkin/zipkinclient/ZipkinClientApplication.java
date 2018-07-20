package com.lgl.zipkin.zipkinclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class ZipkinClientApplication {



	public static void main(String[] args) {
		SpringApplication.run(ZipkinClientApplication.class, args);
	}
}

@RestController
@RequestMapping("/zip")
class RestData {

	@GetMapping(path = "/me")
	public String hello() {
		return "String";
	}

	@GetMapping(path = "/me2")
	public String hello2() {
		throw new RuntimeException("Not good");
	}
}


