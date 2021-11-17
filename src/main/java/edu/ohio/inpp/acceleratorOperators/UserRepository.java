package edu.ohio.inpp.acceleratorOperators;

import org.springframework.data.repository.CrudRepository;


// import java.net.URI;
// import com.sun.jersey.api.client.WebResource;

// import com.example.accessingdatamysql.User;
// import edu.ohio.inpp.acceleratorOperators.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

    long countByStatus (String status);

    Iterable<User> findByStatus (String status);

}
