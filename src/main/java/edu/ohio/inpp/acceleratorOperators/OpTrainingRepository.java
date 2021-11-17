package edu.ohio.inpp.acceleratorOperators;

import org.springframework.data.repository.CrudRepository;

public interface OpTrainingRepository extends CrudRepository<OpTraining, Integer> {

    long countByStatus (String status);

    Iterable<User> findByStatus (String status);

}
