package edu.ohio.inpp.acceleratorOperators;

import org.springframework.data.repository.CrudRepository;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

    long countByStatus (String status);

    Iterable<User> findByStatus (String status);

}
