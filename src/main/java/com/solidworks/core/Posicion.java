package com.solidworks.core;


public abstract class Posicion{

    protected Negociable negociable;
    private Double precioApertura;
    private Long cantidad;

    public Posicion(Negociable negociable, Double precio, Long cantidad){
	this.negociable = negociable;
	this.precioApertura = precio;
	this.cantidad = cantidad;
    }
    
    public Negociable getNegociable(){
        return negociable;
    }

    public void setNegociable(Negociable negociable){
        this.negociable = negociable;
    }

    public Double getPrecioApertura(){
        return precioApertura;
    }

    public void setPrecioApertura(Double precioApertura){
        this.precioApertura = precioApertura;
    }
    
    public Long getCantidad(){
        return cantidad;
    }

    public void setCantidad(Long cantidad){
        this.cantidad = cantidad;
    }
    
}
