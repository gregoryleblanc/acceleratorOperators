package edu.ohio.inpp.acceleratorOperators;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="annualradsafety")
public class AnnualRadSafety {
    // These three lines are linked together to tell SpringBoot that the
    // ID field is the variable here, and that it is auto generated.  
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer seq_nmbr;
    
    private Integer op_ptr;
    private Integer trainer_ptr;
    private LocalDateTime training_date;
    private LocalDateTime expires;
    private LocalDateTime entered;
    private Integer entered_by;
    private String status;
    private String course;
    private String comment;

    public Integer getOpPtr () {
        return op_ptr;
    }

    public Integer getTrainerPtr () {
        return trainer_ptr;
    }

    public LocalDateTime getTrainingDate () {
        return training_date;
    }

    public LocalDateTime getExpires () {
        return expires;
    }

    public LocalDateTime getEntered () {
        return entered;
    }

    public Integer getEnteredBy () {
        return entered_by;
    }

    public String getStatus () {
        return status;
    }

    public String getCourse () {
        return course;
    }

    public String getComment () {
        return comment;
    }
}