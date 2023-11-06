package com.example.test.Controller;

import com.example.test.Entity.Classe;
import com.example.test.Service.IClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Classe")
public class ClasseController {
    @Autowired
    IClasseService classeService;

    @PostMapping("/add-classe")
    public Classe addbloc(@RequestBody Classe c){
        Classe classe = classeService.addClasse(c);
        return classe;
    }
    @PutMapping("/update-classe/{ClasseId}")
    public Classe updateClasse(@PathVariable int ClasseId, @RequestBody Classe c){
        c.setCodeClasse(ClasseId);
        Classe updatedClasse = classeService.updateClasse(c);
        return  updatedClasse;
    }
    @DeleteMapping("/delete-classe/{ClasseId}")
    public void deleteClasse(@PathVariable int ClasseId){
        classeService.deleteClasse(ClasseId);
    }
    @GetMapping("/get-classe/{ClasseId}")
    public Classe getClasseById(@PathVariable int ClasseId){
        return classeService.getClasseById(ClasseId);
    }
    @GetMapping("/get-all-classes")
    public List<Classe> getAllClasses(){
        return classeService.getAllClasses();
    }
}
