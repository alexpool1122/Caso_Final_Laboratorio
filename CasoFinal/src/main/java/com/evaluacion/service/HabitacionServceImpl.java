package com.evaluacion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.model.Habitacion;
import com.evaluacion.repository.HabitacionRepository;

@Service
public class HabitacionServceImpl implements HabitacionService {

	@Autowired 
	private HabitacionRepository habitacionRepository;
	
	@Override
	public Habitacion guardar(Habitacion habitacion) {
		return habitacionRepository.save(habitacion);
	}

	@Override
	public Optional<Habitacion> buscar(Integer id) {
		return habitacionRepository.findById(id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		habitacionRepository.save(habitacion);
		
	}

	@Override
	public void eliminar(Integer id) {
		habitacionRepository.deleteById(id);
	}

}
