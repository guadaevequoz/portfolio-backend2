package com.backendargprograma.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class EntradaConFechas extends Entrada {

    @Column(nullable = false)
    protected boolean terminado;

    @Column(nullable = false)
    protected LocalDate fechaInicio;

    protected LocalDate fechaFin;
    @Column(nullable = false)
    protected String institucion;

    protected String tipo;

    public boolean getTerminado() {
        return this.terminado;
    }

}
