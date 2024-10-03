package org.example.relationshipswaa3.BookAndAuthorOneToOneUniDirectional;

import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne  //joinColumn by default
    @JoinColumn(name="book_id") //just to override the fk column name, but can be ignored
    private Book book;
}
