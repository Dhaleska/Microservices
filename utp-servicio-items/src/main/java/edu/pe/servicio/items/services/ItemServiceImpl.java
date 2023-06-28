package edu.pe.servicio.items.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.servicio.items.clientes.ProductoClienteRest;
import edu.pe.servicio.items.models.entities.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ProductoClienteRest clienteRest;
	
	@Override
	public List<Item> findAll() {
		
		return clienteRest.Listar().stream().map(p -> new Item(p,1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		
		return new Item(clienteRest.BuscarProducto(id),cantidad);
	}

}
