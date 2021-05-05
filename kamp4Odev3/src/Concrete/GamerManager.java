package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entity.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;

    public GamerManager(GamerCheckService gamerCheckService) {
		
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
             System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " "+ " isim ve soyisimli kullan�c� sistem taraf�ndan do�rulan�p ba�ar�yla kaydedilmi�tir.");
		}
		else {
			System.out.println("Girilen bilgiler ge�ersizdir. Kay�d�n�z tamamlanamad�.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + "isim ve soyisimli kullanici sistemden basariyla silindi...");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName()+" " + "isim ve soyisimli kullan�c�n�n bilgileri ba�ar�yla g�ncellendi.");
		
	}

}
