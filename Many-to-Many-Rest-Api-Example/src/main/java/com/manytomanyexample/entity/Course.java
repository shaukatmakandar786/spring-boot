package com.manytomanyexample.entity;

import jdk.jfr.Enabled;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.catalina.valves.StuckThreadDetectionValve;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="course")
@EqualsAndHashCode(exclude = "students")

public class Course {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long courseId;
    private String title;
    private int credit;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name="student_course_map",
            joinColumns=@JoinColumn(
                    name="cource_id",
                    referencedColumnName = "courseId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name="student_id",
                    referencedColumnName = "studentId"
            )
    )
    private List<Student> students;
}
