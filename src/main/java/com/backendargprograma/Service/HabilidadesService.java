package com.backendargprograma.Service;

import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Habilidad;

import java.util.List;

@Service
public interface HabilidadesService {

    public List<Habilidad> getHabilidades();

    public void addHabilidad(Habilidad h);

    public void deleteHabilidad(int id);

}
