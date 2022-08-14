package com.backendargprograma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendargprograma.Model.Educacion;


@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{

    
}