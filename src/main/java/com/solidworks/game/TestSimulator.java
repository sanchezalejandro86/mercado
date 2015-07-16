package com.solidworks.game;

import com.solidworks.simulator.inversor.Bot;
import com.solidworks.simulator.inversor.Conservador;
import com.solidworks.simulator.mercado.Mercado;
import com.solidworks.simulator.negociable.Accion;

public class TestSimulator{

    public static void main(String[] args){
	System.out.println("Abrió el mercado..");
	//PANEL LIDER
	Mercado.getInstance().addNegociable(new Accion("PBR", 50d), 1000L);
	Mercado.getInstance().addNegociable(new Accion("GGAL", 20d), 1000L);
	Mercado.getInstance().addNegociable(new Accion("BMA", 30d), 1000L);
	
	//JUGADORES
	new Thread(new Bot("Bot1", 20d, new Conservador())).start();
	new Thread(new Bot("Bot2", 20d, new Conservador())).start();
	new Thread(new Bot("Bot3", 20d, new Conservador())).start();
	new Thread(new Bot("Bot4", 20d, new Conservador())).start();
	
	try{
	    Thread.sleep(10000);
	    Mercado.getInstance().setIsAbierto(false);
	    System.out.println("Cerró el mercado..");
	}catch (InterruptedException e){
	    e.printStackTrace();
	}
    }

}
