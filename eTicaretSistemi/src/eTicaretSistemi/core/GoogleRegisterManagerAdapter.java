package eTicaretSistemi.core;

import eTicaretSistemi.Google.GoogleRegisterManager;


public class GoogleRegisterManagerAdapter implements GoogleRegisterService{

	@Override
	public void sendToSystem(String message) {
		GoogleRegisterManager googleRegister = new GoogleRegisterManager();
		googleRegister.send("Sisteme google ile kayit olundu.");	
      }
}
