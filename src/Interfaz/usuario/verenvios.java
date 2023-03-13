package Interfaz.usuario;

import ipc1.proyecto1.guiayfactura;
import javax.swing.table.DefaultTableModel;
import static ipc1.proyecto1.IPC1PROYECTO1.facyguia;

/**
 *
 * @author wilar
 */
public class verenvios extends javax.swing.JFrame {

    public verenvios() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        for (guiayfactura e: facyguia) {
    Object[] fila = new Object[]{
        e.getCodigopaq(),
        e.getServicetype(),
        e.getUsuariodest(),
        e.getTotal(),
        e.getTipopago()
    };
    model.addRow(fila);
}

envios.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        regrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        envios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver envíos | USAC Delivery");

        jLabel1.setDisplayedMnemonic('V');
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ENVIOS SOLICITADOS");

        regrear.setText("Regresar");
        regrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrearActionPerformed(evt);
            }
        });

        envios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de paquete", "Tipo de Servicio", "Destinatario", "Total de envio", "Tipo de pago"
            }
        ));
        jScrollPane1.setViewportView(envios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(regrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(regrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrearActionPerformed
        Usuarioregular acceso = new Usuarioregular();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regrearActionPerformed

   DefaultTableModel model = new DefaultTableModel(
        new Object[][]{},
        new String[]{"Código de paquete", "Tipo de servicio", "Destinatario", "Total de envío", "Tipo de pago"}
);


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable envios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regrear;
    // End of variables declaration//GEN-END:variables
}
