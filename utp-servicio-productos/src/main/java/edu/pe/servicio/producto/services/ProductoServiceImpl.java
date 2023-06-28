package edu.pe.servicio.producto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.servicio.producto.models.dao.IProductoDao;
import edu.pe.servicio.producto.models.entities.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDao productoDao;
	
	@Override
	public List<Producto> findAll() {
		
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		
		return productoDao.findById(id).orElse(null);
	}

}
