/*
 * INTRODUCCION
 */
package Vista;

import Vista.Principal;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 * @author Asaaf
 */
public class Intro extends javax.swing.JPanel implements Runnable {
            
    private Principal principal;

    public Intro(Principal principal) {
        initComponents();
        initThread();
        this.principal = principal;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(new ImageIcon(getClass().getResource("Imagenes/Intro/fondo.jpg")).getImage(), 0, 0, 1200, 700, this);
        g.drawImage(new ImageIcon(getClass().getResource("Imagenes/Intro/logo.gif")).getImage(), 500, 255, 200, 211, this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Cargando el sistema de abastecimiento y distribución de productos...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(406, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void run() {
        try {            
            Thread.sleep(3000);
            setVisible(false);
            principal.menu.setVisible(true);
            principal.jMenuBar.setVisible(true);
            principal.mapa1.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(Intro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initThread() {
        Thread h = new Thread(this);
        h.start();
    }
}
