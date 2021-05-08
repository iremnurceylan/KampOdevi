package eTicaretSistemi;

import eTicaretSistemi.business.concretes.UserManager;
import eTicaretSistemi.core.GoogleRegisterManagerAdapter;
import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.dataAccess.concretes.InMemoryUserDao;
import eTicaretSistemi.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
	UserManager userManager = new UserManager(new InMemoryUserDao());
	GoogleRegisterManagerAdapter  googleRegisterManagerAdapter = new GoogleRegisterManagerAdapter();
	UserDao userDao = new InMemoryUserDao();
	
    User user1 = new User(1, "Irem", "Ceylan", "irem@gmail.com" , "0432252");
    User user2 = new User(2,"Elif","Atagul","elif@gmail.com", "43578548");
    User user3 = new User(3, "Dfkf", "Cdkfrk", "dkfkf", "234894");
    User user4 = new User(4,"Sevval" , "Binici" , "irem@gmail.com" , "33454554");
    User user5 = new User(5,"S","Aydin" ,"aydin@gmail.com" , "234556dkgk");
    
    
    googleRegisterManagerAdapter.sendToSystem("");
    userManager.register(user1);
    System.out.println();
    userManager.register(user3);
    userDao.delete(user3);
    System.out.println();
    userManager.register(user2);
    System.out.println();
    userManager.register(user4);
    System.out.println();
    userManager.register(user5);
    System.out.println();
    userDao.update(user1);
  
    
	}


}
