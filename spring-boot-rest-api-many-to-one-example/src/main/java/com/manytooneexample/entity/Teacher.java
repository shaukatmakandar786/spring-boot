package com.manytooneexample.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="teacher")
public class Teacher {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long teacherId;
    private String firstName;
    private String lastName;

}
