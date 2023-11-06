package com.example.test.Service;

import com.example.test.Entity.Utilisateur;
import com.example.test.Repository.ClasseRepository;
import com.example.test.Repository.UtilisteurRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UtilisateurServiceImpl implements IUtilisateurService{
    @Autowired
    UtilisteurRepository utilisteurRepository;
    @Override
    public Utilisateur addUtilisateur(Utilisateur u) {
        return utilisteurRepository.save(u);
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur u) {
        return utilisteurRepository.save(u);
    }

    @Override
    public void deleteUtilisateur(int UtilisateurId) {
        utilisteurRepository.deleteById(UtilisateurId);
    }

    @Override
    public Utilisateur getUtilisateurById(int UtilisateurId) {
        Optional<Utilisateur> blocOptional = utilisteurRepository.findById(UtilisateurId) ;
        return blocOptional.orElseThrow(() -> new EntityNotFoundException("Utilisateur not found with ID: " + UtilisateurId));
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisteurRepository.findAll();
    }
}
