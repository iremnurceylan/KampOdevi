package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + "Id numarali " + campaign.getCampaignName() + " " + "isimli kampanya sisteme basariyla eklendi");	
		}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + " Id numarali " + campaign.getCampaignName() + " " + " isimli kampanya sistemden baþarýyla silindi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignId() + " Id numarali " + campaign.getCampaignName() + " " + " isimli kampanya bilgileri sistemde baþarýyla güncelledi.");
	}

	@Override
	public void list(Campaign[] campaign) {
		int i = 0 ;
		for (Campaign campaigns : campaign) {
			i++;
			System.out.println();
			System.out.println(i + " " + "Kampanya ismi: "+ campaigns.getCampaignName() + "-- " + "Kampanya indirim orani: " + " " + "%" + campaigns.getDiscountRate());
		}
		
	}

}
