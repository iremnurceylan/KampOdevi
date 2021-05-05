package Adapter;

import Abstract.GamerCheckService;
import Entity.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService{
	
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result;
		try {
			result =  kpsPublicSoapProxy.TCKimlikNoDogrula(
					gamer.getNationalId(),
					gamer.getFirstName().toUpperCase(),
					gamer.getLastName().toUpperCase(),
					gamer.getDateOfBirth()
					);
					
	        }
		catch (Exception exception) {
			result = false;
			exception.printStackTrace();
		}
		
		return result;
		
	}

}
