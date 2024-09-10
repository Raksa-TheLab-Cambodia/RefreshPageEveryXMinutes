package com.thelab.spring.refreshpageeveryxminutes.repository;

import com.thelab.spring.refreshpageeveryxminutes.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
