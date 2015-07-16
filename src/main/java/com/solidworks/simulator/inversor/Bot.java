package com.solidworks.simulator.inversor;

import com.solidworks.core.Estrategia;
import com.solidworks.core.Jugador;
import com.solidworks.core.Negociable;
import com.solidworks.core.Posicion;
import com.solidworks.simulator.mercado.Mercado;


public class Bot extends Jugador implements Runnable{

    private String nombre;
    private Double credito;

    public Bot(String nombre, Double creditoInicial, Estrategia perfil){
	super(perfil);
	this.nombre = nombre;
	this.credito = creditoInicial;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public Double getCredito(){
        return this.credito;
    }

    public void run(){
	while(Mercado.getInstance().isAbierto()){
	    //Compras
	    for (Negociable n : Mercado.getInstance().getNegociables().keySet()){
		this.estrategia.analizarCompra(n);
	    }
	    
	    //Ventas
	    for(Posicion p : this.getPortafolio()){
		this.estrategia.analizarVenta(p);
	    }
	}
    }
}
