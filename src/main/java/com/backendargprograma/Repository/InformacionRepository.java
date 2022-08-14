package com.backendargprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendargprograma.Model.Informacion;

@Repository
public interface InformacionRepository extends JpaRepository<Informacion, Integer>{
    
}
