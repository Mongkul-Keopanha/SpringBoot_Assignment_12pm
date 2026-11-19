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
@Table(name = "videos")
public class Videos {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(length = 255)
    private String duration;

    @Column(nullable = false)
    private Boolean is_deleted;

    @Column(nullable = false)
    private Boolean is_published;

    @Column(length = 255)
    private String slug;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    @Column(length = 255)
    private String youtube;

    @OneToMany(mappedBy = "video")
    private List<Comments> comments;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Courses courses;
}
