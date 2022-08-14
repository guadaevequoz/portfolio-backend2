package com.backendargprograma.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name="educacion")
public class Educacion extends EntradaConFechas {
    
    private double promedio;

    private String logo;

}
