package com.act.shilenmoneytransferapi.domains;

import lombok.Data;

import javax.persistence.*;

/*
 Account class that defines the properties of an account and that will be applied to atable by ORM
* @author Tekle G.
* */

@Data
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false)
    private Integer pin;

    private Boolean isVerified=true;

    private Double balance=0.0;

}
