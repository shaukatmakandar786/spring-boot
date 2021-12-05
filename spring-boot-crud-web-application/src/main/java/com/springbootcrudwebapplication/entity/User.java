package com.springbootcrudwebapplication.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false,unique = true,length=45)
    private String email;

    @Column(nullable = false,length=45)
    private String password;

    @Column(nullable = false,name = "first_name")
    private String firstName;

    @Column(nullable = false,name = "last_name")
    private String lastName;
}
