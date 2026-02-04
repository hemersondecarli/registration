package com.patient.registration.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PatientController {

    @GetMapping("/welcome")
    public String greetings(){
        return "Welcome to the first page";
    }
}
