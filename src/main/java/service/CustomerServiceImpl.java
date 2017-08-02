package service;

import model.Customer;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

                                                    // This should be abstracted out and
                                                    // a design pattern such as a factory
                                                    // pattern should be used instead
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    // Whenever we see an interface tied to a concrete implementation, that should be abstracted
    // out of our code so that our application isn't "Hardcoded"

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}
