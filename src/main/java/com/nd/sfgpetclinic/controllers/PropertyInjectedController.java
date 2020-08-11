package com.nd.sfgpetclinic.controllers;

import com.nd.sfgpetclinic.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
