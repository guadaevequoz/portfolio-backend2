package com.backendargprograma.Service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.backendargprograma.Model.UsuarioDTO;

@Service
public interface AuthService {
    
    public String login(HttpServletRequest request, HttpServletResponse response, UsuarioDTO usuario) throws IOException;

    public boolean validate(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
