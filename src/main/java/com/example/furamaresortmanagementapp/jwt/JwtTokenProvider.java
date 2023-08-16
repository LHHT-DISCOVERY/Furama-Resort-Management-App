package com.example.furamaresortmanagementapp.jwt;

import io.jsonwebtoken.*;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

import org.slf4j.Logger;


@Component
public class JwtTokenProvider implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(JwtTokenProvider.class);

    private String JWT_SECRET = "secretkey";

    private long JWT_EXPIRATION = 604800000L;

    public String generateToken(String username) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + JWT_EXPIRATION);
        return Jwts.builder().setSubject(username).setIssuedAt(now).setExpiration(expiryDate).signWith(SignatureAlgorithm.ES512, JWT_SECRET).compact();
    }

    public String getUsernameFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJwt(token).getBody().getSubject();
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(JWT_SECRET).parseClaimsJwt(authToken);
            return true;
        } catch (SignatureException e) {
            logger.error("Invalid JWT signature: {}" + e.getMessage());
        } catch (MalformedJwtException e) {
            logger.error("Invalid JWT token: {}" + e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("JWT token expired: {}" + e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("JWT Unsupported: {}" + e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("JWT claims string is empty: {}", e.getMessage());
        }
        return false;
    }
}
