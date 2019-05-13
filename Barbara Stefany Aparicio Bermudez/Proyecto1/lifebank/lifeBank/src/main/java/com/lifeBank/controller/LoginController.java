package com.lifeBank.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lifeBank.pojo.LoginRequest;
import com.lifeBank.service.LoginService;


@RestController
public class LoginController {
	@Autowired
    private LoginService clienteService;
	@PostMapping("/login")
	public String login(@RequestBody LoginRequest logrequest, HttpServletRequest request) {
		String ipAddress = request.getRemoteAddr(); //ip de quien esta consumiendo el servicio
		String tkn = clienteService.validarSesion(logrequest.getUser(), logrequest.getPassword(), ipAddress);
		
		return tkn;
		
	}
}
