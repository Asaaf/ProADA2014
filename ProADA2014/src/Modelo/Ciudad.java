/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Asaaf
 */
public class Ciudad {

    public String codigo;
    public String nombre;
    public String codigoDpto;
    public String nombreDpto;
    public String latitud;
    public String longitud;
    public int x;
    public int y;

    public Ciudad() {
    }

    public Ciudad(String codigo, String nombre, String codigoDpto, String nombreDpto, String latitud, String longitud, int x, int y) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codigoDpto = codigoDpto;
        this.nombreDpto = nombreDpto;
        this.latitud = latitud;
        this.longitud = longitud;
        this.x = x;
        this.y = y;
    }
}
