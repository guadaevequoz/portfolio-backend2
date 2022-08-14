package com.backendargprograma.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name="proyectos")
public class Proyecto extends Entrada {

    @Column(nullable = false)
    private String enlace;
    
}
