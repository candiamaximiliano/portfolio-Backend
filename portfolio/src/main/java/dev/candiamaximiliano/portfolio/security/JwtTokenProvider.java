package dev.candiamaximiliano.portfolio.security;

import java.util.Date;
import java.util.logging.Logger;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;


public class JwtTokenProvider {

    private static final Logger logger = Logger.getLogger(JwtTokenProvider.class.getName());

    private String jwtSecret;

    private int jwtExpirationInMs;
    
    public JwtTokenProvider(String jwtSecret, int jwtExpirationInMs) {
        this.jwtSecret = jwtSecret;
        this.jwtExpirationInMs = jwtExpirationInMs;
    }

    public String generateToken(Authentication authentication) {

        User user = (User) authentication.getPrincipal();
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

        return Jwts.builder()
                .setSubject(user.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token);
            return true;
        } catch (SignatureException ex) {
            logger.warning("Invalid JWT signature");
        } catch (MalformedJwtException ex) {
            logger.warning("Invalid JWT token");
        } catch (ExpiredJwtException ex) {
            logger.warning("Expired JWT token");
        } catch (UnsupportedJwtException ex) {
            logger.warning("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            logger.warning("JWT claims string is empty.");
        }
        return false;
    }

    public String getUsernameFromJWT(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(jwtSecret)
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }
}
