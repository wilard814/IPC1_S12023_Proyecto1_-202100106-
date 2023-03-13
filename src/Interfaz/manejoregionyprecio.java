package Interfaz;

import static ipc1.proyecto1.IPC1PROYECTO1.regyprec;
import ipc1.proyecto1.regionesyprecios;
import javax.swing.JOptionPane;

/**
 *
 * @author wilar
 */
public class manejoregionyprecio extends javax.swing.JFrame {

    public manejoregionyprecio() {
        initComponents();
        this.setLocationRelativeTo(null);
        regyprec.add(new regionesyprecios("(M) Metropolitana",35.00, 25.00, "(NT) Norte", 68.00, 45.55, "(NO) Nororiente", 58.68, 35.48, "(SO) Suroriente", 38.68, 32.48, "(SOC) Suroccidente", 34.00, 29.00, "(NOC) Noroccidente", 44.50, 40.00));  
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        metroestandar = new javax.swing.JTextField();
        nortestandar = new javax.swing.JTextField();
        noroestandar = new javax.swing.JTextField();
        suroestandar = new javax.swing.JTextField();
        socestandar = new javax.swing.JTextField();
        nocestandar = new javax.swing.JTextField();
        metroespecial = new javax.swing.JTextField();
        nortespecial = new javax.swing.JTextField();
        noroespecial = new javax.swing.JTextField();
        suroespecial = new javax.swing.JTextField();
        nocsespecial = new javax.swing.JTextField();
        socespecial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        datosreg = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        jLabel11.setText("jLabel11");

        jLabel13.setText("Q.");

        jLabel15.setText("Q.");

        jButton10.setText("jButton3");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Regiones y precios | USAC Delivery");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGIONES Y PRECIOS");

        jLabel2.setText("(M) Metropolitana:");

        jLabel3.setText("(NT) Norte:");

        jLabel4.setText("(NO) Nororiente:");

        jLabel5.setText("(SO) Suroriente:");

        jLabel6.setText("(SOC) Suroccidente:");

        jLabel7.setText("(NOC) Noroccidente:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("REGIONES");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("PRECIO ESTANDAR");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("PRECIO ESPECIAL");

        metroestandar.setText("35.00");

        nortestandar.setText("68.00");

        noroestandar.setText("58.68");

        suroestandar.setText("38.68");

        socestandar.setText("34.00");

        nocestandar.setText("44.50");

        metroespecial.setText("25.00");

        nortespecial.setText("45.55");

        noroespecial.setText("35.48");

        suroespecial.setText("32.48");

        nocsespecial.setText("40.00");

        socespecial.setText("29.00");

        jLabel12.setText("Q.");

        jLabel14.setText("Q.");

        jLabel16.setText("Q.");

        jLabel17.setText("Q.");

        jLabel18.setText("Q.");

        jLabel19.setText("Q.");

        jLabel20.setText("Q.");

        jLabel21.setText("Q.");

        jLabel22.setText("Q.");

        jLabel23.setText("Q.");

        jLabel24.setText("Q.");

        jLabel25.setText("Q.");

        datosreg.setText("Registrar");
        datosreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosregActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(datosreg)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(nocestandar)
                                            .addComponent(socestandar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(suroestandar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(noroestandar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nortestandar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(metroestandar, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel20)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(metroespecial)
                                            .addComponent(nortespecial)
                                            .addComponent(noroespecial)
                                            .addComponent(suroespecial)
                                            .addComponent(socespecial)
                                            .addComponent(nocsespecial, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(limpiar)
                                        .addGap(14, 14, 14))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(regresar))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(regresar)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(metroestandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(metroespecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nortestandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nortespecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel21)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noroestandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(noroespecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(suroestandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(suroespecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel23)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(socestandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(socespecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nocestandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nocsespecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel25))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datosreg)
                    .addComponent(limpiar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datosregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosregActionPerformed
       
    //Region metropolitana
   String metropolitana = "(M) Metropolitana";
   String mestandar = metroestandar.getText();
   String mespecial = metroespecial.getText();
    //Region note
   String nt = "(NT) Norte";
   String ntestandar = nortestandar.getText();
   String ntespecial = nortespecial.getText();
    //Region nororiente
   String no = "(NO) Nororiente";
   String noestandar = noroestandar.getText();
   String noespecial = noroespecial.getText();  
    //Region suroriente
   String so = "(SO) Suroriente";
   String soestandar = suroestandar.getText();
   String soespecial = suroespecial.getText();
    //Region suroccidente
   String soc = "(SOC) Suroccidente";
   String socesta = socestandar.getText();
   String socesp = socespecial.getText();
    //Region noroccidente
   String noc = "(NOC) Noroccidente";
   String nocesta = nocestandar.getText();
   String nocespe = nocsespecial.getText();
   
    if (mestandar.isEmpty() || mespecial.isEmpty() || ntestandar.isEmpty() || ntespecial.isEmpty() || noestandar.isEmpty() || noespecial.isEmpty() || soestandar.isEmpty() || soespecial.isEmpty() || socesta.isEmpty() || socesp.isEmpty() || nocesta.isEmpty() ||nocespe.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Necesita llenar los espacios en blanco", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (regyprec.size() >= 1) {
        JOptionPane.showMessageDialog(null, "Las regiones ya estan registradas", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        regionesyprecios nuevoregyprec = new regionesyprecios(metropolitana, Double.parseDouble(mestandar), Double.parseDouble(mespecial), nt, Double.parseDouble(ntestandar), Double.parseDouble(ntespecial), no, Double.parseDouble(noestandar), Double.parseDouble(noespecial),so,  Double.parseDouble(soestandar), Double.parseDouble(soespecial),soc,  Double.parseDouble(socesta), Double.parseDouble(socesp),noc,  Double.parseDouble(nocesta), Double.parseDouble(nocespe));
        regyprec.add(nuevoregyprec);
        JOptionPane.showMessageDialog(null, "Datos registrados");
    }
    }//GEN-LAST:event_datosregActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        AdminDisplay acceso = new AdminDisplay();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
       if (regyprec.isEmpty()) {
        JOptionPane.showMessageDialog(null, "El registro de regiones y precios ya está vacío");
        } else {
        metroestandar.setText("");
        metroespecial.setText("");
        nortestandar.setText("");
        nortespecial.setText("");
        noroestandar.setText("");
        noroespecial.setText("");
        suroestandar.setText("");
        suroespecial.setText("");
        socestandar.setText("");
        socespecial.setText("");
        nocestandar.setText("");
        nocsespecial.setText("");
        regyprec.clear();
       }
    }//GEN-LAST:event_limpiarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datosreg;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField metroespecial;
    private javax.swing.JTextField metroestandar;
    private javax.swing.JTextField nocestandar;
    private javax.swing.JTextField nocsespecial;
    private javax.swing.JTextField noroespecial;
    private javax.swing.JTextField noroestandar;
    private javax.swing.JTextField nortespecial;
    private javax.swing.JTextField nortestandar;
    private javax.swing.JButton regresar;
    private javax.swing.JTextField socespecial;
    private javax.swing.JTextField socestandar;
    private javax.swing.JTextField suroespecial;
    private javax.swing.JTextField suroestandar;
    // End of variables declaration//GEN-END:variables
}
