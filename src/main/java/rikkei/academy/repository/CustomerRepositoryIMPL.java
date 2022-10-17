package rikkei.academy.repository;

import org.springframework.stereotype.Repository;
import rikkei.academy.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepositoryIMPL implements ICustomerRepository{
    public static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1l,"Chinh"));
        customerList.add(new Customer(2l,"Lính"));

    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        if (customer.getId()!=null){
            Customer customer1 = findById(customer.getId());
            customer1.setName(customer.getName());
        }else {
            customerList.add(customer);
        }

    }

    @Override
    public Customer findById(Long id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id){
                return customerList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(long id) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id){
                customerList.remove(i);
            }
        }
    }
}
