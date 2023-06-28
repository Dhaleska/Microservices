package edu.pe.servicio.producto.services;

import java.util.List;

import edu.pe.servicio.producto.models.entities.Producto;

public interface IProductoService {
	public List<Producto> findAll();

	public Producto findById(Long id);
}
