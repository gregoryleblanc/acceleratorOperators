package edu.ohio.inpp.acceleratorOperators;

import org.springframework.data.repository.CrudRepository;

public interface CanCertifyRepository extends CrudRepository<CanCertify, Integer> {

    long countByStatus (String status);

    Iterable<User> findByStatus (String status);

}
