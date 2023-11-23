package com.evaluacion.service;

import java.util.Optional;

import com.evaluacion.model.Usuario;

public interface UsuarioService {
	public Usuario guardar(Usuario usuario);
	public Optional<Usuario> buscar(Integer id);
	public void actualizar(Usuario usuario);
	public void eliminar(Integer id);
}
