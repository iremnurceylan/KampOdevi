package Concrete;

import Abstract.GameService;
import Entity.Game;

public class GameManager implements GameService  {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameId() + " ID'sine sahip" + " " + game.getUnitPrice() + " TL Fiyati olan "  + game.getGameName() + " isimli oyun sisteme basariyla kaydedildi");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameId() + " ID'sine sahip" + " " + game.getUnitPrice() + " TL Fiyati olan "  + game.getGameName() + " isimli oyun sistemden basariyla silindi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameId() + " ID'sine sahip" + " " + game.getUnitPrice() + " TL Fiyati olan "  + game.getGameName() + " isimli oyunun bilgileri basariyla güncellendi");
		
	}

	@Override
	public void list(Game[] game) {
		int i = 0;
		for(Game games : game) {
			i++;
			System.out.println(" ");
			System.out.println(i + "-" + " Oyun Ismi: " + games.getGameName() + " --" + " Oyunun Fiyati : " + games.getUnitPrice());
			 
		}
	}

	

}
