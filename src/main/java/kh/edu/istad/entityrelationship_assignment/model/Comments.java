package kh.edu.istad.entityrelationship_assignment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer id;

    private LocalDateTime created_at;
    private Boolean isDeleted;

    @Column(length = 255)
    private String text;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Comments parent;
    @OneToMany(mappedBy = "parent")
    private List<Comments> replies;

    @ManyToOne
    @JoinColumn(name = "video_id", nullable = false)
    private Videos video;

}
