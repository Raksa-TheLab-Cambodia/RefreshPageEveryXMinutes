package com.thelab.spring.refreshpageeveryxminutes.service;

import com.thelab.spring.refreshpageeveryxminutes.model.Customer;
import com.thelab.spring.refreshpageeveryxminutes.repository.CustomerRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Scheduled task to refresh the cache every 10 minutes
    @Scheduled(fixedRate = 10 * 60 * 1000) // Every 10 minutes
    public List<Customer> getAllCustomers() {
        System.out.println("000000000000000000000000000");
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            return customerRepository.save(customer);
        }
        return null;
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
