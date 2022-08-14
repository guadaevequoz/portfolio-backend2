package com.backendargprograma.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Experiencia;

@Service
public interface ExperienciaService {

    public List<Experiencia> getTrabajos();

    public void addTrabajo(Experiencia e);

    public void deleteTrabajo(int id);

}
