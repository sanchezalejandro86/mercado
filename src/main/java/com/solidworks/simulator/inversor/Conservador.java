package com.solidworks.simulator.inversor;

import com.solidworks.core.Estrategia;
import com.solidworks.core.Negociable;
import com.solidworks.core.Posicion;


public class Conservador implements Estrategia{

    private static final Double PORCENTAJE = 0.03d; // 3%

    public void analizarCompra(Negociable n){
	if(n.getCotizacion() < n.getValorReal()){
	    //TODO Comprar un %
	    System.out.println(Thread.currentThread().getName() + " compró X acciones de " + n.getNombre());
	}else if(n.getCotizacion() == n.getValorReal()){
	    //TODO Comprar menos
	    System.out.println(Thread.currentThread().getName() + " compró Y acciones de " + n.getNombre());
	}
    }

    public void analizarVenta(Posicion p){
	if(p.getNegociable().getCotizacion() > p.getPrecioApertura() * PORCENTAJE){
	    //TODO Vender
	}
    }
    
}
