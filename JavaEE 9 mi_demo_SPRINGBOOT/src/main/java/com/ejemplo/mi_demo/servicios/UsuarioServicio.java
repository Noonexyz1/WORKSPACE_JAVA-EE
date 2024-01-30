package com.ejemplo.mi_demo.servicios;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.mi_demo.modelos.UsuarioModelo;
import com.ejemplo.mi_demo.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServicio {
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	public ArrayList<UsuarioModelo> obtenerUsuarios() {
		return (ArrayList<UsuarioModelo>) usuarioRepositorio.findAll();
	}
	
	public UsuarioModelo guardarUsuario(UsuarioModelo usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
	public Optional<UsuarioModelo> obtenerPorId(Long id) {
		return usuarioRepositorio.findById(id);
	}
	
	public ArrayList<UsuarioModelo> obtenerPorPrioridad(Integer priodidad) {
		return usuarioRepositorio.findByPrioridad(priodidad);
	}
	
	public boolean eliminarUsuario(Long id){
		try {
			usuarioRepositorio.deleteById(id);
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		
	}
	
}
