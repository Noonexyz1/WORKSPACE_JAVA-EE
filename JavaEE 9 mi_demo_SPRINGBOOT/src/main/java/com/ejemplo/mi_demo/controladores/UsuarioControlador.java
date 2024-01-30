package com.ejemplo.mi_demo.controladores;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.mi_demo.modelos.UsuarioModelo;
import com.ejemplo.mi_demo.servicios.UsuarioServicio;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {
	@Autowired
	UsuarioServicio usuarioServicio;
	
	@GetMapping
	public ArrayList<UsuarioModelo> obtenerUsuarios() {
		//http://localhost:8080/mi_demo/usuario
		return this.usuarioServicio.obtenerUsuarios();
	}
	
	@PostMapping
	public UsuarioModelo guardarUsuario(@RequestBody UsuarioModelo usuario) {
		//POST - Crear un objeto JSON (modifica por ID)
		//http://localhost:8080/mi_demo/usuario
		return this.usuarioServicio.guardarUsuario(usuario);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<UsuarioModelo> 
	                         obtenerUsuarioPorId(@PathVariable("id") Long id) {
		//http://localhost:8080/mi_demo/usuario/4
		return this.usuarioServicio.obtenerPorId(id);
	}
	
	// mientras mas rutas, mas servicios
	@GetMapping("/query")
	public ArrayList<UsuarioModelo> 
	obtenerUsuarioPorPrioridad(@RequestParam("prioridad")  Integer prioridad) {
		//GET con PARAMETROS
		//http://localhost:8080/mi_demo/usuario/query?prioridad=10
		return this.usuarioServicio.obtenerPorPrioridad(prioridad);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		//DELETE
		//http://localhost:8080/mi_demo/usuario/1
		boolean ok = this.usuarioServicio.eliminarUsuario(id);
		if (ok) {
			return "Se elimino el usuario con id " + id;
		} else {
			return "No se pudo eliminar el usuario con id " + id;
		}
	}
}
