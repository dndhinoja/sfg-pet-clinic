package nd.application.sfgpetcliniccopy.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedService1 implements GenericService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Welcome to our service - Hello!! 1";
	}

}
