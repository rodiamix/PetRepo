package org.pet.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private Boolean gender;

    private Date dateOfBirth;

    private Double weight;

    private Double height;

    @OneToOne
    public Goal goal;

}
