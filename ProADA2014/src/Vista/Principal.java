/*
 * PRINCIPAL
 */
package Vista;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author David Asaaf Vergara Almanza
 */
public class Principal extends javax.swing.JFrame {

    Menu menu = new Menu(this);
    Intro intro = new Intro(this);
    private int x;
    private int y;

    public Principal() {
        initComponents();
        initSettingsMain();
        initScreen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarAgregar = new javax.swing.JToolBar();
        Guardar = new javax.swing.JButton();
        btnVehiculo = new javax.swing.JButton();
        btnMultas = new javax.swing.JButton();
        btnCentrosDistribucion = new javax.swing.JButton();
        btnCentrosAbastecimiento = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        btnCiudades = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnAumentar = new javax.swing.JButton();
        btnReducir = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemMaximizar = new javax.swing.JMenuItem();
        jMenuItemMinimizar = new javax.swing.JMenuItem();
        jMenuItemRestaurar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir1 = new javax.swing.JMenuItem();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemImportarDatos = new javax.swing.JMenuItem();
        jMenuItemExportarDatos = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jMenuItemAgragarMulta = new javax.swing.JMenuItem();
        jMenuItemAgregarProducto = new javax.swing.JMenuItem();
        jMenuItemAgregarVehiculo = new javax.swing.JMenuItem();
        jMenuItemAgregarAbastecimiento = new javax.swing.JMenuItem();
        jMenuItemAgregarDistribucion = new javax.swing.JMenuItem();
        jMenuItemNuevoPedido = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemAjustes = new javax.swing.JMenuItem();
        jMenuVer = new javax.swing.JMenu();
        jMenuHerramientas = new javax.swing.JMenu();
        jRadioButtonMenuItemVerArbolNavegacion = new javax.swing.JRadioButtonMenuItem();
        jMenuItemCentrosAbastecimiento = new javax.swing.JMenuItem();
        jMenuItemCentrosDistribucion = new javax.swing.JMenuItem();
        jMenuItemCiudades = new javax.swing.JMenuItem();
        jMenuItemMapa = new javax.swing.JMenuItem();
        jMenuItemMultas = new javax.swing.JMenuItem();
        jMenuItemPedidos = new javax.swing.JMenuItem();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuItemVehiculos = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemDocumentacion = new javax.swing.JMenuItem();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SADA");
        setName("principal"); // NOI18N
        setUndecorated(true);

        jToolBarAgregar.setBackground(new java.awt.Color(188, 199, 211));
        jToolBarAgregar.setFloatable(false);
        jToolBarAgregar.setRollover(true);

        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/10.png"))); // NOI18N
        Guardar.setToolTipText("Guardar todos los cambios efectuados");
        Guardar.setFocusable(false);
        Guardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Guardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarAgregar.add(Guardar);

        btnVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/11.png"))); // NOI18N
        btnVehiculo.setToolTipText("Vehiculos");
        btnVehiculo.setFocusable(false);
        btnVehiculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVehiculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculoActionPerformed(evt);
            }
        });
        jToolBarAgregar.add(btnVehiculo);

        btnMultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/12.png"))); // NOI18N
        btnMultas.setToolTipText("Multas");
        btnMultas.setFocusable(false);
        btnMultas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultasActionPerformed(evt);
            }
        });
        jToolBarAgregar.add(btnMultas);

        btnCentrosDistribucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/13.png"))); // NOI18N
        btnCentrosDistribucion.setToolTipText("Centros de distribución");
        btnCentrosDistribucion.setFocusable(false);
        btnCentrosDistribucion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCentrosDistribucion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCentrosDistribucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentrosDistribucionActionPerformed(evt);
            }
        });
        jToolBarAgregar.add(btnCentrosDistribucion);

        btnCentrosAbastecimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/14.png"))); // NOI18N
        btnCentrosAbastecimiento.setToolTipText("Centros de abastecimiento");
        btnCentrosAbastecimiento.setFocusable(false);
        btnCentrosAbastecimiento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCentrosAbastecimiento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCentrosAbastecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentrosAbastecimientoActionPerformed(evt);
            }
        });
        jToolBarAgregar.add(btnCentrosAbastecimiento);

        btnMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/23.png"))); // NOI18N
        btnMapa.setToolTipText("Mapa");
        btnMapa.setFocusable(false);
        btnMapa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMapa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarAgregar.add(btnMapa);

        btnCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/22.png"))); // NOI18N
        btnCiudades.setToolTipText("Ciudades");
        btnCiudades.setFocusable(false);
        btnCiudades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCiudades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarAgregar.add(btnCiudades);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/21.png"))); // NOI18N
        btnProductos.setToolTipText("Productos");
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarAgregar.add(btnProductos);

        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/15.png"))); // NOI18N
        btnPedidos.setToolTipText("Pedidos");
        btnPedidos.setFocusable(false);
        btnPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarAgregar.add(btnPedidos);

        btnAumentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/24.png"))); // NOI18N
        btnAumentar.setToolTipText("Aumentar mapa");
        btnAumentar.setFocusable(false);
        btnAumentar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAumentar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarActionPerformed(evt);
            }
        });
        jToolBarAgregar.add(btnAumentar);

        btnReducir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/25.png"))); // NOI18N
        btnReducir.setFocusable(false);
        btnReducir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReducir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReducirActionPerformed(evt);
            }
        });
        jToolBarAgregar.add(btnReducir);

        jMenuBar.setPreferredSize(new java.awt.Dimension(182, 40));

        jMenuOpciones.setBackground(new java.awt.Color(0, 0, 0));
        jMenuOpciones.setForeground(new java.awt.Color(0, 102, 153));
        jMenuOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/1.png"))); // NOI18N
        jMenuOpciones.setBorderPainted(true);
        jMenuOpciones.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemMaximizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/8.png"))); // NOI18N
        jMenuItemMaximizar.setText("Maximizar");
        jMenuItemMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMaximizarActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemMaximizar);

        jMenuItemMinimizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/7.png"))); // NOI18N
        jMenuItemMinimizar.setText("Minimizar");
        jMenuItemMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMinimizarActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemMinimizar);

        jMenuItemRestaurar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/9.png"))); // NOI18N
        jMenuItemRestaurar.setText("Restaurar");
        jMenuItemRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRestaurarActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemRestaurar);
        jMenuOpciones.add(jSeparator3);

        jMenuItemSalir1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItemSalir1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItemSalir1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/6.png"))); // NOI18N
        jMenuItemSalir1.setText("Salir");
        jMenuItemSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalir1ActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMenuItemSalir1);

        jMenuBar.add(jMenuOpciones);

        jMenuArchivo.setBackground(new java.awt.Color(0, 0, 0));
        jMenuArchivo.setForeground(new java.awt.Color(0, 102, 153));
        jMenuArchivo.setText("Archivo");
        jMenuArchivo.setBorderPainted(true);
        jMenuArchivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemImportarDatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemImportarDatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemImportarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/18.png"))); // NOI18N
        jMenuItemImportarDatos.setText("Importar datos");
        jMenuArchivo.add(jMenuItemImportarDatos);

        jMenuItemExportarDatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemExportarDatos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemExportarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/19.png"))); // NOI18N
        jMenuItemExportarDatos.setText("Exportar datos");
        jMenuArchivo.add(jMenuItemExportarDatos);

        jMenuItemGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/10.png"))); // NOI18N
        jMenuItemGuardar.setText("Guardar");
        jMenuArchivo.add(jMenuItemGuardar);

        jMenuBar.add(jMenuArchivo);

        jMenuEditar.setForeground(new java.awt.Color(0, 102, 153));
        jMenuEditar.setText("Editar");
        jMenuEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemAgragarMulta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemAgragarMulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/12.png"))); // NOI18N
        jMenuItemAgragarMulta.setText("Agregar multa");
        jMenuItemAgragarMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgragarMultaActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemAgragarMulta);

        jMenuItemAgregarProducto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/21.png"))); // NOI18N
        jMenuItemAgregarProducto.setText("Agregar producto");
        jMenuItemAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarProductoActionPerformed(evt);
            }
        });
        jMenuEditar.add(jMenuItemAgregarProducto);

        jMenuItemAgregarVehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemAgregarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/11.png"))); // NOI18N
        jMenuItemAgregarVehiculo.setText("Agregar vehiculo");
        jMenuEditar.add(jMenuItemAgregarVehiculo);

        jMenuItemAgregarAbastecimiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemAgregarAbastecimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/14.png"))); // NOI18N
        jMenuItemAgregarAbastecimiento.setText("Agregar centro de abastecimiento");
        jMenuEditar.add(jMenuItemAgregarAbastecimiento);

        jMenuItemAgregarDistribucion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemAgregarDistribucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/13.png"))); // NOI18N
        jMenuItemAgregarDistribucion.setText("Agregar centro de distribución");
        jMenuEditar.add(jMenuItemAgregarDistribucion);

        jMenuItemNuevoPedido.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemNuevoPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/15.png"))); // NOI18N
        jMenuItemNuevoPedido.setText("Nuevo pedido");
        jMenuEditar.add(jMenuItemNuevoPedido);
        jMenuEditar.add(jSeparator2);

        jMenuItemAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/16.png"))); // NOI18N
        jMenuItemAjustes.setText("Ajustes");
        jMenuEditar.add(jMenuItemAjustes);

        jMenuBar.add(jMenuEditar);

        jMenuVer.setForeground(new java.awt.Color(0, 102, 153));
        jMenuVer.setText("Ver");
        jMenuVer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/20.png"))); // NOI18N
        jMenuHerramientas.setText("Herramientas");
        jMenuHerramientas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jRadioButtonMenuItemVerArbolNavegacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_TAB, java.awt.event.InputEvent.SHIFT_MASK));
        jRadioButtonMenuItemVerArbolNavegacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButtonMenuItemVerArbolNavegacion.setSelected(true);
        jRadioButtonMenuItemVerArbolNavegacion.setText("Ver arból de navegación");
        jRadioButtonMenuItemVerArbolNavegacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItemVerArbolNavegacionActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(jRadioButtonMenuItemVerArbolNavegacion);

        jMenuVer.add(jMenuHerramientas);

        jMenuItemCentrosAbastecimiento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemCentrosAbastecimiento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemCentrosAbastecimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/14.png"))); // NOI18N
        jMenuItemCentrosAbastecimiento.setText("Centros de abastecimiento");
        jMenuVer.add(jMenuItemCentrosAbastecimiento);

        jMenuItemCentrosDistribucion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemCentrosDistribucion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemCentrosDistribucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/13.png"))); // NOI18N
        jMenuItemCentrosDistribucion.setText("Centros de distribución");
        jMenuVer.add(jMenuItemCentrosDistribucion);

        jMenuItemCiudades.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemCiudades.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemCiudades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/22.png"))); // NOI18N
        jMenuItemCiudades.setText("Ciudades");
        jMenuVer.add(jMenuItemCiudades);

        jMenuItemMapa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemMapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/23.png"))); // NOI18N
        jMenuItemMapa.setText("Mapa");
        jMenuVer.add(jMenuItemMapa);

        jMenuItemMultas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemMultas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemMultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/12.png"))); // NOI18N
        jMenuItemMultas.setText("Multas");
        jMenuVer.add(jMenuItemMultas);

        jMenuItemPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemPedidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/15.png"))); // NOI18N
        jMenuItemPedidos.setText("Pedidos");
        jMenuVer.add(jMenuItemPedidos);

        jMenuItemProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemProductos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/21.png"))); // NOI18N
        jMenuItemProductos.setText("Productos");
        jMenuVer.add(jMenuItemProductos);

        jMenuItemVehiculos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemVehiculos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/11.png"))); // NOI18N
        jMenuItemVehiculos.setText("Vehiculos");
        jMenuVer.add(jMenuItemVehiculos);

        jMenuBar.add(jMenuVer);

        jMenuAyuda.setForeground(new java.awt.Color(0, 102, 153));
        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuItemDocumentacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemDocumentacion.setText("Documentación");
        jMenuAyuda.add(jMenuItemDocumentacion);

        jMenuItemAcercaDe.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Iconos/5.png"))); // NOI18N
        jMenuItemAcercaDe.setText("Acerca de");
        jMenuAyuda.add(jMenuItemAcercaDe);

        jMenuBar.add(jMenuAyuda);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 619, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalir1ActionPerformed

    private void jMenuItemMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMaximizarActionPerformed
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        menu.setBounds(0, 30, getWidth(), getHeight());
        if(!jRadioButtonMenuItemVerArbolNavegacion.isSelected()){
            menu.mapa.setBounds(20, 5, getWidth()-80, getHeight()-100);
        }else{
        menu.mapa.setBounds(350, 5, 720, 655);
        }
    }//GEN-LAST:event_jMenuItemMaximizarActionPerformed

    private void jMenuItemMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMinimizarActionPerformed
        setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMenuItemMinimizarActionPerformed

    private void jMenuItemRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRestaurarActionPerformed
        setExtendedState(JFrame.NORMAL);        
        if(!jRadioButtonMenuItemVerArbolNavegacion.isSelected()){
            menu.mapa.setBounds(20, 5, getWidth()-80, getHeight()-100);
        }else{
            menu.mapa.setBounds(350, 5, 605, 605);
        }
    }//GEN-LAST:event_jMenuItemRestaurarActionPerformed

    private void jMenuItemAgragarMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgragarMultaActionPerformed
        menu.multas.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgragarMultaActionPerformed

    private void jMenuItemAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarProductoActionPerformed
       
    }//GEN-LAST:event_jMenuItemAgregarProductoActionPerformed

    private void jRadioButtonMenuItemVerArbolNavegacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItemVerArbolNavegacionActionPerformed
        menu.ocultar = !jRadioButtonMenuItemVerArbolNavegacion.isSelected();
        if(!jRadioButtonMenuItemVerArbolNavegacion.isSelected()){
            menu.mapa.setBounds(20, 5, getWidth()-80, getHeight()-100);
        }else{
            menu.mapa.setBounds(350, 5, 605, 605);
        }
    }//GEN-LAST:event_jRadioButtonMenuItemVerArbolNavegacionActionPerformed

    private void btnAumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarActionPerformed
        menu.mapa.zoom(0);
    }//GEN-LAST:event_btnAumentarActionPerformed

    private void btnReducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReducirActionPerformed
        menu.mapa.zoom(1);
    }//GEN-LAST:event_btnReducirActionPerformed

    private void btnVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculoActionPerformed
        menu.ocultarFormularios();
        menu.vehiculos.setVisible(true);
    }//GEN-LAST:event_btnVehiculoActionPerformed

    private void btnMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultasActionPerformed
        menu.ocultarFormularios();
        menu.multas.setVisible(true);
    }//GEN-LAST:event_btnMultasActionPerformed

    private void btnCentrosDistribucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrosDistribucionActionPerformed
        menu.ocultarFormularios();
        menu.centrosDistribucion.setVisible(true);
    }//GEN-LAST:event_btnCentrosDistribucionActionPerformed

    private void btnCentrosAbastecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentrosAbastecimientoActionPerformed
        menu.ocultarFormularios();
        menu.centrosAbastecimiento.setVisible(true);
    }//GEN-LAST:event_btnCentrosAbastecimientoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardar;
    private javax.swing.JButton btnAumentar;
    private javax.swing.JButton btnCentrosAbastecimiento;
    private javax.swing.JButton btnCentrosDistribucion;
    private javax.swing.JButton btnCiudades;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnMultas;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnReducir;
    private javax.swing.JButton btnVehiculo;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    public javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuHerramientas;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemAgragarMulta;
    private javax.swing.JMenuItem jMenuItemAgregarAbastecimiento;
    private javax.swing.JMenuItem jMenuItemAgregarDistribucion;
    private javax.swing.JMenuItem jMenuItemAgregarProducto;
    private javax.swing.JMenuItem jMenuItemAgregarVehiculo;
    private javax.swing.JMenuItem jMenuItemAjustes;
    private javax.swing.JMenuItem jMenuItemCentrosAbastecimiento;
    private javax.swing.JMenuItem jMenuItemCentrosDistribucion;
    private javax.swing.JMenuItem jMenuItemCiudades;
    private javax.swing.JMenuItem jMenuItemDocumentacion;
    private javax.swing.JMenuItem jMenuItemExportarDatos;
    private javax.swing.JMenuItem jMenuItemGuardar;
    private javax.swing.JMenuItem jMenuItemImportarDatos;
    private javax.swing.JMenuItem jMenuItemMapa;
    private javax.swing.JMenuItem jMenuItemMaximizar;
    private javax.swing.JMenuItem jMenuItemMinimizar;
    private javax.swing.JMenuItem jMenuItemMultas;
    private javax.swing.JMenuItem jMenuItemNuevoPedido;
    private javax.swing.JMenuItem jMenuItemPedidos;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenuItem jMenuItemRestaurar;
    private javax.swing.JMenuItem jMenuItemSalir1;
    private javax.swing.JMenuItem jMenuItemVehiculos;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JMenu jMenuVer;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemVerArbolNavegacion;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar jToolBarAgregar;
    // End of variables declaration//GEN-END:variables
    private void initScreen() {
        intro.setBounds(0, 0, 1200, 700);
        menu.setBounds(0, 30, 1200, 700);
        menu.setVisible(false);
        intro.setVisible(true);
        this.add(menu);
        this.add(intro);
    }

    protected void this_mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    protected void this_mouseDragged(MouseEvent e) {
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }

    private void initSettingsMain() {
        //OCULTAR INICIALMENTE LA BARRA DE HERRAMIENTAS
        jMenuBar.setVisible(false);
        //CAMBIA POSICION INICIAL DEL JFRAME
        setLocationRelativeTo(null);
        //CAMBIA ICONO DEL JFRAME
        Image icon = new ImageIcon(getClass().getResource("Imagenes/Intro/logo.png")).getImage();
        setIconImage(icon);
        //MUEVE EL JFRAME AL PRESIONAR EL MOUSE
        addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                this_mousePressed(evt);
            }
        });
        //DEJA DE MOVER EL JFRAME AL DEJAR DE PRESIONAR EL BOTON DERECHO DEL MOUSE
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                this_mouseDragged(evt);
            }
        });
    }

}
