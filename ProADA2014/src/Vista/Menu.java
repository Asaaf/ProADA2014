/*
 * MENU PRINCIPAL
 */
package Vista;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author David Asaaf Vergara Almanza
 */
public class Menu extends javax.swing.JPanel {

    public Principal principal;
    public Cuidades ciudades;
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
        initCiudades();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, 300, 700);
        g.setColor(new Color(224, 226, 228, 70));
        g.fillRect(x - 15, 5, 280, 580);
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(x - 15, 5, 280, 580);
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
            ciudades.setBounds(x - 10, y - 10, 270, 540);
        } else if (x >= -280 && ocultar) {
            x--;
            ciudades.setBounds(x - 10, y - 10, 270, 540);
        }
    }

    private void initCiudades() {
        System.out.println("Creando menu ciudades");
        ciudades = new Cuidades(principal);
        ciudades.setBounds(x - 10, y - 10, 270, 540);
        add(ciudades);
    }
}
