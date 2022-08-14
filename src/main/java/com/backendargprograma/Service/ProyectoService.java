package com.backendargprograma.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Proyecto;

@Service
public interface ProyectoService {

    public List<Proyecto> getProyectos();

    public void addProyecto(Proyecto p);

    public void deleteProyecto(int id);
}
