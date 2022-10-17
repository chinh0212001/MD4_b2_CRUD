package rikkei.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.model.Customer;
import rikkei.academy.repository.ICustomerRepository;

import java.util.List;
@Service
public class CustomerServiceIMPL implements ICustomerService{
    @Autowired
    ICustomerRepository customerRepository ;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {
        customerRepository.deleteById(id);

    }
}
