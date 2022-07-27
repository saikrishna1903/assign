package com.example.project009.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project009.daoCLass.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails,Integer>{

	UserDetails findByUserName(String username);

}
