package com.example.newapp.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/person-info")
public class PersonInfoController {

    @Autowired
    PersonInfoService personInfoService;

    @PostMapping("/add")
    public ResponseEntity<PersonInfo> createPersonInfo(@RequestBody PersonInfo personInfo) {
        PersonInfo response = personInfoService.createPersonInfo(personInfo);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/get-all")
    public ResponseEntity<List<PersonInfo>> getPersonInfo() {
        List<PersonInfo> response = personInfoService.getPersonInfo();

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<PersonInfo> getPersonInfoById(@PathVariable String id) {
        PersonInfo response = personInfoService.getPersonInfoById(id);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @GetMapping("/get-by-name/{name}")
    public ResponseEntity<String> getByName(@PathVariable String name) {
        String response = personInfoService.getByName(name);

        return new ResponseEntity<>(response, HttpStatus.OK);

    }


//    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity deletePersonInfo(@PathVariable String id) {
        personInfoService.deletePersonInfo(id);

        return new ResponseEntity(HttpStatus.OK);

    }


}
