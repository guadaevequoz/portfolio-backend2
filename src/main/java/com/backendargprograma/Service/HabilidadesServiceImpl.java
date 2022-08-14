package com.backendargprograma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Habilidad;
import com.backendargprograma.Repository.HabilidadesRepository;

@Service
public class HabilidadesServiceImpl implements HabilidadesService {

    @Autowired
    private HabilidadesRepository habilidades;

    @Override
    public List<Habilidad> getHabilidades() {
        return this.habilidades.findAll();
    }

    @Override
    public void addHabilidad(Habilidad h) {
        this.habilidades.save(h);
    }

    @Override
    public void deleteHabilidad(int id) {
        if (this.habilidades.existsById(id))
            this.habilidades.deleteById(id);

    }

}
