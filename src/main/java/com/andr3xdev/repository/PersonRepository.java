package com.andr3xdev.repository;


import com.andr3xdev.items.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
