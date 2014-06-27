/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Control;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Asaaf
 */
public class Cuidades extends javax.swing.JPanel {

    private Principal principal;
    Control control;

    public Cuidades(Principal principal) {
        initComponents();
        this.principal = principal;
        control = new Control(principal);
        initNavigationTree();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Scroll = new javax.swing.JScrollPane();
        arbolNavegacion = new javax.swing.JTree();

        arbolNavegacion.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                arbolNavegacionValueChanged(evt);
            }
        });
        Scroll.setViewportView(arbolNavegacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arbolNavegacionValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_arbolNavegacionValueChanged
        TreePath tree = arbolNavegacion.getSelectionModel().getLeadSelectionPath();
        if (tree.getPath().length == 2) {
            principal.mapa1.changeMap("Imagenes/Mapas/" + tree.getPath()[1].toString() + ".png");
        } else {
            principal.mapa1.changeMap("Imagenes/Mapas/Colombia.png");
        }
    }//GEN-LAST:event_arbolNavegacionValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane Scroll;
    private javax.swing.JTree arbolNavegacion;
    // End of variables declaration//GEN-END:variables

    private void initNavigationTree() {
        System.out.println("Cargando datos");
        control.initArray();
        style();
        DefaultMutableTreeNode dpto = new DefaultMutableTreeNode("Colombia");
        DefaultTreeModel modelo = new DefaultTreeModel(dpto);
        arbolNavegacion.setModel(modelo);

        for (int i = 0; i < control.departamentos.size(); i++) {
            DefaultMutableTreeNode dptoName = new DefaultMutableTreeNode(control.departamentos.get(i).getNombre());
            for (int j = 0; j < control.ciudades.size(); j++) {
                if (control.ciudades.get(j).codigoDpto.equals(control.departamentos.get(i).getCodigo())) {
                    DefaultMutableTreeNode munName = new DefaultMutableTreeNode(control.ciudades.get(j).nombre);
                    modelo.insertNodeInto(munName, dptoName, 0);
                }
            }
            modelo.insertNodeInto(dptoName, dpto, i);
        }
    }

    private void style() {
        DefaultTreeCellRenderer render = (DefaultTreeCellRenderer) arbolNavegacion.getCellRenderer();
        render.setLeafIcon(new ImageIcon(getClass().getResource("Imagenes/Iconos/4.png")));
        render.setOpenIcon(new ImageIcon(getClass().getResource("Imagenes/Iconos/3.png")));
        render.setClosedIcon(new ImageIcon(getClass().getResource("Imagenes/Iconos/2.png")));
    }
}
