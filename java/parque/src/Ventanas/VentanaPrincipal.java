
package Ventanas;

import Lista.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zonaTematica.Pases.Entrada;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public class VentanaPrincipal extends javax.swing.JFrame {

    ListaCliente listaCliente;
    ListaZonaTematica listaZonaTematica;
    ListaZonaTematica listaPase;
    //ListaPase listaPase;
    Entrada ticket;
    DefaultTableModel modelo;
    DefaultTableModel modelopago;
    String venta[] = new String[4];
    String pagoCliente[] = new String[5];
    public VentanaPrincipal() {
        initComponents();
        
        
        listaCliente = new ListaCliente();
        //listaPase = new ListaPase();
        listaZonaTematica = new ListaZonaTematica();
        ticket = new Entrada();
        
        //AutoCompleteDecorator.decorate(txtDniCliente);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jpCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        txtDniCliente = new javax.swing.JTextField();
        jpCantidadEntradas = new javax.swing.JPanel();
        spPases = new javax.swing.JSpinner();
        btnComprarEntradas = new javax.swing.JButton();
        jpPases = new javax.swing.JPanel();
        jpEspectaculo = new javax.swing.JPanel();
        spCantidadEspectaculo = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        btnAgregarEspectaculo = new javax.swing.JButton();
        cbEspectaculo = new javax.swing.JComboBox<>();
        jpRestaurante = new javax.swing.JPanel();
        cbRestaurante = new javax.swing.JComboBox<>();
        btnAñadirRestaurante = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        spCantidadRestaurante = new javax.swing.JSpinner();
        jpZonaTematica = new javax.swing.JPanel();
        cbZonaTematica = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        cbAtraccion = new javax.swing.JComboBox<>();
        spAtraccion = new javax.swing.JSpinner();
        btnAgregarAtraccion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPago = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        menuAgregarZonaTematica = new javax.swing.JMenuItem();
        menuAgregar = new javax.swing.JMenu();
        menuRestaurante = new javax.swing.JMenuItem();
        menuEspectaculo = new javax.swing.JMenuItem();
        menuAgregarAtraccion = new javax.swing.JMenuItem();
        menuAgregarCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuPases = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PAGINA PRINCIPAL");
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jpCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel1.setText("DNI:");

        btnBuscarCliente.setText("BUSCAR");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        javax.swing.GroupLayout jpClienteLayout = new javax.swing.GroupLayout(jpCliente);
        jpCliente.setLayout(jpClienteLayout);
        jpClienteLayout.setHorizontalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnBuscarCliente))
                    .addGroup(jpClienteLayout.createSequentialGroup()
                        .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpClienteLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpClienteLayout.setVerticalGroup(
            jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscarCliente)
                    .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlApellido))
                .addContainerGap())
        );

        jpCantidadEntradas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pases", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        btnComprarEntradas.setText("AGREGAR");
        btnComprarEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarEntradasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCantidadEntradasLayout = new javax.swing.GroupLayout(jpCantidadEntradas);
        jpCantidadEntradas.setLayout(jpCantidadEntradasLayout);
        jpCantidadEntradasLayout.setHorizontalGroup(
            jpCantidadEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCantidadEntradasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnComprarEntradas)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCantidadEntradasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spPases, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jpCantidadEntradasLayout.setVerticalGroup(
            jpCantidadEntradasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCantidadEntradasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spPases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComprarEntradas)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jpEspectaculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Espectaculo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel6.setText("CANTIDAD");

        btnAgregarEspectaculo.setText("AGREGAR");
        btnAgregarEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEspectaculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpEspectaculoLayout = new javax.swing.GroupLayout(jpEspectaculo);
        jpEspectaculo.setLayout(jpEspectaculoLayout);
        jpEspectaculoLayout.setHorizontalGroup(
            jpEspectaculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEspectaculoLayout.createSequentialGroup()
                .addGroup(jpEspectaculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEspectaculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpEspectaculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEspectaculoLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spCantidadEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpEspectaculoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAgregarEspectaculo))))
                    .addGroup(jpEspectaculoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cbEspectaculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpEspectaculoLayout.setVerticalGroup(
            jpEspectaculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEspectaculoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(cbEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpEspectaculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(spCantidadEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarEspectaculo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpRestaurante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Restaurante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        btnAñadirRestaurante.setText("AGREGAR");
        btnAñadirRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirRestauranteActionPerformed(evt);
            }
        });

        jLabel5.setText("CANTIDAD");

        javax.swing.GroupLayout jpRestauranteLayout = new javax.swing.GroupLayout(jpRestaurante);
        jpRestaurante.setLayout(jpRestauranteLayout);
        jpRestauranteLayout.setHorizontalGroup(
            jpRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRestauranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpRestauranteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spCantidadRestaurante))
                    .addComponent(cbRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRestauranteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAñadirRestaurante)
                .addContainerGap())
        );
        jpRestauranteLayout.setVerticalGroup(
            jpRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRestauranteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spCantidadRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAñadirRestaurante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpZonaTematica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zona Tematica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        cbZonaTematica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbZonaTematicaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpZonaTematicaLayout = new javax.swing.GroupLayout(jpZonaTematica);
        jpZonaTematica.setLayout(jpZonaTematicaLayout);
        jpZonaTematicaLayout.setHorizontalGroup(
            jpZonaTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpZonaTematicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbZonaTematica, 0, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpZonaTematicaLayout.setVerticalGroup(
            jpZonaTematicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpZonaTematicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atraccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        btnAgregarAtraccion.setText("AGREGAR");
        btnAgregarAtraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAtraccionActionPerformed(evt);
            }
        });

        jLabel7.setText("CANTIDAD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarAtraccion)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregarAtraccion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpPasesLayout = new javax.swing.GroupLayout(jpPases);
        jpPases.setLayout(jpPasesLayout);
        jpPasesLayout.setHorizontalGroup(
            jpPasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPasesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPasesLayout.setVerticalGroup(
            jpPasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpPasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpEspectaculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        tablaPago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUB- TOTAL", "IGV", "OP AGRAVADA", "TOTAL DSCTO", "IMPORTE TOTAL"
            }
        ));
        jScrollPane2.setViewportView(tablaPago);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPCION", "PRECIO UNITARIO", "CANTIDAD", "TOTAL"
            }
        ));
        tablaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaVentaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVenta);

        jMenu2.setText("Agregar");

        menuAgregarZonaTematica.setText("Agregar Zona Tematica");
        menuAgregarZonaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarZonaTematicaActionPerformed(evt);
            }
        });
        jMenu2.add(menuAgregarZonaTematica);

        menuAgregar.setText("Agregar");

        menuRestaurante.setText("Agregar Restaurante");
        menuRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestauranteActionPerformed(evt);
            }
        });
        menuAgregar.add(menuRestaurante);

        menuEspectaculo.setText("Agregar Espectaculo");
        menuEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEspectaculoActionPerformed(evt);
            }
        });
        menuAgregar.add(menuEspectaculo);

        menuAgregarAtraccion.setText("Agregar Atraccion");
        menuAgregarAtraccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuAgregarAtraccionMousePressed(evt);
            }
        });
        menuAgregarAtraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarAtraccionActionPerformed(evt);
            }
        });
        menuAgregar.add(menuAgregarAtraccion);

        jMenu2.add(menuAgregar);

        menuAgregarCliente.setText("Agregar Cliente");
        menuAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgregarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(menuAgregarCliente);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Modificar");

        menuPases.setText("Pases");
        menuPases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPasesActionPerformed(evt);
            }
        });
        jMenu4.add(menuPases);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jpCantidadEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jpPases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(49, 49, 49)
                .addComponent(btnPagar)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpCantidadEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPagar)
                    .addComponent(btnCancelar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        if(listaZonaTematicaEsVacia()) return;
        if(listaClienteVacio()) return;
        for(NodoCliente aux = listaCliente.getInicio(); aux != null; aux = aux.getSiguiente())
            if(aux.getCliente().getDni().equals(txtDniCliente.getText())){
                jlNombre.setText(aux.getCliente().getNombre());
                jlApellido.setText(aux.getCliente().getApellido());
                return;
            }
        VentanaCliente vtnCliente = new VentanaCliente(listaCliente, this);
        vtnCliente.setVisible(true);
        vtnCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAgregarEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEspectaculoActionPerformed
        
    }//GEN-LAST:event_btnAgregarEspectaculoActionPerformed

    private void menuAgregarZonaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarZonaTematicaActionPerformed
        VentanaZonaTematica vtnZonaTematica = new VentanaZonaTematica(listaZonaTematica, this);
        vtnZonaTematica.setVisible(true);
        vtnZonaTematica.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuAgregarZonaTematicaActionPerformed

    private void menuRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestauranteActionPerformed
        VentanaRestaurante vtnRestaurante = new VentanaRestaurante(listaZonaTematica, this);
        vtnRestaurante.setVisible(true);
        vtnRestaurante.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuRestauranteActionPerformed

    private void menuEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEspectaculoActionPerformed
        VentanaEspectaculo vtnEspectaculo = new VentanaEspectaculo(listaZonaTematica, this);
        vtnEspectaculo.setTitle("Espectaculo");
        vtnEspectaculo.setLocationRelativeTo(null);
        vtnEspectaculo.setVisible(true);
    }//GEN-LAST:event_menuEspectaculoActionPerformed

    private void menuAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarClienteActionPerformed
        VentanaCliente vtnCliente = new VentanaCliente(listaCliente, this);
        vtnCliente.setVisible(true);
        vtnCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuAgregarClienteActionPerformed

    private void cbZonaTematicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbZonaTematicaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbZonaTematicaMouseClicked

    private void btnAñadirRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirRestauranteActionPerformed
        
        
    }//GEN-LAST:event_btnAñadirRestauranteActionPerformed

    private void btnAgregarAtraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAtraccionActionPerformed
        
    }//GEN-LAST:event_btnAgregarAtraccionActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarEntradasActionPerformed
        if(listaClienteVacio()) return;
        agregarTabla("Pases", ticket.getPrecio(), spPases.getValue().toString());
    }//GEN-LAST:event_btnComprarEntradasActionPerformed

    private void menuPasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPasesActionPerformed
       ticket.setPrecio(Float.parseFloat(JOptionPane.showInputDialog(null, "nuevo precio de pases")));
    }//GEN-LAST:event_menuPasesActionPerformed

    private void menuAgregarAtraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgregarAtraccionActionPerformed
        VentanaAtraccion vtnAtraccion = new VentanaAtraccion(listaZonaTematica, this);
        vtnAtraccion.setVisible(true);
    }                                          
 /*   
    }//GEN-LAST:event_menuAgregarAtraccionActionPerformed
*/
    private void menuAgregarAtraccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAgregarAtraccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAgregarAtraccionMousePressed

    private void tablaVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentaMousePressed
        
    }//GEN-LAST:event_tablaVentaMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal vtn= new VentanaPrincipal();
                vtn.setVisible(true);
                vtn.setBounds(200, 10, 750, 660);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAtraccion;
    private javax.swing.JButton btnAgregarEspectaculo;
    private javax.swing.JButton btnAñadirRestaurante;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprarEntradas;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cbAtraccion;
    private javax.swing.JComboBox<String> cbEspectaculo;
    private javax.swing.JComboBox<String> cbRestaurante;
    private javax.swing.JComboBox<String> cbZonaTematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JPanel jpCantidadEntradas;
    private javax.swing.JPanel jpCliente;
    private javax.swing.JPanel jpEspectaculo;
    private javax.swing.JPanel jpPases;
    private javax.swing.JPanel jpRestaurante;
    private javax.swing.JPanel jpZonaTematica;
    private javax.swing.JMenu menuAgregar;
    private javax.swing.JMenuItem menuAgregarAtraccion;
    private javax.swing.JMenuItem menuAgregarCliente;
    private javax.swing.JMenuItem menuAgregarZonaTematica;
    private javax.swing.JMenuItem menuEspectaculo;
    private javax.swing.JMenuItem menuPases;
    private javax.swing.JMenuItem menuRestaurante;
    private javax.swing.JSpinner spAtraccion;
    private javax.swing.JSpinner spCantidadEspectaculo;
    private javax.swing.JSpinner spCantidadRestaurante;
    private javax.swing.JSpinner spPases;
    private javax.swing.JTable tablaPago;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtDniCliente;
    // End of variables declaration//GEN-END:variables
}
