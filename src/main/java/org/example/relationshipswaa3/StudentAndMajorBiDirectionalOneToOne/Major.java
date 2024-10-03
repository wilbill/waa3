package org.example.relationshipswaa3.StudentAndMajorBiDirectionalOneToOne;

import jakarta.persistence.*;

@Entity
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "major")
    private Student student;
}
