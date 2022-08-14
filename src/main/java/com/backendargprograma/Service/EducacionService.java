package com.backendargprograma.Service;

import com.backendargprograma.Model.Educacion;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EducacionService {

    public List<Educacion> getEducacion();

    public void addEducacion(Educacion e);

    public void deleteEducacion(int id);

}
