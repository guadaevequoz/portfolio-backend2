package com.backendargprograma.Service;

import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Informacion;

@Service
public interface InformacionService {
    
    public Informacion getInformacion();
    public void editInformacion(Informacion i);

}
