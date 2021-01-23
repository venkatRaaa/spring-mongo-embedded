package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoEmbeddedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoEmbeddedApplication.class, args);
	}

}

//{
//	   "id":5,
//	   "name":"Juaggu",
//	   "gender":"M",
//	   "products":[
//	      {
//	         "name":"powder",
//	         "quantity":4,
//	         "price":65
//	      }
//	   ],
//	   "address":
//	      {
//	         "city":"Alaska",
//	         "state":"newport",
//	         "pincode":"453269"
//	      }
//	}