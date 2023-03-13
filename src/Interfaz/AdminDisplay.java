
package Interfaz;

/**
 *
 * @author wilar
 */
public class AdminDisplay extends javax.swing.JFrame {

    /**
     * Creates new form AdminDisplay
     */
    public AdminDisplay() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mankiosko = new javax.swing.JButton();
        manregion = new javax.swing.JButton();
        mandepto = new javax.swing.JButton();
        reporte = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("admin | USAC Delivery");

        mankiosko.setText("Manejo de Kioscos");
        mankiosko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mankioskoActionPerformed(evt);
            }
        });

        manregion.setText("Manejo de regiones y precios");
        manregion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manregionActionPerformed(evt);
            }
        });

        mandepto.setText(" Manejo de departamentos y municipios");
        mandepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandeptoActionPerformed(evt);
            }
        });

        reporte.setText("Reportes");
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("MENU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regresar)
                    .addComponent(reporte)
                    .addComponent(manregion)
                    .addComponent(mandepto)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(mankiosko)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(mankiosko)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manregion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mandepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(regresar)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Login regreso = new Login();
        regreso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void mandeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandeptoActionPerformed
        Deptosymunicipios next = new Deptosymunicipios();
        next.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mandeptoActionPerformed

    private void mankioskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mankioskoActionPerformed
        manejokiosko next = new manejokiosko();
        next.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mankioskoActionPerformed

    private void manregionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manregionActionPerformed
        manejoregionyprecio next = new manejoregionyprecio();
        next.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manregionActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
         Reportes next = new Reportes();
        next.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_reporteActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mandepto;
    private javax.swing.JButton mankiosko;
    private javax.swing.JButton manregion;
    private javax.swing.JButton regresar;
    private javax.swing.JButton reporte;
    // End of variables declaration//GEN-END:variables
}
