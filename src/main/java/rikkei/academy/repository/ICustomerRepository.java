package rikkei.academy.repository;

import rikkei.academy.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();
    void save(Customer customer);
    Customer findById(Long id);
    void deleteById(long id);
}
