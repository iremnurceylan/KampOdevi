package ýnterfaceAbstractDemo;
import ýnterfaceAbstractDemo.Abstract.CustomerManager;
import ýnterfaceAbstractDemo.Adapters.MernisServiceAdapter;
import ýnterfaceAbstractDemo.Concrete.NeroCustomerManager;
import ýnterfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import ýnterfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer engin = new Customer(1, "Engin", "Demiroð", 1985, "28861499108");
		customerManager.save(engin);
		CustomerManager customerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
		Customer irem = new Customer(2, "Ýrem ", "Ceylan", 2000, "23595409321");
		customerManager.save(irem);
	}

}
