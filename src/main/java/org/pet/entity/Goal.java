package org.pet.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String description;

    @OneToOne
    private UserDetails userDetails;
}
