package nd.application.sfgpetcliniccopy.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import nd.application.sfgpetcliniccopy.services.GenericService;

@Controller
public class PetController {
	GenericService genericService;

	public PetController(@Qualifier("petService")GenericService genericService) {
		super();
		this.genericService = genericService;
	}
	public String welcome() {
		return genericService.sayHello();
	}
}
