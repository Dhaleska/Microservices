package com.utp.distribuido.proveedores.services;

import java.util.List;

import com.utp.distribuido.proveedores.models.entities.Proveedores;

public interface IProveedoresServices {
	public List<Proveedores> findAll();
	public Proveedores findById(Long id, String razonsocial);

}
