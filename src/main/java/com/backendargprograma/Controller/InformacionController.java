package com.backendargprograma.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendargprograma.Model.Informacion;
import com.backendargprograma.Security.AuthManager;
import com.backendargprograma.Service.InformacionService;

@RestController
@CrossOrigin
public class InformacionController {
    
    @Autowired
    private InformacionService service;

    @Autowired
    private AuthManager manager;

    @GetMapping ("/informacion/get")
    public Informacion getInformacion(){
        return this.service.getInformacion();
    }

    @PutMapping ("/informacion/edit/{id}")
    public void editInformacion(@RequestBody Informacion i, @PathVariable int id, HttpServletRequest request, HttpServletResponse response) throws IOException{
        if (this.manager.validToken(request, response)) this.service.editInformacion(i);
    }

}
