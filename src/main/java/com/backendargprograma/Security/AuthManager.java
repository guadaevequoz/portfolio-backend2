package com.backendargprograma.Security;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.backendargprograma.Model.Usuario;
import com.backendargprograma.Model.UsuarioDTO;
import com.backendargprograma.Repository.UsuarioRepository;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class AuthManager {

    @Autowired
    private UsuarioRepository usuarios;

    @Autowired
    private JwtProvider provider;

    public boolean validUser(UsuarioDTO usuario) {
        Optional<Usuario> appUsuario = usuarios.findByUsername(usuario.getUsername());
        if (appUsuario.isPresent())
            return appUsuario.get().getPassword().equals(usuario.getPassword());

        return false;
    }

    public boolean validToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            String token = request.getHeader("Authorization");
            if (token != null) {
                return true;
            } else
                response.sendError(403, "Token vacío");
        } catch (MalformedJwtException e) {
            response.sendError(403, "Token inválido");
        } catch (UnsupportedJwtException e) {
            response.sendError(403, "Token no soportado");
        } catch (ExpiredJwtException e) {
            response.sendError(403, "Token expirado");
        } catch (IllegalArgumentException e) {
            response.sendError(403, "Token vacío");
        } catch (SignatureException e) {
            response.sendError(403, "Token inválido");
        }
        response.setStatus(403);
        return false;
    }

}
