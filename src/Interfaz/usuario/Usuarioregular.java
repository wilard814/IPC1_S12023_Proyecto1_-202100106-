package Interfaz.usuario;

import Interfaz.Login;

/**
 *
 * @author wilar
 */
public class Usuarioregular extends javax.swing.JFrame {

    /**
     * Creates new form Usuarioregular
     */
    public Usuarioregular() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrotarjeta = new javax.swing.JButton();
        datosfacturacion = new javax.swing.JButton();
        cotizacion = new javax.swing.JButton();
        envios = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de paquetes y facturacion (usuario/cliente) | USAC Delivery");

        registrotarjeta.setText("Registro tarjeta de crédito/débito");
        registrotarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrotarjetaActionPerformed(evt);
            }
        });

        datosfacturacion.setText("Registro de datos de facturación");
        datosfacturacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosfacturacionActionPerformed(evt);
            }
        });

        cotizacion.setText("Cotización de paquetes");
        cotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizacionActionPerformed(evt);
            }
        });

        envios.setText("Ver envío solicitados");
        envios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviosActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cotizacion)
                    .addComponent(datosfacturacion)
                    .addComponent(registrotarjeta)
                    .addComponent(regresar)
                    .addComponent(envios))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(registrotarjeta)
                .addGap(18, 18, 18)
                .addComponent(datosfacturacion)
                .addGap(18, 18, 18)
                .addComponent(cotizacion)
                .addGap(18, 18, 18)
                .addComponent(envios)
                .addGap(18, 18, 18)
                .addComponent(regresar)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Login regresar = new Login();
        regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void registrotarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrotarjetaActionPerformed
         Registrodetarjetas acceso = new Registrodetarjetas();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registrotarjetaActionPerformed

    private void cotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizacionActionPerformed
        cotizacion acceso = new cotizacion();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cotizacionActionPerformed

    private void datosfacturacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosfacturacionActionPerformed
        datosdefacturacion acceso = new datosdefacturacion();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_datosfacturacionActionPerformed

    private void enviosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviosActionPerformed
        verenvios acceso = new verenvios();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_enviosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cotizacion;
    private javax.swing.JButton datosfacturacion;
    private javax.swing.JButton envios;
    private javax.swing.JButton registrotarjeta;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
