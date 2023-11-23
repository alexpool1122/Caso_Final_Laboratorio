package com.evaluacion.service;

import java.util.Optional;

import com.evaluacion.model.Habitacion;

public interface HabitacionService {
	public Habitacion guardar(Habitacion habitacion);
	public Optional<Habitacion> buscar(Integer id);
	public void actualizar(Habitacion habitacion);
	public void eliminar(Integer id);
}
