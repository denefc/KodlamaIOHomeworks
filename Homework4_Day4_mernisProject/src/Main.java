import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
        Customer customer=new Customer("Engin","Demiroğ","12345678901",1, LocalDate.of(1997,06,12));
        customerManager.save(customer);
    }
}
