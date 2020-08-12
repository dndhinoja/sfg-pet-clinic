package nd.application.sfgpetcliniccopy.controllers;

import org.springframework.stereotype.Controller;

import nd.application.sfgpetcliniccopy.services.GenericService;

@Controller
public class ConstructorInjectedController1 {
	private final GenericService genericService;

	public ConstructorInjectedController1(GenericService genericService) {
		super();
		this.genericService = genericService;
	}
	public String welcomeController() {
		return genericService.sayHello();
	}
	
}
