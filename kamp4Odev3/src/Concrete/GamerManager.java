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
             System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " "+ " isim ve soyisimli kullanýcý sistem tarafýndan doðrulanýp baþarýyla kaydedilmiþtir.");
		}
		else {
			System.out.println("Girilen bilgiler geçersizdir. Kayýdýnýz tamamlanamadý.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + "isim ve soyisimli kullanici sistemden basariyla silindi...");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName()+" " + "isim ve soyisimli kullanýcýnýn bilgileri baþarýyla güncellendi.");
		
	}

}
