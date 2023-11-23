package com.evaluacion.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReserva;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_inicio;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_fin;
    
    private double total;
    private String estado;
    
    @ManyToOne
    private Usuario usuario;
    
    @ManyToOne
    private Habitacion habitacion;
    
	public Reserva(int idReserva, Date fecha_inicio, Date fecha_fin, double total, String estado, Usuario usuario,
			Habitacion habitacion) {
		this.idReserva = idReserva;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.total = total;
		this.estado = estado;
		this.usuario = usuario;
		this.habitacion = habitacion;
	}

	public Reserva() {

	}

	
	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin
				+ ", total=" + total + ", estado=" + estado + ", usuario=" + usuario + ", habitacion=" + habitacion
				+ "]";
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
}
