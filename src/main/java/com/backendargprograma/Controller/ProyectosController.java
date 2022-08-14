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

import com.backendargprograma.Model.Proyecto;
import com.backendargprograma.Security.AuthManager;
import com.backendargprograma.Service.ProyectoService;

@RestController
@CrossOrigin
public class ProyectosController {

    @Autowired
    private ProyectoService service;

    @Autowired
    private AuthManager manager;

    @GetMapping("/proyectos/get")
    public List<Proyecto> getProyectos() {
        return this.service.getProyectos();
    }

    @PostMapping("/proyectos/add")
    public void addProyecto(@RequestBody Proyecto p, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addProyecto(p);
    }

    @PutMapping("/proyectos/edit")
    public void editProyecto(@RequestBody Proyecto p, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addProyecto(p);
    }

    @DeleteMapping("/proyectos/delete/{id}")
    public void deleteProyecto(@PathVariable int id, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.deleteProyecto(id);
    }

}
