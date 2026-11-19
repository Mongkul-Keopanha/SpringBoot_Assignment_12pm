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
@Table(name = "instructor_profiles")
public class Instructor_Profiles {
    @Id
    @Column(length = 255, nullable = false)
    private String user_id;

    @Column(length = 255)
    private String biography;

    @Column(length = 255)
    private String facebook_link;

    @Column(length = 255)
    private String github_link;

    @Column(length = 255)
    private String job_title;

    @Column(length = 255)
    private String phone_number;

    @OneToMany(mappedBy = "instructorProfiles")
    private List<Courses> courses;

}
