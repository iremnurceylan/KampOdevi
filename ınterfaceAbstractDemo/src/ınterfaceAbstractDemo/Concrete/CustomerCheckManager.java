package ýnterfaceAbstractDemo.Concrete;

import ýnterfaceAbstractDemo.Abstract.CustomerCheckService;
import ýnterfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	
	}

	
		

}
