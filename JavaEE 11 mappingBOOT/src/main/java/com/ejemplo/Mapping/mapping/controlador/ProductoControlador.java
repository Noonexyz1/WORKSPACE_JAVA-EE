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

import com.ejemplo.Mapping.mapping.entidades.Producto;
import com.ejemplo.Mapping.mapping.servicio.InterfaceProductoServicio;

@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {

	@Autowired
	private InterfaceProductoServicio interfaceProductoServicio;
	
	//crear un nuevo producto
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Producto producto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(interfaceProductoServicio.guardarProducto(producto));
	}
	
	// leer producto
	@GetMapping("/{id}")
	public ResponseEntity<?> leer(@PathVariable(value = "id") Integer productoId) {
		Optional<Producto> oProducto = interfaceProductoServicio.encontrarPorID(productoId);
		if (!oProducto.isPresent()) {
			return ResponseEntity.notFound().build();
		} 
		return ResponseEntity.ok(oProducto);
	}
	
	// actualizar un producto
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarProducto(@RequestBody Producto producto, @PathVariable(value = "id") Integer idProducto) {
		Optional<Producto> producto1 =  interfaceProductoServicio.encontrarPorID(idProducto);
		if (!producto1.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		// para copiar un objeto entero
		// BeanUtils.copyProperties(producto, producto1.get());
		
		// actualizando el producto
		producto1.get().setNombre(producto.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(interfaceProductoServicio.guardarProducto(producto1.get()));
	}
	
	// borrar un producto
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarProducto(@PathVariable(value = "id") Integer id) {
		if (!interfaceProductoServicio.encontrarPorID(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		interfaceProductoServicio.eliminarPorId(id);
		return ResponseEntity.ok().build();
	}
	
	// leer todos los productos
	@GetMapping
	public List<Producto> leerTodosLosProductos() {
		List<Producto> productos = StreamSupport
				.stream(interfaceProductoServicio.encotrarTodo().spliterator(), false)
				.collect(Collectors.toList());
		
		return productos;
	}
	
	
}
