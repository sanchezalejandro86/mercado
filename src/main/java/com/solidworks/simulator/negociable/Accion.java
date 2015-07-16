package com.solidworks.simulator.negociable;

import com.solidworks.core.Negociable;
import com.solidworks.simulator.mercado.Mercado;
import com.solidworks.simulator.operacion.Operacion;


public class Accion implements Negociable{

    private String nombre;
    private Double valorReal;
    
    public Accion(String nombre, Double valorReal){
	this.nombre = nombre;
	this.valorReal = valorReal;
    }
    
    public String getNombre(){
	return this.nombre;
    }

    public Double getCotizacion(){
	return this.getCotizacion(Operacion.COMPRA);
    }

    private Double getCotizacion(Operacion operacion){
	switch (operacion){
	    case COMPRA:
		return Mercado.getInstance().getPuntaVendedora(this);
	    case VENTA:
		return Mercado.getInstance().getPuntaVendedora(this);
	    default:
		throw new RuntimeException("Operacion no soportada: " + operacion);
	}
    }

    public Double getValorReal(){
	return this.valorReal;
    }
    
    public void setValorReal(Double valorReal){
	this.valorReal = valorReal;
    }
    
}
