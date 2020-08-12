package nd.application.sfgpetcliniccopy.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class ConstructorInjectedService implements GenericService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Wecome to our service - Hello!!";
	}
	
	
}
