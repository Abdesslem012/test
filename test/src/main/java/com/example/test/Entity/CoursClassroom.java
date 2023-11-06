package com.example.test.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class CoursClassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private String nom;
    private int nbHeurs;
    private boolean archive;
    @ManyToOne
    Classe classe;
}
