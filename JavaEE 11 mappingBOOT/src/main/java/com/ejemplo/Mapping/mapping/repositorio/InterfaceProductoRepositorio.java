package com.ejemplo.Mapping.mapping.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.Mapping.mapping.entidades.Producto;

@Repository
public interface InterfaceProductoRepositorio extends JpaRepository<Producto, Integer>{
	
	// ya no tenenmos que implementar los metodos de CRUD
	
}
