/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Asaaf
 */
public class Ruta {

    public ArrayList<Point> trazo;
    public int codigo;

    public Ruta() {
    }

    public Ruta(ArrayList<Point> trazo, int codigo) {
        this.trazo = trazo;
        this.codigo = codigo;
    }
}
