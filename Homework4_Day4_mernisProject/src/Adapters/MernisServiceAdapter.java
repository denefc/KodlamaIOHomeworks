package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import mernis.KPSPublicSoap_BindingStub;


public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        KPSPublicSoap_BindingStub client=new KPSPublicSoap_BindingStub();
            return client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth.getYear());
    }
}
