package com.backendargprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendargprograma.Model.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Integer>{
    
}
