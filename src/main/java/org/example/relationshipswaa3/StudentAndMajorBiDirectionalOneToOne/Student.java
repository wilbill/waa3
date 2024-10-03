package org.example.relationshipswaa3.StudentAndMajorBiDirectionalOneToOne;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Major major;
}
