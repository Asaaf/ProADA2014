/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Asaaf
 */
public class CentroDistribucion {

    public int x;
    public int y;
    public String nombre;
    public ArrayList<Pedido> pedidos;

    public CentroDistribucion() {
    }

    public CentroDistribucion(int x, int y, String nombre) {
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }
    
    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }
}
