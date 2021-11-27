package com.springjpaexample2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
            strategy = GenerationType.SEQUENCE,
            generator = "cource_sequence"
    )
    private long courceId;
    private String title;
    private int credit;


}
