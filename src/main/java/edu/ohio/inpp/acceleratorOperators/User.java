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

    private Integer id;
    private String name;
    private String fullName;
    private String email;
    private String altEmail;
    private String phones;
    private String status;
    private String officeAddress;
    private String homeAddress;
    private LocalDateTime lasteUpdated;
    private LocalDateTime created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    public String getFullName () {
        return fullName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getAltEmail () {
        return altEmail;
    }

    public void setAltEmail (String altEmail) {
        this.altEmail = altEmail;
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
        return officeAddress;
    }

    public void setOfficeAddress (String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getHomeAddress () {
        return homeAddress;
    }

    public void setHomeAddress (String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public LocalDateTime getLastUpdated () {
        return lasteUpdated;
    }

    public void setLastUpdated () {
        this.lasteUpdated = LocalDateTime.now();
    }

    public LocalDateTime getCreated () {
        return created;
    }
}