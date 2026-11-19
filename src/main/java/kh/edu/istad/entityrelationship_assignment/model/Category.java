package kh.edu.istad.entityrelationship_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(length = 255)
    private String icon;

    @Column(nullable = false)
    private Boolean is_deleted;

    @Column(length = 50, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Courses> courses;

}
