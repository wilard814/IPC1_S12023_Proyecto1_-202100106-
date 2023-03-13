package Interfaz.usuario;


import ipc1.proyecto1.guiayfactura;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author wilar
 */
public class descargaguia extends javax.swing.JFrame {
        private int indiceActual = 0;
        private ArrayList<guiayfactura> facyguia;
  
    public descargaguia(ArrayList facyguia) {
        
        
        
       initComponents();
        this.setLocationRelativeTo(null);
        this.facyguia = facyguia;
        actualizarCampos();
       
        ImageIcon codigobara = new ImageIcon("src/imagen/codigobarras.jpg");
        Icon icono = new ImageIcon(codigobara.getImage().getScaledInstance(codigobar.getWidth(), codigobar.getHeight(), Image.SCALE_DEFAULT));
        
        codigobar.setIcon(icono);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        llenadestino = new javax.swing.JLabel();
        llenaorigen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        remitente = new javax.swing.JLabel();
        destinatarioz = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigopa = new javax.swing.JLabel();
        nopaquetes = new javax.swing.JLabel();
        tamañopaquetes = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        descargafa = new javax.swing.JButton();
        codigobar = new javax.swing.JLabel();

        jLabel11.setText("No hay datos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guia | USAC-Delivery");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DESCARGAR GUÍA");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Origen: ");

        jLabel4.setText("Destino:");

        llenadestino.setText("No hay datos");

        llenaorigen.setText("No hay datos");

        jLabel5.setText("Destinatario: ");

        jLabel8.setText("Remitente: ");

        remitente.setText("No hay datos");

        destinatarioz.setText("No hay datos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(llenaorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(llenadestino, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remitente)
                    .addComponent(destinatarioz))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(llenaorigen)
                    .addComponent(jLabel8)
                    .addComponent(remitente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(llenadestino)
                    .addComponent(jLabel5)
                    .addComponent(destinatarioz))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel3.setText("Codigo paquete: ");

        jLabel6.setText("Número de paquetes: ");

        jLabel7.setText("Tamaño del paquete: ");

        codigopa.setText("No hay datos");

        nopaquetes.setText("No hay datos");

        tamañopaquetes.setText("No hay datos");

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

        descargafa.setText("Descargar Guia");
        descargafa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargafaActionPerformed(evt);
            }
        });

        codigobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/codigobarras.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(regresar)
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(descargafa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(siguiente))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(nopaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tamañopaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigopa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigobar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigopa))
                .addGap(18, 18, 18)
                .addComponent(codigobar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tamañopaquetes)
                    .addComponent(nopaquetes)
                    .addComponent(jLabel6))
                .addGap(45, 45, 45)
                .addComponent(descargafa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anterior)
                    .addComponent(siguiente))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
       anterior.addActionListener((e) -> {
    indiceActual--;
    if (indiceActual < 0) {
        indiceActual = facyguia.size() - 1;
    }
    actualizarCampos();
});
    }//GEN-LAST:event_anteriorActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        siguiente.addActionListener((e) -> {
    indiceActual++;
    if (indiceActual >= facyguia.size()) {
        indiceActual = 0;
    }
    actualizarCampos();
});
  
    }//GEN-LAST:event_siguienteActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        cotizacion vi = new cotizacion();
        vi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void descargafaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargafaActionPerformed
  if (facyguia.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay Guias");
        return;
    }

        
        descargarHTML();

    }//GEN-LAST:event_descargafaActionPerformed
  
       
        
        private void actualizarCampos() {
            
            if (facyguia.isEmpty() || indiceActual >= facyguia.size()) {
            JOptionPane.showMessageDialog(this, "No hay más Guias");
            return;
        }
            
    guiayfactura actual = facyguia.get(indiceActual);
    llenaorigen.setText(actual.getOrigen());
    llenadestino.setText(actual.getDestino());
    codigopa.setText(actual.getCodigopaq());
    nopaquetes.setText(actual.getNpaquete());
    tamañopaquetes.setText(actual.getTamapaquete()+" - "+"lb");
    remitente.setText(actual.getUsuariofactura());
    destinatarioz.setText(actual.getUsuariodest());
    
}

private void descargarHTML() {
    ImageIcon codigobara = new ImageIcon(getClass().getResource("/imagen/codigobarras.jpg"));
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Guardar archivo");
    fileChooser.setSelectedFile(new File("guia.html")); 
    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        String filePath = fileToSave.getAbsolutePath();
        try {
             FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("<html>");
       
        fileWriter.write("<head>");
        
        fileWriter.write("<title>Guia</title>");
      
        fileWriter.write("</head>");
       
        fileWriter.write("<body>");
 
        fileWriter.write("<h1>Informacion de la Guía</h1>");
      
        fileWriter.write("<p><strong>Origen:</strong> " + llenaorigen.getText() + "</p>");

        fileWriter.write("<p><strong>Destino:</strong> " + llenadestino.getText() + "</p>");
     
        fileWriter.write("<p><strong>Remitente:</strong> " + remitente.getText() + "</p>");
      
        fileWriter.write("<p><strong>Destinatario:</strong> " + destinatarioz.getText() + "</p>");
  
        fileWriter.write("<p><strong>Codigo del paquete:</strong> " + codigopa.getText() + "</p>");
        
        fileWriter.write("<p><strong>Numero de paquetes:</strong> " + nopaquetes.getText() + "</p>");
        
        fileWriter.write("<p><strong>Tamaño del paquete:</strong> " + tamañopaquetes.getText() + "</p>");
    
        fileWriter.write("</body>");
       
        fileWriter.write("<p><strong>Codigo de barras:</strong> <img src='" + codigobara.toString() + "'/></p>");
        
        fileWriter.write("</html>");
        
            fileWriter.close();

            JOptionPane.showMessageDialog(this, "Factura guardada exitosamente");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar la factura: " + ex.getMessage());
        }
    
    }
}

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JLabel codigobar;
    private javax.swing.JLabel codigopa;
    private javax.swing.JButton descargafa;
    private javax.swing.JLabel destinatarioz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel llenadestino;
    private javax.swing.JLabel llenaorigen;
    private javax.swing.JLabel nopaquetes;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel remitente;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel tamañopaquetes;
    // End of variables declaration//GEN-END:variables
}
