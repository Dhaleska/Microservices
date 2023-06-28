package com.utp.distribuido.proveedores.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.distribuido.proveedores.clientes.ProductoClienteRest;
import com.utp.distribuido.proveedores.models.entities.Producto;
import com.utp.distribuido.proveedores.models.entities.Proveedores;



@Service
public class ProveedoresServiceImpl {
	@Autowired
	private ProductoClienteRest clienteRest;
	
	@Override
	public List<Proveedores> findAll(Producto producto,String razonsocial) {
	    return clienteRest.Listar()
	        .stream()
	        .map(p -> new Proveedores(Producto, razonsocial))
	        .collect(Collectors.toList());
	}


	
	public Proveedores findById(Long id, String razonsocial) {
	    Producto producto = clienteRest.BuscarProducto(id);
	    return new Proveedores(producto, razonsocial);
	}

	

}
