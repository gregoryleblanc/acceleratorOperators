package edu.ohio.inpp.acceleratorOperators;

import org.springframework.data.repository.CrudRepository;

public interface AnnualRadSafetyRepository extends CrudRepository<AnnualRadSafety, Integer> {

    long countByStatus (String status);

    Iterable<User> findByStatus (String status);

}
