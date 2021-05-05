package �nterfaceAbstractDemo;
import �nterfaceAbstractDemo.Abstract.CustomerManager;
import �nterfaceAbstractDemo.Adapters.MernisServiceAdapter;
import �nterfaceAbstractDemo.Concrete.NeroCustomerManager;
import �nterfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import �nterfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer engin = new Customer(1, "Engin", "Demiro�", 1985, "28861499108");
		customerManager.save(engin);
		CustomerManager customerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
		Customer irem = new Customer(2, "�rem ", "Ceylan", 2000, "23595409321");
		customerManager.save(irem);
	}

}
