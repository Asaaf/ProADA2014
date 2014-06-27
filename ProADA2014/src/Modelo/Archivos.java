/*
 * ARCHIVOS
 */
package Modelo;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Asaaf
 */
public class Archivos implements Serializable {

    Control control;

    public void readCsv(Control control) {
        try {
            CsvReader departamentos_import = new CsvReader(getClass().getResource("../Datos/departamentosColombia.csv").getFile());
            CsvReader municipios_import = new CsvReader(getClass().getResource("../Datos/municipiosColombia.csv").getFile());

            departamentos_import.readHeaders();
            municipios_import.readHeaders();

            while (departamentos_import.readRecord()) {
                String codigo = departamentos_import.get(0);
                String nombre = departamentos_import.get(1);
                String latitud = departamentos_import.get(2);
                String longitud = departamentos_import.get(3);
                control.departamentos.add(new Departamento(codigo, nombre, latitud, longitud));
            }

            while (municipios_import.readRecord()) {
                String codigo = municipios_import.get(0);
                String nombre = municipios_import.get(1);
                String codigoDpto = municipios_import.get(2);
                String nombreDpto = municipios_import.get(3);
                String latitud = municipios_import.get(4);
                String longitud = municipios_import.get(5);
                control.ciudades.add(new Ciudad(codigo, nombre, codigoDpto, nombreDpto, latitud, longitud, 0, 0));
            }

            departamentos_import.close();
            municipios_import.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public void exportCsv(String ruta) {
        boolean alreadyExists = new File(getClass().getResource(ruta).getFile()).exists();
        if (alreadyExists) {
            File ficheroUsuarios = new File(getClass().getResource(ruta).getFile());
            ficheroUsuarios.delete();
        }
        try {
            CsvWriter csvOutput = new CsvWriter(new FileWriter(getClass().getResource(ruta).getFile(), true), ',');
            if (ruta.contains("departamentos")) {
                csvOutput.write("codigo");
                csvOutput.write("nombre");
                csvOutput.write("latitud");
                csvOutput.write("longitud");
                csvOutput.endRecord();
                for (Departamento dpto : control.departamentos) {
                    csvOutput.write(dpto.getCodigo());
                    csvOutput.write(dpto.getNombre());
                    csvOutput.write(dpto.getLatitud());
                    csvOutput.write(dpto.getLongitud());
                    csvOutput.endRecord();
                }
            } else {
                csvOutput.write("codigo");
                csvOutput.write("nombre");
                csvOutput.write("codigoDpto");
                csvOutput.write("nombreDpto");
                csvOutput.write("latitud");
                csvOutput.write("longitud");
                csvOutput.endRecord();
                for (Ciudad municipio : control.ciudades) {
                    csvOutput.write(municipio.codigo);
                    csvOutput.write(municipio.nombre);
                    csvOutput.write(municipio.codigoDpto);
                    csvOutput.write(municipio.nombreDpto);
                    csvOutput.write(municipio.latitud);
                    csvOutput.write(municipio.longitud);
                    csvOutput.endRecord();
                }
            }
            csvOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
