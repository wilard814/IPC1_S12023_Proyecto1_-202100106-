package Interfaz.usuario;

import static ipc1.proyecto1.IPC1PROYECTO1.creditodebito;
import ipc1.proyecto1.tarjeta;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author wilar
 */
public class Registrodetarjetas extends javax.swing.JFrame {

    public Registrodetarjetas() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenareliminar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombretarjeta = new javax.swing.JTextField();
        notarjeta = new javax.swing.JTextField();
        fechavencimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        eliminartarjeta = new javax.swing.JComboBox<>();
        eltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro tarjeta | Usac Delivery");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRAR TARJETA DE CREDITO / DEBITO");

        jLabel2.setText("Nombre de la tarjeta:");

        jLabel3.setText("Número de la tarjeta:");

        jLabel4.setText("Fecha de vencimiento:");

        jLabel5.setText("mm/aa");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("ELIMINAR DATOS DE TARJETA DE CREDITO/DEBITO");

        eliminartarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No hay datos" }));

        eltar.setText("Eliminar");
        eltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nombretarjeta)
                                        .addComponent(fechavencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(notarjeta))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(eliminartarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eltar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombretarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(notarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fechavencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(registrar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminartarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eltar))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
       Usuarioregular acceso = new Usuarioregular();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String ntar = nombretarjeta.getText();
        String numtar = notarjeta.getText();
        String venc = fechavencimiento.getText();
        Pattern patronvencimiento = Pattern.compile("^\\d{2}/\\d{2}$");
        
        if(!patronvencimiento.matcher(venc).matches()) {
                         JOptionPane.showMessageDialog(null, "El formato de la fecha es incorrecto. Utilice el formato dd/mm/aaaa");
                            fechavencimiento.setText("");
                                return;
                        }
        if (ntar.isEmpty() || numtar.isEmpty() || venc.isEmpty()){
        JOptionPane.showMessageDialog(this, "Necesita llenar los espacios en blanco", "Error", JOptionPane.ERROR_MESSAGE);
            return;    
        }
        
         if(numtar.length()<16 || numtar.length()>16 ){
        JOptionPane.showMessageDialog(null, "El numero de la tarjeta debe de ser de 16 digitos.");
                        notarjeta.setText("");
                      
        }else{ 
         
         for(int i = 0; i<creditodebito.size(); i++){
            tarjeta tar = creditodebito.get(i);
            
         if(tar.getNumerotarjeta().equals(numtar)){
                  JOptionPane.showMessageDialog(this, "Esta tarjeta ya está registrada");
                    
                    break;           
         }
         } 
                            tarjeta nuevatar = new tarjeta(ntar, numtar, venc, ntar);
                            creditodebito.add(nuevatar);
                            JOptionPane.showMessageDialog(null, "Tarjeta registrada");
                            llenareliminar();
                                nombretarjeta.setText("");
                                notarjeta.setText("");
                                fechavencimiento.setText("");
         
    }
    }//GEN-LAST:event_registrarActionPerformed

    private void eltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eltarActionPerformed
           String it = (String) eliminartarjeta.getSelectedItem();
    for (int i = 0; i < creditodebito.size(); i++) {
        tarjeta z = creditodebito.get(i);
        if (it.equals(z.getNumerotarjetatruncado())) {
            JOptionPane.showMessageDialog(null, "Tarjeta Eliminada");
            creditodebito.remove(i);
            llenareliminar();
            break; 
        }
    }
    }//GEN-LAST:event_eltarActionPerformed

  public void llenareliminar(){
                                                      
    eliminartarjeta.removeAllItems(); 
    if(creditodebito.isEmpty()) {
        eliminartarjeta.addItem("No hay datos");
    } else {
        for(tarjeta z: creditodebito) {
                eliminartarjeta.addItem(z.getNumerotarjetatruncado());
            
        }
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> eliminartarjeta;
    private javax.swing.JButton eltar;
    private javax.swing.JTextField fechavencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombretarjeta;
    private javax.swing.JTextField notarjeta;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
