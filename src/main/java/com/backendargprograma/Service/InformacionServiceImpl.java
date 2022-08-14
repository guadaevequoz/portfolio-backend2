package com.backendargprograma.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Informacion;
import com.backendargprograma.Repository.InformacionRepository;

@Service
public class InformacionServiceImpl implements InformacionService {

    @Autowired
    private InformacionRepository informacion;

    @Override
    public Informacion getInformacion() {
        return this.informacion.findAll().get(0);
    }

    @Override
    public void editInformacion(Informacion i) {
        this.informacion.save(i);
    }
    
}
