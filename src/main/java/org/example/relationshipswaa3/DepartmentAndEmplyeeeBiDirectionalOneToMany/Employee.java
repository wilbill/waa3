package org.example.relationshipswaa3.DepartmentAndEmplyeeeBiDirectionalOneToMany;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Department department;
}
