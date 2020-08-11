package com.nd.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "hi..coming through propertyService";
    }
}
