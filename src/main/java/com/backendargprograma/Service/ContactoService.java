package com.backendargprograma.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Contacto;

@Service
public interface ContactoService {

    public List<Contacto> getContacto();

    public void addContacto(Contacto c);

    public void deleteContacto(int id);

}
