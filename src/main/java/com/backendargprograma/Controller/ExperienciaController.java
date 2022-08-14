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

import com.backendargprograma.Model.Experiencia;
import com.backendargprograma.Security.AuthManager;
import com.backendargprograma.Service.ExperienciaService;

@RestController
@CrossOrigin
public class ExperienciaController {

    @Autowired
    private ExperienciaService service;

    @Autowired
    private AuthManager manager;

    @GetMapping("/trabajos/get")
    public List<Experiencia> getTrabajos() {
        return this.service.getTrabajos();
    }

    @PostMapping("/trabajos/add")
    public void addtrabajo(@RequestBody Experiencia e, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addTrabajo(e);
    }

    @PutMapping("/trabajos/edit")
    public void editTrabajo(@RequestBody Experiencia e, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addTrabajo(e);
    }

    @DeleteMapping("/trabajos/delete/{id}")
    public void deleteTrabajo(@PathVariable int id, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.deleteTrabajo(id);
    }
}
