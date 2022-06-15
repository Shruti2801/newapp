package com.example.newapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInfoRepo extends JpaRepository<PersonInfo, String> {

    //public PersonInfo findByFirstName(String firstName);

}
