package com.example.newapp.person;

import com.example.newapp.person.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInfoRepo extends JpaRepository<PersonInfo, String> {

    //public PersonInfo findByFirstName(String firstName);

}
