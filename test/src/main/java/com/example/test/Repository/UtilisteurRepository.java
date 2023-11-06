package com.example.test.Repository;

import com.example.test.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisteurRepository extends JpaRepository<Utilisateur, Integer> {
}
