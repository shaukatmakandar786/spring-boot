package in.shaukat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String studentName;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name="student_images",
        joinColumns = {
            @JoinColumn(name = "student_id")
        },
        inverseJoinColumns = {
            @JoinColumn(name="image_id")
        }

    )
    private Set<ImageModel> studentImage;

}
