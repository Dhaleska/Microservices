package edu.pe.servicio.producto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.servicio.producto.models.entities.Producto;
import edu.pe.servicio.producto.services.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@GetMapping("/productos")
	public List<Producto> Listar() {
		return productoService.findAll();
	}

	@GetMapping("/ver/{id}")
	public Producto BuscarProducto(@PathVariable Long id) {
		return productoService.findById(id);
	}

}
