package org.splitwise.entitites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User extends BaseEntity {

    @Id
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String emailId;
    private String contact;

    public User() {
        super();
    }

    public User(int id, String userName, String firstName, String lastName, String emailId, String contact) {
        super(id);
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
