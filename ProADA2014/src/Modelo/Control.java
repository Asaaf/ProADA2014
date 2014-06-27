/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Principal;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Asaaf
 */
public class Control {

    public ArrayList<Departamento> departamentos;
    public ArrayList<Ciudad> ciudades;
    public ArrayList<Vehiculo> vehiculos;
    public ArrayList<CentroDistribucion> centrosDistribucion;
    public ArrayList<CentroAbastecimiento> centrosAbastecimiento;
    public Principal principal;
    public Archivos archivo;
    public ArrayList<Point> trazo;
    public ArrayList<Ruta> rutas;

    public Control(Principal principal) {
        System.out.println("Creando arreglos para almacenar los datos");
        this.principal = principal;
        departamentos = new ArrayList<>();
        ciudades = new ArrayList<>();
        vehiculos = new ArrayList<>();
        centrosDistribucion = new ArrayList<>();
        centrosAbastecimiento = new ArrayList<>();
        trazo = new ArrayList<>();
        rutas = new ArrayList<>();
        archivo = new Archivos();
    }

    public void initArray() {
        archivo.readCsv(this);
    }

    public void adicionarPunto(Point p) {
        trazo.add(p);
        System.out.println("Se adiciono el punto: " + p);
    }

    public void adicionarRuta() {
        rutas.add(new Ruta(trazo, rutas.size() + 1));
        System.out.println("Se adicionó la ruta");
        trazo = new ArrayList<>();
    }

    public String obtenerInfoCentro(String centroActual) {
        String info = "";
        int i = 0;
        for (CentroDistribucion centro : centrosDistribucion) {
            i++;
            if (centro.nombre.equals(centroActual)) {
                info = "Nombre: " + centro.nombre + "\nCodigo: " + i + "\nTipo: Centro de distribución";
            }
        }
        i = 0;
        for (CentroAbastecimiento centro : centrosAbastecimiento) {
            i++;
            if (centro.nombre.equals(centroActual)) {
                info = "Nombre: " + centro.nombre + "\nCodigo: " + i + "\nTipo: Centro de abastecimiento";
            }
        }
        return info;
    }

}
