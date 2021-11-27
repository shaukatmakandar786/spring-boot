package com.springdatajpaeaxmple.entity;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cource {

    @Id
    @SequenceGenerator(
            name="cource_sequence",
            sequenceName = "cource_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cource_sequence"
    )
    private long courceId;
    private String title;
    private int credit;

//    //bio directional one yo one mapping
//    @OneToOne(
//            mappedBy = "cource"
//    )
//    private CourceMaterial courceMaterial;


    @ManyToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="teacher_id",
            referencedColumnName = "teacherId"
    )
    private Teacher teacher;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name="student_cource_map",
            joinColumns = @JoinColumn(
                    name="cource_id",
                    referencedColumnName = "courceId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name="student_id",
                    referencedColumnName = "studentId"
            )
    )
    private List<Student> students;

//    public void addStudent(Student student)
//    {
//        if(students==null) students=new ArrayList<>();
//        students.add(student);
//    }

}
