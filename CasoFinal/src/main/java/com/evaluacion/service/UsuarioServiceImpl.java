package com.evaluacion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.model.Usuario;
import com.evaluacion.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario guardar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Optional<Usuario> buscar(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public void actualizar(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	@Override
	public void eliminar(Integer id) {
		usuarioRepository.deleteById(id);
	}

}
