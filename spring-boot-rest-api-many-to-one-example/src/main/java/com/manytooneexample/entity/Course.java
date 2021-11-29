package com.manytooneexample.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long CourseId;
    private String title;
    private int credit;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="teacherid",
            referencedColumnName = "teacherId"
    )
    private Teacher teacher;
}
