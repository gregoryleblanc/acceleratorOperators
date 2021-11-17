package edu.ohio.inpp.acceleratorOperators;

// import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Query;

@Entity
@Table(name="certifications")
public class Certification {
    // These three lines are linked together to tell SpringBoot that the
    // ID field is the variable here, and that it is auto generated.  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq_nmbr;

    private String certification;
    private String shortDesc;
    private Integer exp_months;
    private String comment;

    public Integer getId() {
        return seq_nmbr;
    }

    public String getCertification() {
        return certification;
    }

    @Query("SELECT short as shortDesc from certifications")
    public String getShortDescription () {
        return shortDesc;
    }

    public Integer getExpMonths () {
        return exp_months;
    }

    public String getComment() {
        return comment;
    }
}
