package com.ejemplo.Mapping.mapping.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="us_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name="us_nombre")
	private String nombre;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="usuario")
	private List<Producto> productos;

	
	
	// constructor
	public Usuario() {
	}

	
	
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setUsuario(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setUsuario(null);

		return producto;
	}

}