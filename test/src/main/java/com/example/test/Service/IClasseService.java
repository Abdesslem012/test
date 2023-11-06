package com.example.test.Service;

import com.example.test.Entity.Classe;
import com.example.test.Entity.CoursClassroom;

import java.util.List;
import java.util.Optional;

public interface IClasseService {
    public Classe addClasse (Classe c);
    public Classe updateClasse (Classe c);
    public void deleteClasse (int ClasseId);
    public Classe getClasseById (int ClasseId);
    public List<Classe> getAllClasses();
}
