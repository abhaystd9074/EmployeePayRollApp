package com.bridgelabz.employeepayrollapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data  // Generates Getters, Setters, toString, equals, hashCode
@NoArgsConstructor  // Generates a No-Args Constructor
@AllArgsConstructor  // Generates an All-Args Constructor
@RequiredArgsConstructor  // Generates a Constructor with Required Fields (final or @NonNull)
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull  // Lombok ensures this field cannot be null
    private String name;

    @NonNull
    private double salary;
}
