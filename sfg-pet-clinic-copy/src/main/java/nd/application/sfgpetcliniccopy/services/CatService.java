package nd.application.sfgpetcliniccopy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("cat")
@Service("petService")
public class CatService implements GenericService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Meow...Meow";
	}
	
}
