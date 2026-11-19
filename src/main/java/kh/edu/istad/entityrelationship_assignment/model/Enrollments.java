package kh.edu.istad.entityrelationship_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "enrollments")
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    private LocalDateTime enrolledAt;

    private LocalDateTime paymentAt;

    @Column(length = 255)
    private String paymentMethod;

    private Boolean paymentStatus;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    private Courses courses;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student_Profiles student_profiles;
}
