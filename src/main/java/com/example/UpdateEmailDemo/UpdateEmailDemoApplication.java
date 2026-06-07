package com.example.UpdateEmailDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpdateEmailDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(UpdateEmailDemoApplication.class, args);

		//task 30
		UpdateEmail updateEmail = new UpdateEmail();
		updateEmail.updatedEmail();

		//task 31
		UserProfile userProfile =  new UserProfile("0712345678",1001,"Muscat, Oman ");

		System.out.println("---Original User Profile---");
		userProfile.displayProfile();

		userProfile.setPhoneNumber("0798765432");
		userProfile.setAddress("Ruwi, Muscat");

		System.out.println("---Updated User Profile---");
		userProfile.displayProfile();
	}

}
