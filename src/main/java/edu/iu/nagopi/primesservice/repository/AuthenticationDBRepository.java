package edu.iu.nagopi.primesservice.repository;

import edu.iu.nagopi.primesservice.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, String>{
    Customer findByUsername(String username);
}

