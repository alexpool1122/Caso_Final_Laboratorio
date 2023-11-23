package com.evaluacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.model.Habitacion;

@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer> {

}
