package com.backendargprograma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Proyecto;
import com.backendargprograma.Repository.ProyectoRepository;

@Service
public class ProyectoServiceImpl implements ProyectoService {

    @Autowired
    private ProyectoRepository proyectos;

    @Override
    public List<Proyecto> getProyectos() {
        return this.proyectos.findAll();
    }

    @Override
    public void addProyecto(Proyecto p) {
        this.proyectos.save(p);
    }

    @Override
    public void deleteProyecto(int id) {
        if (this.proyectos.existsById(id))
            this.proyectos.deleteById(id);
    }

}
