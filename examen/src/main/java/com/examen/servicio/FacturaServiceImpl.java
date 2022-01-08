package com.examen.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.dao.FacturaDAO;
import com.examen.models.Factura;

@Service
public class FacturaServiceImpl implements FacturaService{

	@Autowired
	private FacturaDAO facturaDAO;
	
	@Override
	public Factura findById(Long codigo) {
		
	//	return  facturaDAO.findAll(codigo);
		
		return null;
	}

	
}
