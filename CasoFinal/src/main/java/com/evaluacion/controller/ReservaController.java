package com.evaluacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Reserva")
public class ReservaController {
	
	@GetMapping("")
	public String index() {
		return "index";
	}
}
