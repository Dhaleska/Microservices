package edu.pe.servicio.producto.models.dao;

import org.springframework.data.repository.CrudRepository;

import edu.pe.servicio.producto.models.entities.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long> {

}
