package com.ejemplo.mi_demo.repositorios;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.mi_demo.modelos.UsuarioModelo;

@Repository
public interface UsuarioRepositorio extends 
										   CrudRepository<UsuarioModelo, Long>{
	
	//este metodo se debe llamar adecuadamente (  findBy...(...);  )
	public abstract ArrayList<UsuarioModelo> findByPrioridad(Integer prioridad);
	

}
