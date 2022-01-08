package com.examen.rest;

import java.util.List;

import org.slf4j.*;
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
import com.examen.models.Factura;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("facturas")
public class FacturaRest {

	/************** INYECTANDO DEPENDENCIAS********************/
	
	@Autowired
	private FacturaDAO facturaDAO;
	
	@Autowired
	private DetalleFacturaDAO detalleFacturaDAO;
	
	
	/************** CREANDO CRUD BASICO ********************/
	
		@PostMapping("/guardar")
		public void guardar(@RequestBody Factura factura) {
			try{
			System.out.println("Guardando Datos de factura");
			facturaDAO.save(factura);
			}catch(RuntimeException re){
				System.out.println(re.getMessage());
			}
		}
	
	
	
	
	@GetMapping("/listar")
	public List<Factura> listar(){
		
		System.out.println("Listando Datos de factura");
		return facturaDAO.findAll();
		
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable ("codigo") Long codigo) {
		System.out.println("Eliminando Datos de factura");
		facturaDAO.deleteById(codigo);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Factura factura) {
		System.out.println("Actualizando Datos de factura");
		facturaDAO.save(factura);
	}
	
	/************** LISTAR FACTURAS Y DETALLE  ********************/
	
	@GetMapping("/listar/{ruc}")
	public List<Factura> listar(@PathVariable("ruc")List<Factura> ruc){
		System.out.println("Listando por RUC");
		return facturaDAO.findFacturaConDetalle();
	}
}
