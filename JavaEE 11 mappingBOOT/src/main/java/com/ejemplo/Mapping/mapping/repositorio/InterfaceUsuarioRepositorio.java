package com.ejemplo.Mapping.mapping.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.Mapping.mapping.entidades.Usuario;

//componente Repositorio
@Repository
public interface InterfaceUsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	
	// ya no tenenmos que implementar los metodos de CRUD
		
}
