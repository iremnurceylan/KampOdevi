package �nterfaceAbstractDemo.Concrete;

import �nterfaceAbstractDemo.Abstract.CustomerCheckService;
import �nterfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	
	}

	
		

}
