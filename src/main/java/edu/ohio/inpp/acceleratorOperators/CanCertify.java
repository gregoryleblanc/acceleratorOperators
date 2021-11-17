package edu.ohio.inpp.acceleratorOperators;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
public class CanCertify {
    // These three lines are linked together to tell SpringBoot that the
    // ID field is the variable here, and that it is auto generated.  
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer seq_nmbr;
    
    private Integer trainer_ptr;
    private Integer cert_ptr;
    private LocalDateTime added;
    private String comment;

    public Integer getTrainerPtr () {
        return trainer_ptr;
    }

    public void setTrainerPtr (Integer newTrainerPtr) {
        this.trainer_ptr = newTrainerPtr;
    }

    public Integer getCertPtr () {
        return cert_ptr;
    }

    public void setCertPtr (Integer newCertPtr) {
        this.cert_ptr = newCertPtr;
    }

    public LocalDateTime getAdded () {
        return added;
    }

    public String getComment () {
        return comment;
    }

    public void setComment (String newComment) {
        this.comment = newComment;
    }
}