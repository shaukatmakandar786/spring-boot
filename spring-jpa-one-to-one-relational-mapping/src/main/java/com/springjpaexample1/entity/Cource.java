package com.springjpaexample1.entity;


import lombok.*;
import javax.persistence.*;

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
            strategy = GenerationType.IDENTITY,
            generator = "cource_sequence"
    )
    private long courceId;
    private String title;
    private int credit;

}
