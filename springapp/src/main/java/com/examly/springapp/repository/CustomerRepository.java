<<<<<<< HEAD
package com.examly.springapp.repository;
public class CustomerRepository {
    
}
=======
package com.customer.Customer.repository;

import com.customer.Customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
>>>>>>> ce894de4bed85d37444692bfbee01f5399e80e9c
