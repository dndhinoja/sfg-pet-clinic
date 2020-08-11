package com.nd.sfgpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("FR")
@Service("i18nService")
public class I18nFrenchService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "French - FR";
    }
}
