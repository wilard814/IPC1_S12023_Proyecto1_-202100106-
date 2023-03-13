package Interfaz.usuario;

import static ipc1.proyecto1.IPC1PROYECTO1.facyguia;
import ipc1.proyecto1.guiayfactura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wilar
 */
public class compras extends javax.swing.JFrame {

    private int indiceFacturaActual = 0; 

    public compras() {
        initComponents();
        this.setLocationRelativeTo(null);

        mostrarFacturaActual();
    }

    private void mostrarFacturaActual() {
        if (facyguia.isEmpty() || indiceFacturaActual >= facyguia.size()) {
            
            JOptionPane.showMessageDialog(this, "No hay más facturas");
            return;
        }

        // Obtener la factura actual
        guiayfactura factura = facyguia.get(indiceFacturaActual);
        String totalString = String.format("%.2f", factura.getTotal());
        // Llenar los campos de texto con los datos de factura
        llenanit.setText(factura.getNitz());
        llenanombre.setText(factura.getCliente());
        llenadireccion.setText(factura.getDireccioncliente());
        llenapago.setText(factura.getTipopago());
        llenafact.setText(factura.getNfactura());

        
        DefaultTableModel modeloTabla = new DefaultTableModel();

        
        modeloTabla.addColumn("Número de Paquetes");
        modeloTabla.addColumn("Tamaño del Paquete");
        modeloTabla.addColumn("Total de Pago");

      
        Object[] fila = {
            factura.getNpaquete(),
            factura.getTamapaquete(),
            totalString
        };
        modeloTabla.addRow(fila);

        
        tabladatos.setModel(modeloTabla);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        llenanit = new javax.swing.JLabel();
        llenanombre = new javax.swing.JLabel();
        llenadireccion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        llenapago = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        llenafact = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        regresa = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        descargafact = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturas | USAC Delivery");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("NIT: ");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Dirección: ");

        llenanit.setText("No hay datos");

        llenanombre.setText("No hay datos");

        llenadireccion.setText("No hay datos");

        jLabel8.setText("Tipo de pago: ");

        llenapago.setText("No hay datos");

        jLabel10.setText("Factura no: ");

        llenafact.setText("No hay datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(llenanit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addComponent(llenanombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llenadireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llenapago, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(llenafact, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(llenanit)
                    .addComponent(jLabel10)
                    .addComponent(llenafact))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(llenanombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(llenadireccion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(llenapago))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de Paquetes", "Tamaño del paquete", "Total de pago"
            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        regresa.setText("Regresar");
        regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresaActionPerformed(evt);
            }
        });

        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setText("Siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        jLabel5.setDisplayedMnemonic('F');
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("FACTURAS");

        descargafact.setText("Descargar Factura");
        descargafact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargafactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(siguiente))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresa)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(descargafact)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(regresa)))
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(descargafact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anterior)
                    .addComponent(siguiente))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaActionPerformed
        cotizacion acceso = new cotizacion();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresaActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if (indiceFacturaActual > 0) {
            indiceFacturaActual--;
            mostrarFacturaActual();
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if (indiceFacturaActual + 1 < facyguia.size()) {
            indiceFacturaActual++;
            mostrarFacturaActual();
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void descargafactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargafactActionPerformed
     if (facyguia.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay facturas");
        return;
    }

 
    guiayfactura factura = facyguia.get(indiceFacturaActual);

    
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Guardar Factura");
    fileChooser.setSelectedFile(new File("factura.html"));

    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        String filePath = fileToSave.getAbsolutePath();

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("<html>\n<head>\n<title>Factura</title>\n</head>\n<body>\n");
            fileWriter.write("<h1>Factura</h1>\n");
            fileWriter.write("<p><strong>NIT:</strong> " + factura.getNitz() + "</p>\n");
            fileWriter.write("<p><strong>Nombre:</strong> " + factura.getCliente() + "</p>\n");
            fileWriter.write("<p><strong>Dirección:</strong> " + factura.getDireccioncliente() + "</p>\n");
            fileWriter.write("<p><strong>Tipo de pago:</strong> " + factura.getTipopago() + "</p>\n");
            fileWriter.write("<p><strong>Factura no:</strong> " + factura.getNfactura() + "</p>\n");
            fileWriter.write("<table>\n<thead>\n<tr><th>Número de Paquetes</th><th>Tamaño del Paquete</th><th>Total de Pago</th></tr>\n</thead>\n<tbody>\n");
            fileWriter.write("<tr><td>" + factura.getNpaquete() + "</td><td>" + factura.getTamapaquete() + "</td><td>" + String.format("%.2f", factura.getTotal()) + "</td></tr>\n");
            fileWriter.write("</tbody>\n</table>\n");
            fileWriter.write("</body>\n</html>");
            fileWriter.close();

            JOptionPane.showMessageDialog(this, "Factura guardada exitosamente");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar la factura: " + ex.getMessage());
        }
    }

    }//GEN-LAST:event_descargafactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton descargafact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel llenadireccion;
    private javax.swing.JLabel llenafact;
    private javax.swing.JLabel llenanit;
    private javax.swing.JLabel llenanombre;
    private javax.swing.JLabel llenapago;
    private javax.swing.JButton regresa;
    private javax.swing.JButton siguiente;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
