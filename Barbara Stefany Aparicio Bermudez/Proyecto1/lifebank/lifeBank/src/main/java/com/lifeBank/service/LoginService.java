package com.lifeBank.service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeBank.model.entity.Usuario;
import com.lifeBank.model.repository.IUsuarioRepo;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class LoginService {
	@Autowired
    private IUsuarioRepo usuarioRepo;
 
	List<Usuario> lista = new ArrayList<Usuario>();

	
	public Usuario listaUsuario(String username) {
		Usuario cliente = usuarioRepo.getUsuario(username);
        return cliente;
	}
	
	
	public String validarSesion(String name, String pswr, String ipad) {
		Usuario user = new Usuario();
		String tkn= "la contraseña es incorrecta";
		String password = encryptSHA512(encryptBase64(name) + encryptBase64(pswr));
		
		
		try {
			user =listaUsuario(name);
			if (name.equals(user.getNomUsuario()) && password.equals(user.getPassword()))
				tkn = crearJWTToken(user.getNomUsuario(), ipad);
				
		}catch(Exception e){
		
			tkn="Usuario No se encuentra";
			
		}
		return tkn;
	}
	
	public String crearJWTToken(String cliente, String ipA) {
		LocalDateTime fecha = LocalDateTime.now();
		fecha = fecha.plusMinutes(30);
		
		String secretKey = "mySecretKey";
		
		Map<String,Object> header = new HashMap<String, Object>();
	    header.put("token", "lifeBank");
		
		return Jwts.builder()
				.setHeaderParams(header)
				//.setSubject(cliente)
				.claim("IP",ipA)
				.claim("ID",cliente)
				.claim("FechaExp",fecha)
				.setExpiration(new Date(System.currentTimeMillis() + 1800000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();
	}
	
	 public static String encryptSHA512(String contrasena) { 
	        try { 
	            MessageDigest md = MessageDigest.getInstance("SHA-512"); 
	            byte[] messageDigest = md.digest(contrasena.getBytes()); 
	            BigInteger no = new BigInteger(1, messageDigest); 
	            String hashtext = no.toString(16); 
	  
	            while (hashtext.length() < 32) { 
	                hashtext = "0" + hashtext; 
	            }  
	            return hashtext; 
	        } 
	        catch (NoSuchAlgorithmException e) { 
	            throw new RuntimeException(e); 
	        } 
	    }
	 
	 public static String encryptBase64(String a){
	        Base64.Encoder encoder = Base64.getEncoder();
	        String cadena = encoder.encodeToString(a.getBytes(StandardCharsets.UTF_8) );        
	        return cadena;
	    }
	
	
	
	
	
}
