package com.springbootthymeleafcrudwebapplicationproject.entity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private long id;
    private String firstName;
    private String lastName;
    private String email;

}
