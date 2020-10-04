package org.pet.entity;

import javax.persistence.*;

@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String description;

    @OneToOne
    private UserInfo userInfo;
}
