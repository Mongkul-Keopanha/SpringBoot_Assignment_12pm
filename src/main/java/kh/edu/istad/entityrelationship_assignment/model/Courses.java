package kh.edu.istad.entityrelationship_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    private Integer countRating;

    private LocalDateTime createdAt;

    @Column(length = 255)
    private String description;

    private Float discountPercent;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Column(nullable = false)
    private Boolean isPublished;

    @Column(length = 255)
    private String keyword;

    @Column(length = 255)
    private String level;

    @Column(precision = 38, scale = 2)
    private BigDecimal price;

    @Column(length = 255)
    private String slug;

    private Float starRating;

    @Column(length = 255)
    private String thumbnail;

    @Column(length = 255)
    private String title;

    private Float totalHours;

    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "courses")
    private List<Videos> videos;

    @OneToMany(mappedBy = "courses")
    private List<Enrollments> enrollments;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor_Profiles instructorProfiles;
}