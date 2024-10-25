package com.tntech.capstone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
public class ExampleEntity {
    
    @Id
    Long id;

    String name;
    String occupation;
    String hobby;

    // Constructors, getters, and setters are generated by Lombok
    // toString() and hashCode() methods also created by Lombok
}