package com.springdatajpaeaxmple.entity;

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

}
