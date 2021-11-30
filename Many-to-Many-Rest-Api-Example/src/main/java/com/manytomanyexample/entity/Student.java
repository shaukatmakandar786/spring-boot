package com.manytomanyexample.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long studentId;
    private String firstName;
    private String lastName;

    @ManyToMany(
            mappedBy ="students",
            cascade = CascadeType.ALL

    )
    private List<Course> course;

}
