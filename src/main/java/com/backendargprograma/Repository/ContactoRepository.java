package com.backendargprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backendargprograma.Model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
