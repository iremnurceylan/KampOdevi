package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public interface SaleService {
	void sale(Game game, Gamer gamer);
	
	void sale(Game game , Gamer gamer , Campaign campaign );
	

}
