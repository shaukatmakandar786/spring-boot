package com.springbootcrudwithrestapiexample.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="employees")
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name",nullable=false)
    private String firstName;

    @Column(name="last_name", nullable = false)
    private String lastName;

    @Column(name="email",nullable = false)
    private  String email;

}
