package com.backendargprograma.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backendargprograma.Model.UsuarioDTO;
import com.backendargprograma.Service.AuthService;

@RestController
@CrossOrigin
public class AuthController {
    
    @Autowired
    private AuthService service;

    @PostMapping("/login")
    public String login(@RequestBody UsuarioDTO usuario, HttpServletRequest request, HttpServletResponse response) throws IOException {
        return this.service.login(request, response, usuario);
    }

    @GetMapping("/validate")
    public boolean validate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return this.service.validate(request, response);
    }

}
