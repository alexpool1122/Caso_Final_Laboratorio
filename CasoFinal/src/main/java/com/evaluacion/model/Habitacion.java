package com.evaluacion.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHabitacion;
	
    private int numero;
    private String tipo;
    private double precio;
    
    @OneToMany(mappedBy = "habitacion")
    private List<Reserva> reserva;
    
	public Habitacion(int idHabitacion, int numero, String tipo, double precio) {
		this.idHabitacion = idHabitacion;
		this.numero = numero;
		this.tipo = tipo;
		this.precio = precio;
	}

	public Habitacion() {

	}

	@Override
	public String toString() {
		return "Habitacion [idHabitacion=" + idHabitacion + ", numero=" + numero + ", tipo=" + tipo + ", precio="
				+ precio + "]";
	}

	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}
}
