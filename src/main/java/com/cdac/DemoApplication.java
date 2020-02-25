package com.cdac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication 
{
	
	public static void main(String[] args) throws Exception 
	{
		SpringApplication.run(DemoApplication.class, args);
		
		
		System.out.println("Server started");
	}

}
