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

import com.backendargprograma.Model.Educacion;
import com.backendargprograma.Security.AuthManager;
import com.backendargprograma.Service.EducacionService;

@RestController
@CrossOrigin
public class EducacionController {

    @Autowired
    private EducacionService service;

    @Autowired
    private AuthManager manager;

    @GetMapping("/educacion/get")
    public List<Educacion> getEducacion() {
        return this.service.getEducacion();
    }

    @PostMapping("/educacion/add")
    public void addEducacion(@RequestBody Educacion e, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (manager.validToken(request, response))
            this.service.addEducacion(e);
    }

    @PutMapping("/educacion/edit/")
    public void editEducacion(@RequestBody Educacion e, HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        if (this.manager.validToken(request, response))
            this.service.addEducacion(e);
    }

    @DeleteMapping("/educacion/delete/{id}")
    public void deleteEducacion(@PathVariable int id, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        if (this.manager.validToken(request, response)) {
            this.service.deleteEducacion(id);
        }
    }
}
