package com.example.project009;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.project009.DAO.UserRepository;
import com.example.project009.daoCLass.UserDetails;

@SpringBootApplication
public class Project009Application {
	@Autowired
	UserRepository userRepo;
	
	@PostConstruct
	public void addUsers() {
		List<UserDetails> l=Stream.of(
				new UserDetails(1,"sai","password","sai@gmail.com"),
				new UserDetails(2,"krishna","password","krishna@gmail.com")
				).collect(Collectors.toList());
		userRepo.saveAll(l);
				
				
				
				
	}

	public static void main(String[] args) {
		SpringApplication.run(Project009Application.class, args);
	}

}
