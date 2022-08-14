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

import com.backendargprograma.Model.Habilidad;
import com.backendargprograma.Security.AuthManager;
import com.backendargprograma.Service.HabilidadesService;

@RestController
@CrossOrigin
public class HabilidadesController {

    @Autowired
    private HabilidadesService service;

    @Autowired
    private AuthManager manager;

    @GetMapping("/habilidades/get")
    public List<Habilidad> getHabilidades() {
        return this.service.getHabilidades();
    }

    @CrossOrigin
    @PostMapping("/habilidades/add")
    public void addHabilidad(@RequestBody Habilidad h, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addHabilidad(h);
    }

    @CrossOrigin
    @PutMapping("/habilidades/edit")
    public void editHabilidad(@RequestBody Habilidad h, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addHabilidad(h);
    }

    @CrossOrigin
    @DeleteMapping("/habilidades/delete/{id}")
    public void deleteHabilidad(@PathVariable int id, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response))
            this.service.deleteHabilidad(id);
    }

}
