
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entity.Campaign;
import Entity.Game;
import Entity.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(240660,"CS:GO",120);
		Game game2 = new Game(238679,"GTA5",250);
		Game game3 = new Game(835671,"VALORANT",50);
		Game game4 = new Game(540748,"Minecraft",30);
		Game[] games = {game1,game2,game3,game4};
		System.out.println(" ");
		System.out.println("--------Oyun Islemleri---------");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.add(game3);
		gameManager.add(game4);
		gameManager.delete(game3);
		gameManager.update(game1);	
		
		System.out.println();
		System.out.println("-------Oyuncu Islemleri-------------------");
		
		Gamer gamer1 = new Gamer (1,"Irem","Ceylan",34806512985L,2000,"irem@irem.com");
		Gamer gamer2 = new Gamer (2,"Nuran","Korkmaz",56831904560L,1999,"nk@nk.com");
	
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		gamerManager.delete(gamer2);
		
		System.out.println();
		System.out.println("-------- Kampanya Islemleri-----------");
		
		Campaign  campaign1 = new Campaign(1,"Yeni �ye Indirimi",20);
		Campaign campaign2 = new Campaign (2,"Yaz Indirimi",10);
		Campaign campaign3 = new Campaign(3,"5.yila �zel Indirim",5);
		Campaign campaign4 = new Campaign(4,"10.Yil Indirimi",25);
		Campaign[] campaigns = {campaign1,campaign2,campaign3,campaign4};
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		campaignManager.add(campaign4);
		
		System.out.println();
		System.out.println("//////// OYUNLARIMIZ ////////////");
		gameManager.list(games);
		
		System.out.println();
		System.out.println("////////////// KAMPANYALARIMIZ ///////////");
		campaignManager.list(campaigns);
		
		System.out.println();
		System.out.println("***** SATIS I�LEMLER�****");
		System.out.println();
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game2, gamer1, campaign2);
		System.out.println();
		saleManager.sale(game4, gamer2, campaign1);
		System.out.println();
		saleManager.sale(game2, gamer2);
	}

}
