package com.andr3xdev.repository;


import com.andr3xdev.models.User_model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<User_model,Long> {

}
