package com.nd.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "hi..m coming through setterinjectedService";
    }
}
