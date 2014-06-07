/*
 * MAPA
 */
package Vista;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 *
 * @author Asaaf
 */
public class Mapa extends javax.swing.JPanel {

    int xEvent;
    int yEvent;
    int xMap;
    int yMap;
    int widthMap;
    int heightMap;
    private ImageIcon imagen;
    private int i = 1;

    public Mapa() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen.getImage(), xMap, yMap, widthMap, heightMap, this);
        }
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        xMap = point.x - xEvent - getLocationOnScreen().x;
        yMap = point.y - yEvent - getLocationOnScreen().y;
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xEvent = evt.getX();
        yEvent = evt.getY();
    }//GEN-LAST:event_formMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    void changeMap(String ruta) {
        imagen = new ImageIcon(getClass().getResource(ruta));
        xMap = 0;
        yMap = 0;
        widthMap = imagen.getIconWidth();
        heightMap = imagen.getIconHeight();
    }

    void zoom(int type) {
        switch (type) {
            case 0:
                widthMap = widthMap * i;
                heightMap = heightMap * i;
                i++;
                break;
            case 1:
                i++;
                widthMap = widthMap / i;
                heightMap = heightMap / i;
                i--;
                break;
        }
    }

}
