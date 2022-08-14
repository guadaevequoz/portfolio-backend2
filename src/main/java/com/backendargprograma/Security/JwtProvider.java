package com.backendargprograma.Security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.backendargprograma.Model.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtProvider {

    @Value("${jwt.secret}")
    private String secret;

    public String generateToken(Usuario usuario) {
        return "Bearer " + Jwts.builder()
                .setSubject(usuario.getUsername())
                .signWith(SignatureAlgorithm.HS512, secret)
                .setIssuedAt(new Date())
                .compact();
    }

    public String getUserFromToken(String token) {
        String userData = Jwts.parser().setSigningKey(secret).parseClaimsJws(JwtProvider.getToken(token)).getBody()
                .getSubject();
        return userData;
    }

    public static String getToken(String token) {
        if (token != null)
            return token.replace("Bearer ", "");
        return null;
    }
}
