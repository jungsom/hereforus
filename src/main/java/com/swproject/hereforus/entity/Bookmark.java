package com.swproject.hereforus.entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name="bookmark")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    @Column(nullable = false)
    private String type; // "festival", "performance", "food"

    @Column(nullable = false, name = "reference_id")
    private String referenceId;

    @Builder
    public Bookmark(Group group, String type, String ReferenceId) {
        this.group = group;
        this.type = type;
        this.referenceId = ReferenceId;
    }
}
