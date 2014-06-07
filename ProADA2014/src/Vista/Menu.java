/*
 * MENU PRINCIPAL
 */
package Vista;

import Modelo.Control;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 * @author David Asaaf Vergara Almanza
 */
public class Menu extends javax.swing.JPanel {

    public Principal principal;
    public Control control;
    public ArbolNavegacion AN;
    public Mapa mapa;
    public Multas multas;
    public Vehiculos vehiculos;
    public CentrosAbastecimiento centrosAbastecimiento;
    public CentrosDistribucion centrosDistribucion;
    public boolean ocultar;

    int x = -280;//posicion inicial en x para animar los botones
    int y = 20;//posicion inicial en y para ubicar los botones

    public Menu(Principal principal) {
        initComponents();
        this.principal = principal;
        initMultas();
        initVehiculos();
        initArbolNavegacion();
        initCentrosDistribucion();
        initCentrosAbastecimiento();
        initMapa();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon(getClass().getResource("Imagenes/Fondo/1.jpg")).getImage(), 0, 0, principal.getWidth(), principal.getHeight(), this);
        //PIANAR COANENEDOR GRIS DEL TOOLBAR        
        g.setColor(new Color(224, 226, 228, 70));
        g.fillRect(x - 15, 5, 285, 605);
        g.setColor(Color.GRAY);
        g.drawRect(x - 15, 5, 285, 605);
        //-------------------------------        

        animate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    public void animate() {
        if (x <= 20 && !ocultar) {
            x++;
            AN.setBounds(x - 10, y - 10, 270, 540);
        } else if (x >= -280 && ocultar) {
            x--;
            AN.setBounds(x - 10, y - 10, 270, 540);
        }
    }

    private void initArbolNavegacion() {
        AN = new ArbolNavegacion(this);
        AN.setBounds(x - 10, y - 10, 270, 540);
        add(AN);
    }

    private void initMapa() {
        mapa = new Mapa();
        mapa.setBounds(340, 5, 605, 605);
        add(mapa);
    }

    private void initMultas() {
        multas = new Multas();
        multas.setBounds(300, 100, 650, 450);
        multas.setVisible(false);
        add(multas);
    }

    private void initVehiculos() {
        vehiculos = new Vehiculos();
        vehiculos.setBounds(300, 100, 650, 450);
        vehiculos.setVisible(false);
        add(vehiculos);
    }

    private void initCentrosDistribucion() {
        centrosDistribucion = new CentrosDistribucion();
        centrosDistribucion.setBounds(300, 100, 650, 450);
        centrosDistribucion.setVisible(false);
        add(centrosDistribucion);
    }

    private void initCentrosAbastecimiento() {
        centrosAbastecimiento = new CentrosAbastecimiento();
        centrosAbastecimiento.setBounds(300, 100, 650, 450);
        centrosAbastecimiento.setVisible(false);
        add(centrosAbastecimiento);
    }

    void ocultarFormularios() {
        multas.setVisible(false);
        centrosAbastecimiento.setVisible(false);
        centrosDistribucion.setVisible(false);
        vehiculos.setVisible(false);        
    }

}
