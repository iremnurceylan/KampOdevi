package Concrete;

import Abstract.SaleService;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class SaleManager  implements SaleService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli uye " + game.getGameId() + " Id numarasina sahip " + game.getGameName() + " " + "isimli oyunu" 
	+ " " +  game.getUnitPrice() + " TL 'ye basariyla satin aldi.");
	}

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli uye " + game.getGameId() + " Id numarasina sahip " + game.getGameName() + " isimli oyunu "
	+ campaign.getCampaignName() + " isimli kampanyadan faydalanarak " + game.getUnitPrice() + " TL yerine " + campaign.getPriceAfterDiscount(game.getUnitPrice()) + " TL 'ye başarıyla satın aldı.");
		}
}


