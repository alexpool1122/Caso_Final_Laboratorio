package com.evaluacion.service;

import java.util.Optional;

import com.evaluacion.model.Reserva;

public interface ReservaService {
	public Reserva guardar(Reserva reserva);
	public Optional<Reserva> buscar(Integer id);
	public void actualizar(Reserva reserva);
	public void eliminar(Integer id);
}
