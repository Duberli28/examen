package com.examen.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.dao.DetalleFacturaDAO;
import com.examen.dao.FacturaDAO;
import com.examen.models.DetalleFactura;
import com.examen.models.Factura;

@RestController
@RequestMapping("detalleFactura")
public class DetalleFacturaRest {

/************** INYECTANDO DEPENDENCIAS********************/
	
	@Autowired
	private DetalleFacturaDAO detalleFacturaDAO;
	
	
	/************** CREANDO CRUD BASICO ********************/
	@PostMapping("/guardar")
	public void guardar(@RequestBody DetalleFactura detalleFacturas) {
		detalleFacturaDAO.save(detalleFacturas);
	}
	
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable ("codigo") Long codigo) {
		detalleFacturaDAO.deleteById(codigo);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody DetalleFactura detalleFactura) {
		detalleFacturaDAO.save(detalleFactura);
	}
	@GetMapping("/listar/{ruc}")
	public List<DetalleFactura> listar(@PathVariable("ruc")List<DetalleFactura> ruc){
		System.out.println("Listando por RUC");
		return detalleFacturaDAO.findAll();
		
/************** LISTAR FACTURAS Y DETALLE  ********************/
	
	
	}
}

