package Interfaz.usuario;


import ipc1.proyecto1.Datosfactura;
import static ipc1.proyecto1.IPC1PROYECTO1.creditodebito;
import static ipc1.proyecto1.IPC1PROYECTO1.factura;
import static ipc1.proyecto1.IPC1PROYECTO1.municipios;
import static ipc1.proyecto1.IPC1PROYECTO1.regyprec;
import ipc1.proyecto1.Municipio;
import Interfaz.Login;
import static ipc1.proyecto1.IPC1PROYECTO1.facyguia;


import static ipc1.proyecto1.IPC1PROYECTO1.uskiosco;
import ipc1.proyecto1.guiayfactura;
import ipc1.proyecto1.regionesyprecios;
import ipc1.proyecto1.tarjeta;
import ipc1.proyecto1.usuariowithkiosco;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;


import javax.swing.JOptionPane;

/**
 *
 * @author wilar
 */
public class cotizacion extends javax.swing.JFrame {

    public cotizacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarcard();
        llenarf();
        llenarestandar();
        llenarespecial();
        llenarorigen();
        llenardestino();
       //Botones de cobros y servicios
       cobros.add(contraentrega);
       cobros.add(pagotarjeta);
       
       servicios.add(sestandar);
       servicios.add(sespecial);
       
