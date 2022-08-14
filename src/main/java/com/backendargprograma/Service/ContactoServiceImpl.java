package com.backendargprograma.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Contacto;
import com.backendargprograma.Repository.ContactoRepository;

@Service
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoRepository contactos;

    @Override
    public List<Contacto> getContacto() {
        return this.contactos.findAll();
    }

    @Override
    public void addContacto(Contacto c) {
        this.contactos.save(c);
    }

    @Override
    public void deleteContacto(int id) {
        if (this.contactos.existsById(id))
            this.contactos.deleteById(id);
    }

}
