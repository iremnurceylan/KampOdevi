package Concrete;

import Abstract.GamerCheckService;
import Entity.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}

}
