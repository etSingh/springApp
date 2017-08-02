package repository;

import model.Customer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by harpreet on 02/08/2017.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        Customer harpreet = new Customer();
        harpreet.setFirstName("Harpreet");
        harpreet.setLastName("Singh");
        return Arrays.asList(harpreet);
    }
}