     pagotarjeta.addActionListener((ActionEvent e) -> {
    notarjeta.setEnabled(true);
    pagotarjeta.setEnabled(false);
    cvv.setEnabled(true);
});

     
     
     
contraentrega.addActionListener((ActionEvent e) -> {
    notarjeta.setEnabled(false);
    contraentrega.setEnabled(true);
    cvv.setEnabled(false);
    pagotarjeta.setEnabled(true); 
});



sespecial.addActionListener((ActionEvent e) -> {
    servestandar.setEnabled(false);
    servespecial.setEnabled(true);
});

sestandar.addActionListener((ActionEvent e) -> {
    servespecial.setEnabled(false);
    servestandar.setEnabled(true);
});


servespecial.setEnabled(false);
servestandar.setEnabled(true);
    }
    
  double totalCalculado = 0;
  String tiposervicio="";
  String usuariodesto= "";



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        servicios = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        cobros = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        regresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deptorigen = new javax.swing.JComboBox<>();
        deptodestino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        paquetes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cotiza = new javax.swing.JButton();
        munorigen = new javax.swing.JComboBox<>();
        mundestino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        contraentrega = new javax.swing.JRadioButton();
        pagotarjeta = new javax.swing.JRadioButton();
        frametarjeta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        notarjeta = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        facturacion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        realizapago = new javax.swing.JButton();
        facturadescarga = new javax.swing.JButton();
        guiadescarga = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        tamañopa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        servestandar = new javax.swing.JComboBox<>();
        servespecial = new javax.swing.JComboBox<>();
        sespecial = new javax.swing.JRadioButton();
        sestandar = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cotización | USAC Delivery");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("COTIZACION DE PAQUETES");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel2.setText("Origen");

        jLabel3.setText("Destino");

        deptorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamento" }));
        deptorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptorigenActionPerformed(evt);
            }
        });

        deptodestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Departamento" }));
        deptodestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptodestinoActionPerformed(evt);
            }
        });

        jLabel4.setText("Numero de paquetes");

        paquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetesActionPerformed(evt);
            }
        });

        jLabel5.setText("Tamaño de paquetes");

        cotiza.setText("Cotizar");
        cotiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizaActionPerformed(evt);
            }
        });

        munorigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio" }));

        mundestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipio" }));

        jLabel6.setText("Tipo de pago");

        contraentrega.setText("Cobro contra entrega (Q.5.00 adicionales)");

        pagotarjeta.setText("Cobro a mi cuenta, pago con tarjeta de crédito o débito");
        pagotarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagotarjetaActionPerformed(evt);
            }
        });

        jLabel7.setText("No. Tarjeta");

        notarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar tarjeta" }));

        jLabel8.setText("CVV");

        javax.swing.GroupLayout frametarjetaLayout = new javax.swing.GroupLayout(frametarjeta);
        frametarjeta.setLayout(frametarjetaLayout);
        frametarjetaLayout.setHorizontalGroup(
            frametarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frametarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frametarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(frametarjetaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frametarjetaLayout.setVerticalGroup(
            frametarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frametarjetaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(frametarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel9.setText("Datos de facturación");

        facturacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione datos de facturacion" }));
        facturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Total :");

        total.setText(" Cotiza");

        realizapago.setText("Realizar pago y enviar");
        realizapago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizapagoActionPerformed(evt);
            }
        });

        facturadescarga.setText("Decargar Factura");
        facturadescarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturadescargaActionPerformed(evt);
            }
        });

        guiadescarga.setText("Descargar guía");
        guiadescarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiadescargaActionPerformed(evt);
            }
        });

        cancela.setText("Cancelar envío");
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });

        jLabel11.setText("(en lb, minimo 1 lb)");

        servestandar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        servestandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servestandarActionPerformed(evt);
            }
        });

        servespecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        sespecial.setText("Servicio Especial");

        sestandar.setText("Servicio Estandar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(deptorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(paquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(munorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(servestandar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cotiza)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(84, 84, 84))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(deptodestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(mundestino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(41, 41, 41))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tamañopa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(servespecial, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sespecial)
                                    .addComponent(sestandar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(contraentrega)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(jLabel6)
                                                    .addGap(280, 280, 280))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(160, 160, 160))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(facturacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel9)
                                                                .addComponent(facturadescarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(guiadescarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(51, 51, 51)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pagotarjeta)
                                            .addComponent(frametarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(realizapago)
                                        .addGap(179, 179, 179))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cancela)
                                        .addGap(192, 192, 192))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(deptorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(munorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(paquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11))
                                        .addGap(18, 18, 18)
                                        .addComponent(tamañopa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(deptodestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mundestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(sestandar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cotiza)
                                    .addComponent(servestandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(sespecial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(servespecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(contraentrega)
                                .addGap(11, 11, 11)
                                .addComponent(pagotarjeta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(frametarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(total))
                                .addGap(18, 18, 18)
                                .addComponent(realizapago)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(facturadescarga)
                                    .addComponent(guiadescarga))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(cancela)
                                .addGap(15, 15, 15))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagotarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagotarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagotarjetaActionPerformed
    
    private void deptorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptorigenActionPerformed
        
    }//GEN-LAST:event_deptorigenActionPerformed

    private void cotizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizaActionPerformed
       
            String paquet = paquetes.getText();
            String sizpa = tamañopa.getText();
            String dest = (String) deptodestino.getSelectedItem();
            String deptorig = (String)deptorigen.getSelectedItem();
            String munor = (String) munorigen.getSelectedItem();
            String mundes = (String) mundestino.getSelectedItem();
            String seres = (String) servestandar.getSelectedItem();
            String seresp = (String) servespecial.getSelectedItem();



            if (paquet.isEmpty() ||sizpa.isEmpty()|| servicios.getSelection() == null  ){
                JOptionPane.showMessageDialog(this, "Debe de llenar todos los campos vacios");
                return;
            }

            if (dest.equals("No hay datos") || deptorig.equals("No hay datos") || munor.equals("No hay datos") || mundes.equals("No hay datos") ){
                JOptionPane.showMessageDialog(this, "Debe de registrar Departamentos y Municipios");
                return;
            }
            if (seres.equals("No hay datos") || seresp.equals("No hay datos")){
                JOptionPane.showMessageDialog(this, "Debe de registrar precios de regiones y departamentos");
                return;
            }
            if (munor.equals(mundes)){
                JOptionPane.showMessageDialog(this, "El municipio no puede ser el mismo");
                return;
            }
            String cadenaEs = seres.split(" - ")[0];
            String cadenaEsp = seresp.split(" - ")[0];
            double precioes = Double.parseDouble(cadenaEs);
            double precioesp = Double.parseDouble(cadenaEsp);
            double nopaquet;
            double paquetesize;
            String[] seresArray = seres.split(" - ");
            String[] serespArray = seresp.split(" - ");
            String[] destArray = dest.split(" - ");

            if (sestandar.isSelected() && seresArray.length > 1 && !seresArray[1].equals(destArray[1])) {
                JOptionPane.showMessageDialog(this, "El destino seleccionado no coincide con el destino del servicio estándar");

                return;
            }

            if (sespecial.isSelected() && serespArray.length > 1 && !serespArray[1].equals(destArray[1])) {
                JOptionPane.showMessageDialog(this, "El destino seleccionado no coincide con el destino del servicio especial");
                return;
            }

            nopaquet = Double.parseDouble(paquet);
            paquetesize = Double.parseDouble(sizpa);


            if(sestandar.isSelected()){
                tiposervicio="Servicio estandar";
                totalCalculado = nopaquet * paquetesize * precioes;
            } else if(sespecial.isSelected()){
                tiposervicio="Servicio especial";
                totalCalculado = nopaquet * paquetesize * precioesp;
            }

            String totalString = String.format("%.2f", totalCalculado);
                total.setText("Q. " + totalString);
    }//GEN-LAST:event_cotizaActionPerformed

    private void facturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facturacionActionPerformed

    private void paquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paquetesActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Usuarioregular vi = new Usuarioregular();
        vi.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void deptodestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptodestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptodestinoActionPerformed

    private void servestandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servestandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servestandarActionPerformed

    private void realizapagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizapagoActionPerformed
        String dest = (String) deptodestino.getSelectedItem();
        String paquet = paquetes.getText();
        String deptorig = (String)deptorigen.getSelectedItem();
        String munor = (String) munorigen.getSelectedItem();
        String mundes = (String) mundestino.getSelectedItem();
        String sizpa = tamañopa.getText();
        String ntar = (String) notarjeta.getSelectedItem();
        String czz = cvv.getText();
        String datosfa = (String) facturacion.getSelectedItem();
        String usuarioactual = Login.guardaresteusuario();
        
        Random random = new Random();   
        Calendar calendar = Calendar.getInstance();
        Date fechaActual = calendar.getTime();
        String datof = String.valueOf(facturacion.getSelectedItem());
            String[] datos = datof.split("-");
            String nombre = datos[0];
            String nit = datos[1];
            String direccion = datos[2];
            
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaActualString = formatoFecha.format(fechaActual);
        
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_";
            String codigopaqAleatorio = "IPC1";
            for (int i = 0; i < 5; i++) {
                int index = random.nextInt(letras.length());
                    codigopaqAleatorio += letras.charAt(index);
            
            for(Municipio m: municipios){
            for(usuariowithkiosco u: uskiosco){
                String iguales =m.getRegion();
            if(iguales.equals(u.getCoder())){
             usuariodesto = u.getUsrk();
            
            }}}
            
}
            int nfacturaAleatorio = random.nextInt(90000) + 10000; 
          
          if (cobros.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un método de pago");
            return;
            
        }
        
        if (contraentrega.isSelected() ) {
            totalCalculado += 5;
            JOptionPane.showMessageDialog(this, "El total a pagar es: Q. " + totalCalculado);
            
            guiayfactura nuevo = new guiayfactura(usuarioactual,usuariodesto,String.valueOf(nfacturaAleatorio), codigopaqAleatorio,deptorig, munor, dest, mundes,nit,nombre, direccion,"Tarjeta",paquet, sizpa, totalCalculado, fechaActualString, tiposervicio);
            facyguia.add(nuevo);
            
        } else if (pagotarjeta.isSelected()) {
            
            
         if (ntar.isEmpty() || czz.isEmpty() || datosfa.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Llene los campos vacios");
                
            }else{
    }
          JOptionPane.showMessageDialog(this, "Se ha realizado el cobro de Q. " + totalCalculado + " a la tarjeta " + ntar);
            guiayfactura nuevo = new guiayfactura(usuarioactual,usuariodesto,String.valueOf(nfacturaAleatorio), codigopaqAleatorio,deptorig, munor, dest, mundes,nit,nombre, direccion,"Tarjeta",paquet, sizpa, totalCalculado, fechaActualString, tiposervicio);
            facyguia.add(nuevo);
        }     
    }//GEN-LAST:event_realizapagoActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        int ultimoIndex = facyguia.size() - 1;
        if (ultimoIndex < 0) {
        JOptionPane.showMessageDialog(this, "No hay envíos para cancelar");
        return;
        }
        facyguia.remove(ultimoIndex);
        JOptionPane.showMessageDialog(this, "Envío cancelado");
    }//GEN-LAST:event_cancelaActionPerformed

    private void facturadescargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturadescargaActionPerformed
        compras vi = new compras();
        vi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_facturadescargaActionPerformed

    private void guiadescargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiadescargaActionPerformed
        descargaguia vi = new descargaguia(facyguia);
        vi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_guiadescargaActionPerformed


 

    //Llenar tarjeta
    public void llenarcard(){
                                                      
    for (tarjeta z : creditodebito) {
    String numeroCompleto = z.getNumerotarjeta();
    String ultimosCuatroDigitos = numeroCompleto.substring(numeroCompleto.length() - 4);
    String mascara = "";
    for (int i = 0; i < numeroCompleto.length() - 4; i++) {
        mascara += "x";
    }
    z.setNumerotarjetatruncado(mascara + ultimosCuatroDigitos);
    }notarjeta.removeAllItems(); 
    if(creditodebito.isEmpty()) {
    notarjeta.addItem("No hay datos");
    } else {
            for(tarjeta z: creditodebito) {
                notarjeta.addItem(z.getNumerotarjetatruncado());
    }
}
    }
   //Llenar facturacion
    public void llenarf(){
                                                      
    facturacion.removeAllItems(); 
    if(factura.isEmpty()) {
        facturacion.addItem("No hay datos");
    } else {
        for(Datosfactura z: factura) {
                facturacion.addItem(z.getNombrecliente() +" - " + z.getNit()+" - "+z.getDireccion());
            
        }
    }
    }
    public void llenarestandar(){
                                                      
    servestandar.removeAllItems(); 
    if(regyprec.isEmpty()) {
        servestandar.addItem("No hay datos");
    } else {
        for(regionesyprecios z: regyprec) {
            servestandar.addItem(String.valueOf(z.getMestandar()+" - "+z.getMetro()));
            servestandar.addItem(String.valueOf(z.getNtestandar()+" - "+z.getNt()));
            servestandar.addItem(String.valueOf(z.getNoestandar()+" - "+z.getNo()));
            servestandar.addItem(String.valueOf(z.getSoestandar()+" - "+z.getSo()));
            servestandar.addItem(String.valueOf(z.getSocestandar()+" - "+z.getSoc()));
            servestandar.addItem(String.valueOf(z.getNocestandar()+" - "+z.getNoc()));
        }
    }
    }
    public void llenarespecial(){
                                                      
    servespecial.removeAllItems(); 
    if(regyprec.isEmpty()) {
        servespecial.addItem("No hay datos");
    } else {
        for(regionesyprecios z: regyprec) {
                servespecial.addItem(String.valueOf(z.getMespecial()+" - "+z.getMetro()));
                servespecial.addItem(String.valueOf(z.getNtespecial()+" - "+z.getNt()));
                servespecial.addItem(String.valueOf(z.getNoespecial()+" - "+z.getNo()));
                servespecial.addItem(String.valueOf(z.getSoespecial()+" - "+z.getSo()));
                servespecial.addItem(String.valueOf(z.getSocespecial()+" - "+z.getSoc()));
                servespecial.addItem(String.valueOf(z.getNocespecial()+" - "+z.getNoc()));
        }
    }
    }
    
   public void llenarorigen() {
    deptorigen.removeAllItems(); 
    munorigen.removeAllItems();

    if (municipios.isEmpty()) {
        deptorigen.addItem("No hay datos");
        munorigen.addItem("No hay datos");
    } else {
        String usuarioactual = Login.guardaresteusuario();
        usuariowithkiosco us = null;

       
        for (usuariowithkiosco u : uskiosco) {
            if (u.getUsrk().equals(usuarioactual)) {
                us = u;
                break;
            }
        }

        
        if (us != null) {
            String codereg = us.getCoder();
            List<Municipio> municipiosFiltrados = new ArrayList<>();

            for (Municipio m : municipios) {
                if (m.getCodigoreg().equals(codereg)) {
                    municipiosFiltrados.add(m);
                }
            }

           
            for (Municipio z : municipiosFiltrados) {
                deptorigen.addItem(z.getNombre());
                munorigen.addItem(z.getNombreMunicipio());
            }
        }
    }
}

public void llenardestino() {
    deptodestino.removeAllItems(); 
    mundestino.removeAllItems();

    if (municipios.isEmpty()) {
        deptodestino.addItem("No hay datos");
        mundestino.addItem("No hay datos");
    } else {
        String usuarioactual = Login.guardaresteusuario();
        usuariowithkiosco us = null;

        for (usuariowithkiosco u : uskiosco) {
            if (u.getUsrk().equals(usuarioactual)) {
                us = u;
                break;
            }
        }

       
        if (us != null) {
            String codereg = us.getCoder();
            List<Municipio> municipiosFiltrados = new ArrayList<>();

            for (Municipio m : municipios) {
                if (!m.getCodigoreg().equals(codereg)) {
                    municipiosFiltrados.add(m);
                }
            }

            if (municipiosFiltrados.isEmpty()) {
                deptodestino.addItem("No hay datos");
                mundestino.addItem("No hay datos");
            } else {
                for (Municipio m : municipiosFiltrados) {
                    deptodestino.addItem(m.getNombre()+" - "+m.getRegion());
                    mundestino.addItem(m.getNombreMunicipio());
                }
            }
        } else {
            for (Municipio m : municipios) {
                deptodestino.addItem(m.getNombre());
                mundestino.addItem(m.getNombreMunicipio());
            }
        }
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancela;
    private javax.swing.ButtonGroup cobros;
    private javax.swing.JRadioButton contraentrega;
    private javax.swing.JButton cotiza;
    private javax.swing.JTextField cvv;
    private javax.swing.JComboBox<String> deptodestino;
    private javax.swing.JComboBox<String> deptorigen;
    private javax.swing.JComboBox<String> facturacion;
    private javax.swing.JButton facturadescarga;
    private javax.swing.JPanel frametarjeta;
    private javax.swing.JButton guiadescarga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JComboBox<String> mundestino;
    private javax.swing.JComboBox<String> munorigen;
    private javax.swing.JComboBox<String> notarjeta;
    private javax.swing.JRadioButton pagotarjeta;
    private javax.swing.JTextField paquetes;
    private javax.swing.JButton realizapago;
    private javax.swing.JButton regresar;
    private javax.swing.JComboBox<String> servespecial;
    private javax.swing.JComboBox<String> servestandar;
    private javax.swing.ButtonGroup servicios;
    private javax.swing.JRadioButton sespecial;
    private javax.swing.JRadioButton sestandar;
    private javax.swing.JTextField tamañopa;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

}