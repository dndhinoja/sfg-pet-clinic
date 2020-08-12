package nd.application.sfgpetcliniccopy.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import nd.application.sfgpetcliniccopy.services.GenericService;
@Controller
public class ConstructorInjectedController {

	private final GenericService genericService;
	
	
	public ConstructorInjectedController(@Qualifier("constructorInjectedService1")GenericService genericService) {
		super();
		this.genericService = genericService;
	}


	public String welcomeController() {
		// TODO Auto-generated method stub
		return genericService.sayHello();
	}

}
