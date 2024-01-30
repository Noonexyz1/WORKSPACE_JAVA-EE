package com.ejemplo.Mapping.mapping.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.Mapping.mapping.entidades.Usuario;
import com.ejemplo.Mapping.mapping.repositorio.InterfaceUsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements InterfaceUsuarioServicio {

	@Autowired
	private InterfaceUsuarioRepositorio interfaceUsuarioRepositorio;
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> encotrarTodo() {
		return interfaceUsuarioRepositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Usuario> encotrarTodoPaginable(Pageable pageable) {
		return interfaceUsuarioRepositorio.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> encontrarPorID(Integer id) {
		return interfaceUsuarioRepositorio.findById(id);
	}

	@Override
	@Transactional
	public Usuario guardarUsuario(Usuario usuario) {
		return interfaceUsuarioRepositorio.save(usuario);
	}

	@Override
	@Transactional
	public void eliminarPorId(Integer id) {
		interfaceUsuarioRepositorio.deleteById(id);
	}

	

}
