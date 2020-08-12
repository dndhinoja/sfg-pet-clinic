package nd.application.sfgpetcliniccopy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("Dog")
@Service("petService")
public class DogService implements GenericService{

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Boww...Boww";
	}

}
