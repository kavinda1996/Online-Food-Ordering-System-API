package edu.icet.ecom.service;

import edu.icet.ecom.model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);

    List<Customer> getAll();

    void deleteCustomer(String id);

    void updateCustomer(Customer customer);
}
