package com.backendargprograma.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name="mediosContacto")
public class Contacto extends Entrada {
    
    private String logo;

}
