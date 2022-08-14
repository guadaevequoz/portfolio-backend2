package com.backendargprograma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Educacion;
import com.backendargprograma.Repository.EducacionRepository;

import java.util.List;

@Service
public class EducacionServiceImpl implements EducacionService {

    @Autowired
    private EducacionRepository educacion;

    @Override
    public List<Educacion> getEducacion() {
        return this.educacion.findAll();
    }

    @Override
    public void addEducacion(Educacion e) {
        this.educacion.save(e);
    }

    @Override
    public void deleteEducacion(int id) {
        if (this.educacion.existsById(id))
            this.educacion.deleteById(id);
    }

}
