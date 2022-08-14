package com.backendargprograma.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name = "trabajos")
public class Experiencia extends EntradaConFechas {

    @Column (nullable = false)
    private ArrayList<String> competencias;

}
