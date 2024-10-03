package org.example.relationshipswaa3.StudentAndCourseBidirectionalManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "courses")
    private List<Student> studentList;
}
