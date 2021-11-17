package edu.ohio.inpp.acceleratorOperators;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="trainers")
public class Trainer {
    // These three lines are linked together to tell SpringBoot that the
    // ID field is the variable here, and that it is auto generated.  
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer seq_nmbr;
    
    private String login_name;
    private String optbl_ptr;
    private LocalDateTime added;
    private String comment;
    
    public Integer getId() {
        return seq_nmbr;
    }

    public String getLoginName() {
        return login_name;
    }

    public void setLoginName(String newName) {
        this.login_name = newName;
    }

    public void setOpTableID (String opTableId) {
        this.optbl_ptr = opTableId;
    }

    public String getOpTableID () {
        return optbl_ptr;
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