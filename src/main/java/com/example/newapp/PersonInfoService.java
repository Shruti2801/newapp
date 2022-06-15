package com.example.newapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Service
public class PersonInfoService {

    @Autowired
    PersonInfoRepo personInfoRepo;

    public PersonInfo createPersonInfo(PersonInfo personInfo) {
        return personInfoRepo.save(personInfo);
    }

    public List<PersonInfo> getPersonInfo() {
        return personInfoRepo.findAll();
    }

    public PersonInfo getPersonInfoById(String id) {
        return personInfoRepo.findById(id).orElseThrow();
    }

    public void deletePersonInfo(String id) {
        personInfoRepo.deleteById(id);
    }

    public String getByName(String name) {

        DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String dateString = dateFormat.format(new Date()).toString();
        LocalTime time = LocalTime.now();

        if(time.getHour() > 12.00 ){
            return "Good Afternoon "+name;
        }

        return null;
    }
}
