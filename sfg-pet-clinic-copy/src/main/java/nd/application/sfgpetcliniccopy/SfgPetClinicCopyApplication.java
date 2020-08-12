package nd.application.sfgpetcliniccopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import nd.application.sfgpetcliniccopy.controllers.ConstructorInjectedController;
import nd.application.sfgpetcliniccopy.controllers.ConstructorInjectedController1;
import nd.application.sfgpetcliniccopy.controllers.PetController;

@SpringBootApplication
public class SfgPetClinicCopyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgPetClinicCopyApplication.class, args);
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.welcomeController());
		
		ConstructorInjectedController1 constructorInjectedController1 = (ConstructorInjectedController1) ctx.getBean("constructorInjectedController1");
		System.out.println(constructorInjectedController1.welcomeController());
		
		PetController petController = (PetController) ctx.getBean("petController");
		System.out.println(petController.welcome());
	}

}
