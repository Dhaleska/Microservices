package com.utp.distribuido.proveedores.models.entities;

import com.utp.distribuido.proveedores.models.entities.Proveedores;

public class Proveedores {
	private Producto producto;
	private String razonsocial;

	public Proveedores(Producto producto,String razonsocial) {
		this.producto = producto;
		this.razonsocial = razonsocial;
	}

	public Proveedores() {

	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	


}
