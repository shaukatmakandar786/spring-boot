package com.springdatajpaeaxmple.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@ToString(exclude = "cource")
public class CourceMaterial {

    @Id
    @SequenceGenerator(
            name="cource_material_sequence",
            sequenceName = "cource_material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cource_material_sequence"
    )
    private long courceMaterialId;
    private String url;

    //uni directional one to one mapping
    @OneToOne(
            cascade=CascadeType.ALL,

            //if you are using FetchType.EAGER then remove the @ToString(exclude = "cource") annotation and if you are using FetchType.LAZY then add @ToString(exclude = "cource") annotation
            fetch=FetchType.EAGER,
            optional=false
    )
    @JoinColumn(
            name = "cource_id",
            referencedColumnName = "courceId"
    )
    private Cource cource;
}
