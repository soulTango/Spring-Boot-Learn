package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pro")
@SpringBootApplication
public class DemoApplication {


	@Autowired
	Book bbbb;
	@RequestMapping("/index")
	String index(){
		return "描述信息："+ bbbb.getAuthor()+ ":" + bbbb.getName();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
