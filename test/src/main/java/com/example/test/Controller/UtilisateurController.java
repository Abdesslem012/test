package com.example.test.Controller;

import com.example.test.Entity.Utilisateur;
import com.example.test.Service.IUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Utilisateur")
public class UtilisateurController {
    @Autowired
    IUtilisateurService utilisateurService;
    @PostMapping("/add-utilisateur")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur u){
        Utilisateur utilisateur = utilisateurService.addUtilisateur(u);
        return utilisateur;
    }
    @PutMapping("/update-utilisateur/{UtilisateurId}")
    public Utilisateur updateUtilisateur(@PathVariable int UtilisateurId, @RequestBody Utilisateur u){
        u.setIdUtilisateur(UtilisateurId);
        Utilisateur updatedutilisateur = utilisateurService.updateUtilisateur(u);
        return  updatedutilisateur;
    }
    @DeleteMapping("/delete-utilisateur/{UtilisateurId}")
    public void deleteUtilisateur(@PathVariable int UtilisateurId){
        utilisateurService.deleteUtilisateur(UtilisateurId);
    }
    @GetMapping("/get-utilisateur/{UtilisateurId}")
    public Utilisateur getUtilisateurById(@PathVariable int UtilisateurId){
        return utilisateurService.getUtilisateurById(UtilisateurId);
    }
    @GetMapping("/get-all-utilisateurs")
    public List<Utilisateur> getAllUtilisateurs(){
        return utilisateurService.getAllUtilisateurs();
}
}