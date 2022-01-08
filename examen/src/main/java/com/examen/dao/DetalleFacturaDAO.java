package com.examen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.examen.models.DetalleFactura;

public interface DetalleFacturaDAO extends JpaRepository<DetalleFactura, Long>{
/*
	@Query("select d from DetalleFactura d where d.codigoFactura=?1")
	public List<DetalleFactura>DetalleFacturasList(Long codigoFactura);*/
}
