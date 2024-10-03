package org.example.relationshipswaa3.BookAndPublisherUniDirectionalManyToOne;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne //by default is joinColumn, but we use joinTable & optional to handle nulls
    @JoinTable(
            name="Book_Publisher",
            joinColumns = @JoinColumn(name="Book_id"),
            inverseJoinColumns = @JoinColumn(name="publisher_id"))
    private Publisher publisher;
}
