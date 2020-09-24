package org.pet.entity;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Date;

@Entity
public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String password;

    @Transient
    private String confirmPassword;

    private Double weight;

    private Double height;

    private Boolean gender;

    private Date dateOfBirth;

    public Goal goal;


    public User() {
    }

    public User(String firstName, String lastName, String password, Double weight, Double height, Boolean gender, Date dateOfBirth, Goal goal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.goal = goal;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", goal=" + goal +
                '}';
    }
}
