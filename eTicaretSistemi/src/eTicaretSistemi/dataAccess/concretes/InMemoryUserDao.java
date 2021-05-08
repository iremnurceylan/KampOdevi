package eTicaretSistemi.dataAccess.concretes;
import java.util.List;

import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println(" Kullanici InMemory ile veritabanina  eklendi." + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.geteMail() + " InMemory ile veri tabanindan silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.geteMail() + " InMemory ile güncellendi.");
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
