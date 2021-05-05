package ýnterfaceAbstractDemo.Concrete;

import ýnterfaceAbstractDemo.Abstract.CustomerCheckService;
import ýnterfaceAbstractDemo.Abstract.CustomerManager;
import ýnterfaceAbstractDemo.Entities.Customer;

public class NeroCustomerManager extends CustomerManager{
	
	private CustomerCheckService customerCheckService;

	public NeroCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Gecerli bir kisi degildir");
		}

	}
	



}
