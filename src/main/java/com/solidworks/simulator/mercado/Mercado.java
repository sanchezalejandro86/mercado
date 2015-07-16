package com.solidworks.simulator.mercado;

import java.util.HashMap;
import java.util.Map;

import com.solidworks.core.Negociable;

public class Mercado{

    private static Mercado instance = new Mercado();

    public static Mercado getInstance(){
	return instance;
    }
    
    private Map<Negociable, Long> negociables;
    private boolean isAbierto;
    
    private Mercado(){
	this.negociables = new HashMap<Negociable, Long>();
	this.isAbierto = true;
    }

    public void addNegociable(Negociable negociable, Long cantidad){
	this.negociables.put(negociable, cantidad);
    }
    
    public Double getPuntaVendedora(Negociable n){
	return 0d;
    }
    
    public Double getPuntaCompradora(Negociable n){
	return 0d;
    }

    public boolean isAbierto(){
	return isAbierto;
    }
    
    public void setIsAbierto(boolean isAbierto){
	this.isAbierto = isAbierto;
    }

    public Map<Negociable, Long> getNegociables(){
	return this.negociables;
    }
}
