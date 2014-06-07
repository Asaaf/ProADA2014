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
public class Control {

    public ArrayList<Departamento> departamentos = new ArrayList<>();
    public ArrayList<Municipio> municipios = new ArrayList<>();
    public ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private Archivos archivo = new Archivos();

    public void initArray() {
        archivo.readCsv(this);
    }
    
}
