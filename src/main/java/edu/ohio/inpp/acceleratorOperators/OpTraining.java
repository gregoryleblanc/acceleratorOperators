package edu.ohio.inpp.acceleratorOperators;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
public class OpTraining {
    // These three lines are linked together to tell SpringBoot that the
    // ID field is the variable here, and that it is auto generated.  
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer seq_nmbr;
    
    private Integer operator;
    private Integer certification;
    private Integer trainer;
    private String status;
    private LocalDateTime entered;
    private LocalDateTime expires;

    public Integer getOperator() {
        return operator;
    }

    public void setOperator (Integer newOperator) {
        this.operator = newOperator;
    }

    public Integer getCertification () {
        return certification;
    }

    public void setCertification (Integer newCertification) {
        this.certification = newCertification;
    }

    public Integer getTrainer () {
        return trainer;
    }
    
    public void setTrainer (Integer newTrainer) {
        this.trainer = newTrainer;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus (String newStatus) {
        this.status = newStatus;
    }

    public LocalDateTime getEntered () {
        return entered;
    }

    public LocalDateTime getExpires () {
        return expires;
    }

    public void setExpires (LocalDateTime newExpires) {
        this.expires = newExpires;
    }
}