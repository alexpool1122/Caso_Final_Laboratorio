package com.evaluacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Habitaciones")
public class HabitacionController {
	@GetMapping("")
	public String habitaciones() {
		return "habitaciones";
	}
	
	@GetMapping("/Crear")
	public String crear() {
		return "crear";
	}
}
