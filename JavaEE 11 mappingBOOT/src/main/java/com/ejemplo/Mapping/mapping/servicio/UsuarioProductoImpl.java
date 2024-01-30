package com.ejemplo.Mapping.mapping.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.Mapping.mapping.entidades.Producto;
import com.ejemplo.Mapping.mapping.repositorio.InterfaceProductoRepositorio;

@Service
public class UsuarioProductoImpl implements InterfaceProductoServicio {

	@Autowired
	private InterfaceProductoRepositorio interfaceProductoRepositorio;
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Producto> encotrarTodo() {
		return interfaceProductoRepositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> encotrarTodoPaginable(Pageable pageable) {
		return interfaceProductoRepositorio.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> encontrarPorID(Integer id) {
		return interfaceProductoRepositorio.findById(id);
	}

	@Override
	@Transactional
	public Producto guardarProducto(Producto producto) {
		return interfaceProductoRepositorio.save(producto);
	}

	@Override
	@Transactional
	public void eliminarPorId(Integer id) {
		interfaceProductoRepositorio.deleteById(id);
	}

}
