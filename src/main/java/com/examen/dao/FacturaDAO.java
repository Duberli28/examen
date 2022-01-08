package com.examen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examen.models.Factura;

public interface FacturaDAO extends JpaRepository<Factura, Long> {

	@Query("select f from Factura f Inner Join DetalleFactura d on f.codigo = d.codigoFactura")
	public List<Factura>findFacturaConDetalle();
}
