package edu.ohio.inpp.acceleratorOperators;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name ="operators")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer seq_nmbr;
    private String name;
    private String fname;
    private String email;
    private String altemail;
    private String phones;
    private String status;
    private String office;
    private String home;
    private LocalDateTime updated;
    private LocalDateTime entered;

    public Integer getId() {
        return seq_nmbr;
    }

    public void setId(Integer id) {
        this.seq_nmbr = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName (String fullName) {
        this.fname = fullName;
    }

    public String getFullName () {
        return fname;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getAltEmail () {
        return altemail;
    }

    public void setAltEmail (String altemail) {
        this.altemail = altemail;
    }

    public String getPhones () {
        return phones;
    }

    public void setPhones (String phones) {
        this.phones = phones;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }

    public String getOfficeAddress () {
        return office;
    }

    public void setOfficeAddress (String officeAddress) {
        this.office = officeAddress;
    }

    public String getHomeAddress () {
        return home;
    }

    public void setHomeAddress (String homeAddress) {
        this.home = homeAddress;
    }

    public LocalDateTime getLastUpdated () {
        return updated;
    }

    public void setLastUpdated () {
        this.updated = LocalDateTime.now();
    }

    public LocalDateTime getCreated () {
        return entered;
    }

    public Boolean isActive() {
        if (this.status == "Active"){
            return true;
        }
        else {
            return false;
        }
    }
}