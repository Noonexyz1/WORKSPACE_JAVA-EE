package com.ejemplo.Mapping.mapping.controlador;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.Mapping.mapping.entidades.Usuario;
import com.ejemplo.Mapping.mapping.servicio.InterfaceUsuarioServicio;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {

	@Autowired
	private InterfaceUsuarioServicio interfaceUsuarioServicio;
	
	//crear un nuevo usuario
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(interfaceUsuarioServicio.guardarUsuario(usuario));
	}
	
	// leer usuario
	@GetMapping("/{id}")
	public ResponseEntity<?> leer(@PathVariable(value = "id") Integer usuarioId) {
		Optional<Usuario> oUsuario = interfaceUsuarioServicio.encontrarPorID(usuarioId);
		if (!oUsuario.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		return ResponseEntity.ok(oUsuario);
	}
	
	// actualizar un usuario
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarUsuario(@RequestBody Usuario usuario, @PathVariable(value = "id") Integer idUsuario) {
		Optional<Usuario> usuario1 =  interfaceUsuarioServicio.encontrarPorID(idUsuario);
		if (!usuario1.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		// para copiar un objeto entero
		// BeanUtils.copyProperties(usuario, usuario1.get());
		
		// actualizando el usuario
		usuario1.get().setNombre(usuario.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(interfaceUsuarioServicio.guardarUsuario(usuario1.get()));
	}
	
	// borrar un usuario
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarUsuario(@PathVariable(value = "id") Integer id) {
		if (!interfaceUsuarioServicio.encontrarPorID(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		interfaceUsuarioServicio.eliminarPorId(id);
		return ResponseEntity.ok().build();
	}
	
	// leer todos los usuarios
	@GetMapping
	public List<Usuario> leerTodosLosUsuario() {
		List<Usuario> usuarios = StreamSupport
				.stream(interfaceUsuarioServicio.encotrarTodo().spliterator(), false)
				.collect(Collectors.toList());
		
		return usuarios;
	}
	
}







