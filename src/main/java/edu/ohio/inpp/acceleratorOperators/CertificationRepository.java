package edu.ohio.inpp.acceleratorOperators;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CertificationRepository extends CrudRepository<Certification, Integer> {
    Optional<Certification> findById(Integer id);
}
