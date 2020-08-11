package com.nd.sfgpetclinic.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hi..m coming through ConstructorInjectedService";
    }
}
