package com.backendargprograma.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendargprograma.Model.Contacto;
import com.backendargprograma.Security.AuthManager;
import com.backendargprograma.Service.ContactoService;

@RestController
@CrossOrigin
public class ContactosController {

    @Autowired
    private ContactoService service;

    @Autowired
    private AuthManager manager;

    @GetMapping("/contactos/get")
    public List<Contacto> getContactos() {
        return this.service.getContacto();
    }

    @PostMapping("/contactos/add")
    public void addContacto(@RequestBody Contacto c, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addContacto(c);
    }

    @PutMapping("/contactos/edit")
    public void editContacto(@RequestBody Contacto c, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addContacto(c);
    }

    @DeleteMapping("/contactos/delete/{id}")
    public void deleteContacto(@PathVariable int id, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.deleteContacto(id);
    }
}
