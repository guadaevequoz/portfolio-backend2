package com.backendargprograma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Experiencia;
import com.backendargprograma.Repository.ExperienciaRepository;

@Service
public class ExperienciaServiceImpl implements ExperienciaService {

    @Autowired
    private ExperienciaRepository trabajos;

    @Override
    public List<Experiencia> getTrabajos() {
        return this.trabajos.findAll();
    }

    @Override
    public void addTrabajo(Experiencia e) {

        this.trabajos.save(e);
    }

    @Override
    public void deleteTrabajo(int id) {
        if (this.trabajos.existsById(id))
            this.trabajos.deleteById(id);
    }

}
