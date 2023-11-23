package com.evaluacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
