package com.examen.models;

import javax.persistence.*;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long codigo;
	
	private Long codigoFactura;
	
	private String producto;
	
	private Integer cantidad;
	
	private  float precio;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(Long codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
