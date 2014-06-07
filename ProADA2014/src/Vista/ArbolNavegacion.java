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
public class ArbolNavegacion extends javax.swing.JPanel {

    Control control = new Control();
    private Menu menu;

    public ArbolNavegacion(Menu menu) {
        this.menu = menu;
        initComponents();
        initNavigationTree();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbolNavegacion = new javax.swing.JTree();

        arbolNavegacion.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                arbolNavegacionValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(arbolNavegacion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arbolNavegacionValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_arbolNavegacionValueChanged
        TreePath tree = arbolNavegacion.getSelectionModel().getLeadSelectionPath();
        if (tree.getPath().length > 1) {
            menu.mapa.changeMap("Imagenes/Mapas/"+tree.getPath()[1].toString()+".png");
        }
    }//GEN-LAST:event_arbolNavegacionValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbolNavegacion;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void initNavigationTree() {
        control.initArray();
        style();
        DefaultMutableTreeNode dpto = new DefaultMutableTreeNode("Departamentos");
        DefaultTreeModel modelo = new DefaultTreeModel(dpto);
        arbolNavegacion.setModel(modelo);

        for (int i = 0; i < control.departamentos.size(); i++) {
            DefaultMutableTreeNode dptoName = new DefaultMutableTreeNode(control.departamentos.get(i).getNombre());
            for (int j = 0; j < control.municipios.size(); j++) {
                if (control.municipios.get(j).getCodigoDpto().equals(control.departamentos.get(i).getCodigo())) {
                    DefaultMutableTreeNode munName = new DefaultMutableTreeNode(control.municipios.get(j).getNombre());
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
