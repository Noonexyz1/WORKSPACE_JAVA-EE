package com.ejemplo.Mapping.mapping.servicio;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ejemplo.Mapping.mapping.entidades.Producto;

public interface InterfaceProductoServicio {

	public Iterable<Producto> encotrarTodo();
	public Page<Producto> encotrarTodoPaginable(Pageable pageable);
	public Optional<Producto> encontrarPorID(Integer id);
	public Producto guardarProducto(Producto producto);
	public void eliminarPorId(Integer id);
	
}
