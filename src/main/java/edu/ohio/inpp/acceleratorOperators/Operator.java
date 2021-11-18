package edu.ohio.inpp.acceleratorOperators;

// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import org.springframework.data.annotation.Id;


public class Operator extends User {

    // private Operator operator;
    private CertificationRepository heldCertifications;

    public CertificationRepository getHeldCertifications() {
        heldCertifications.findById(seq_nmbr);
        return heldCertifications;
    }

}