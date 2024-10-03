package org.example.relationshipswaa3.BookAndPublisherUniDirectionalManyToOne;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
