package com.backendargprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendargprograma.Model.Habilidad;

@Repository
public interface HabilidadesRepository extends JpaRepository<Habilidad, Integer> {
    
}
