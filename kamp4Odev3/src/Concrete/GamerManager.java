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
             System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " "+ " isim ve soyisimli kullanıcı sistem tarafından doğrulanıp başarıyla kaydedilmiştir.");
		}
		else {
			System.out.println("Girilen bilgiler geçersizdir. Kayıdınız tamamlanamadı.");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " " + "isim ve soyisimli kullanici sistemden basariyla silindi...");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName()+" " + "isim ve soyisimli kullanıcının bilgileri başarıyla güncellendi.");
		
	}

}
