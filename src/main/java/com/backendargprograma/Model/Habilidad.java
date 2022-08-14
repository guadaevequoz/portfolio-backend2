package com.backendargprograma.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name="habilidades")
public class Habilidad extends Entrada {

    @Column(nullable = false)
    private double porcentaje;

    private String logo;
    private String color;
    
}
