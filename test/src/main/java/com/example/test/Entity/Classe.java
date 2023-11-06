package com.example.test.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeClasse;
    private String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="classe")
    private Set<CoursClassroom> utilisateur;
}
