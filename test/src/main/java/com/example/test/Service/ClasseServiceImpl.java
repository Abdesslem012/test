package com.example.test.Service;

import com.example.test.Entity.Classe;
import com.example.test.Repository.ClasseRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClasseServiceImpl implements IClasseService{
    @Autowired
    ClasseRepository classeRepository;
    @Override
    public Classe addClasse(Classe c) {
        return classeRepository.save(c);
    }

    @Override
    public Classe updateClasse(Classe c) {
        return classeRepository.save(c);
    }

    @Override
    public void deleteClasse(int ClasseId) {
        classeRepository.deleteById(ClasseId);

    }

    @Override
    public Classe getClasseById(int ClasseId) {
        Optional<Classe> blocOptional = classeRepository.findById(ClasseId) ;
        return blocOptional.orElseThrow(() -> new EntityNotFoundException("Classe not found with ID: " + ClasseId));
    }

    @Override
    public List<Classe> getAllClasses() {
        return classeRepository.findAll();
    }
}
