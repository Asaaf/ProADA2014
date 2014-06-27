/*
 * MAPA
 */
package Vista;

import Modelo.CentroAbastecimiento;
import Modelo.CentroDistribucion;
import Modelo.Control;
import Modelo.Ruta;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Asaaf
 */
public class Mapa extends javax.swing.JPanel {

    private ImageIcon imagen = new ImageIcon(getClass().getResource("Imagenes/Mapas/Colombia.png"));
    Control control;
    boolean ubicarCentroDist;
    private boolean ubicarCentroAbast;
    private int ancho = imagen.getIconWidth();
    private int alto = imagen.getIconHeight();
    private boolean adicionarRuta;
    private int continuarTrazado = 0;
    private Point a;
    private Point b;
    String centroActual;

    public Mapa() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        setPreferredSize(new Dimension(ancho, alto));
        g.drawImage(imagen.getImage(), 0, 0, ancho, alto, this);
        if (control != null) {
            for (CentroDistribucion centro : control.centrosDistribucion) {
                crearIcono(0, centro.x, centro.y,centro.nombre);
            }
            for (CentroAbastecimiento centro : control.centrosAbastecimiento) {
                crearIcono(1, centro.x, centro.y,centro.nombre);
            }
        }
        g.setColor(Color.GREEN);
        for (Ruta ruta : control.rutas) {
            for (int i = 0; i < ruta.trazo.size() - 1; i++) {
                g.drawLine(ruta.trazo.get(i).x, ruta.trazo.get(i).y, ruta.trazo.get(i + 1).x, ruta.trazo.get(i + 1).y);
            }
        }
        if (a != null && b != null) {
            g.drawLine(a.x, a.y, b.x, b.y);
        }
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupCentros = new javax.swing.JPopupMenu();
        eliminarCentro = new javax.swing.JMenuItem();
        infoCentro = new javax.swing.JMenuItem();
        PopupClickDerecho = new javax.swing.JPopupMenu();
        TrazarNuevaRuta = new javax.swing.JMenuItem();

        eliminarCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/34.png"))); // NOI18N
        eliminarCentro.setText("Eliminar centro");
        PopupCentros.add(eliminarCentro);

        infoCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/38.png"))); // NOI18N
        infoCentro.setText("info");
        infoCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoCentroActionPerformed(evt);
            }
        });
        PopupCentros.add(infoCentro);

        TrazarNuevaRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/33.png"))); // NOI18N
        TrazarNuevaRuta.setText("Trazar nueva ruta");
        TrazarNuevaRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrazarNuevaRutaActionPerformed(evt);
            }
        });
        PopupClickDerecho.add(TrazarNuevaRuta);

        setComponentPopupMenu(PopupClickDerecho);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
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

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (ubicarCentroDist) {
            agregarCentroDistribucion(evt.getX(), evt.getY());
            ubicarCentroDist = false;
            control.principal.cambiarCursor("default");
        }
        if (ubicarCentroAbast) {
            agregarCentroAbastecimiento(evt.getX(), evt.getY());
            ubicarCentroAbast = false;
            control.principal.cambiarCursor("default");
        }
        if (adicionarRuta && continuarTrazado == 0) {
            a = evt.getPoint();
            control.adicionarPunto(a);
            continuarTrazado = JOptionPane.showConfirmDialog(null, "¿Continuar con el trazado?", "¿Desea continuar con el trazado de la ruta?", JOptionPane.YES_NO_OPTION, 2, new ImageIcon(getClass().getResource("Imagenes/Iconos/39.png")));
        }
        if (continuarTrazado == 1) {
            control.adicionarRuta();
            a = null;
            b = null;
            adicionarRuta = false;
            continuarTrazado = 0;
        }
    }//GEN-LAST:event_formMouseClicked

    private void TrazarNuevaRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrazarNuevaRutaActionPerformed
        JOptionPane.showMessageDialog(null, "Haga click en el mapa para definir el punto de partida", "Definir punto partida", JOptionPane.PLAIN_MESSAGE, new ImageIcon(getClass().getResource("Imagenes/Iconos/39.png")));
        adicionarRuta = true;
    }//GEN-LAST:event_TrazarNuevaRutaActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if (adicionarRuta && continuarTrazado == 0) {
            b = evt.getPoint();
        }
    }//GEN-LAST:event_formMouseMoved

    private void infoCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoCentroActionPerformed
        String info = control.obtenerInfoCentro(centroActual);
        String ruta = "";        
        if(info.contains("distribución")){
            ruta ="Imagenes/Iconos/30.png";
        }else{
            ruta ="Imagenes/Iconos/35.png";
        }
        ImageIcon icon = new ImageIcon(getClass().getResource(ruta));
        JOptionPane.showMessageDialog(null, info, centroActual, JOptionPane.PLAIN_MESSAGE, icon);
    }//GEN-LAST:event_infoCentroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu PopupCentros;
    private javax.swing.JPopupMenu PopupClickDerecho;
    private javax.swing.JMenuItem TrazarNuevaRuta;
    private javax.swing.JMenuItem eliminarCentro;
    private javax.swing.JMenuItem infoCentro;
    // End of variables declaration//GEN-END:variables
    void changeMap(String ruta) {
        imagen = new ImageIcon(getClass().getResource(ruta));
    }

    void ubicarCentroDist(boolean cursor2) {
        this.ubicarCentroDist = cursor2;
    }

    void ubicarCentroAbast(boolean cursor2) {
        this.ubicarCentroAbast = cursor2;
    }

    private MouseListener eventosCentro(final JLabel centro, final int tipo, final String nombre) {
        return new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                centroActual = nombre;
                PopupCentros.show(e.getComponent(), e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                switch (tipo) {
                    case 0:
                        centro.setIcon(new ImageIcon(getClass().getResource("Imagenes/Iconos/32.png")));
                        break;
                    case 1:
                        centro.setIcon(new ImageIcon(getClass().getResource("Imagenes/Iconos/37.png")));
                        break;
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                switch (tipo) {
                    case 0:
                        centro.setIcon(new ImageIcon(getClass().getResource("Imagenes/Iconos/31.png")));
                        break;
                    case 1:
                        centro.setIcon(new ImageIcon(getClass().getResource("Imagenes/Iconos/36.png")));
                        break;
                }
            }
        };
    }

    private void agregarCentroDistribucion(int x, int y) {
        String nombre = JOptionPane.showInputDialog("Nombre del centro de distribución: ");
        control.centrosDistribucion.add(new CentroDistribucion(x, y, nombre));
    }

    private void agregarCentroAbastecimiento(int x, int y) {
        String nombre = JOptionPane.showInputDialog("Nombre del centro de abastecimiento: ");
        control.centrosAbastecimiento.add(new CentroAbastecimiento(x, y, nombre));
    }

    private void crearIcono(int tipo, int x, int y, String nombre) {
        String rutaIcono = "";
        switch (tipo) {
            case 0:
                rutaIcono = "Imagenes/Iconos/31.png";
                break;
            case 1:
                rutaIcono = "Imagenes/Iconos/36.png";
                break;
        }
        JLabel icono = new JLabel(new ImageIcon(getClass().getResource(rutaIcono)));
        icono.setBounds(x - 16, y - 16, 40, 40);
        icono.addMouseListener(eventosCentro(icono, tipo, nombre));//Distribucion = 0
        add(icono);
    }

    void aumentar() {

    }

    void reducir() {

    }
}
