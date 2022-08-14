package com.backendargprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendargprograma.Model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer>{
    
}
