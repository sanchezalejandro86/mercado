package com.solidworks.core;

public interface Estrategia{

    void analizarCompra(Negociable n);
    void analizarVenta(Posicion p);
}
