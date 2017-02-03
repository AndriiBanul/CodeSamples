package spboot;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Andrii_Banul on 1/26/2017.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}
