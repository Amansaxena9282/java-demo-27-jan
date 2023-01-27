package com.tech.first;

import model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
		User user =new User();
		user.setAge(21);
		user.setName("AmanSaxena");
		user.setId(1);
		System.out.println("user details"+user.toString());
		System.out.println("user name="+user.getName());
		System.out.println("user id="+user.getId());
		System.out.println("user age "+user.getAge());
	}

}
