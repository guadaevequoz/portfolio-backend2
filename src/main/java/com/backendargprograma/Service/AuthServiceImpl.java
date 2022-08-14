package com.backendargprograma.Service;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendargprograma.Model.Usuario;
import com.backendargprograma.Model.UsuarioDTO;
import com.backendargprograma.Repository.UsuarioRepository;
import com.backendargprograma.Security.AuthManager;
import com.backendargprograma.Security.JwtProvider;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UsuarioRepository usuarios;

    @Autowired
    private JwtProvider provider;

    @Autowired
    private AuthManager authManager;

    @Override
    public String login(HttpServletRequest request, HttpServletResponse response, UsuarioDTO usuario)
            throws IOException {

        if (request.getHeader("Authorization") != null) {
            response.setStatus(401);
            response.sendError(401, "Ya estás autenticado");
            return null;
        }

        if (authManager.validUser(usuario)) {
            Optional<Usuario> appUser = usuarios.findByUsername(usuario.getUsername());
            response.setStatus(200);
            return provider.generateToken(appUser.get()); // Formato: Bearer + <jwt>
        }

        response.setStatus(401);
        response.sendError(401, "Credenciales inválidas");
        return null;
    }

    @Override
    public boolean validate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return this.authManager.validToken(request, response);
    }

}
