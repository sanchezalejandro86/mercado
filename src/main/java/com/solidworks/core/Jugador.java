package com.solidworks.core;

import java.util.ArrayList;
import java.util.List;

public abstract class Jugador{

    protected Estrategia estrategia;
    private List<Posicion> portafolio;
    
    public Jugador(Estrategia estrategia){
	this.estrategia = estrategia;
	this.portafolio = new ArrayList<Posicion>();
    }

    protected Estrategia getEstrategia(){
	return this.estrategia;
    }
    
    protected List<Posicion> getPortafolio(){
	return this.portafolio;
    }
    
    public abstract String getNombre();
    public abstract Double getCredito();
    
}
