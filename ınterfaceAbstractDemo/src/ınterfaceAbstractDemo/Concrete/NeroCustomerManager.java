package �nterfaceAbstractDemo.Concrete;

import �nterfaceAbstractDemo.Abstract.CustomerCheckService;
import �nterfaceAbstractDemo.Abstract.CustomerManager;
import �nterfaceAbstractDemo.Entities.Customer;

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
