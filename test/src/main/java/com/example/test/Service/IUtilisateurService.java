package com.example.test.Service;

import com.example.test.Entity.CoursClassroom;
import com.example.test.Entity.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    public Utilisateur addUtilisateur (Utilisateur u);
    public Utilisateur updateUtilisateur (Utilisateur u);
    public void deleteUtilisateur (int UtilisateurId);
    public Utilisateur getUtilisateurById (int UtilisateurId);
    public List<Utilisateur> getAllUtilisateurs();
}
