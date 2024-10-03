package org.example.relationshipswaa3.StudentAndCourseBidirectionalManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Course> courses;

}
