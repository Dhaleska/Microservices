package com.utp.distribuido.proveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.distribuido.proveedores.models.entities.Proveedores;
import com.utp.distribuido.proveedores.services.IProveedoresServices;

import edu.pe.servicio.items.services.ItemService;

@RestController
public class ProveedoresController {
	@Autowired
	private ItemService itemService;
	
	@GetMapping("/listar")
	public List<Proveedores> listar(){
		return IProveedoresServices.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Proveedores detalle(Long id,String razonsocial) {
		return itemService.findById(id, razonsocial);
	}

}
