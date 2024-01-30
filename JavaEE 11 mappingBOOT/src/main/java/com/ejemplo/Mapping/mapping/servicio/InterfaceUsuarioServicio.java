package com.ejemplo.Mapping.mapping.servicio;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ejemplo.Mapping.mapping.entidades.Usuario;

public interface InterfaceUsuarioServicio {

	public Iterable<Usuario> encotrarTodo();
	public Page<Usuario> encotrarTodoPaginable(Pageable pageable);
	public Optional<Usuario> encontrarPorID(Integer id);
	public Usuario guardarUsuario(Usuario usuario);
	public void eliminarPorId(Integer id);
	
}
