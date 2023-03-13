package Interfaz;

import ipc1.proyecto1.IPC1PROYECTO1;
import static ipc1.proyecto1.IPC1PROYECTO1.kiosco;
import static ipc1.proyecto1.IPC1PROYECTO1.municipios;
import ipc1.proyecto1.Municipio;
import ipc1.proyecto1.datoskiosco;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author wilar
 */
public class manejokiosko extends javax.swing.JFrame {

    public manejokiosko() {
        initComponents();
        this.setLocationRelativeTo(null);
        lennarkiosco();
        llenareliminar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regiozzz = new javax.swing.JComboBox<>();
        kiosname = new javax.swing.JTextField();
        asignacion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablakiosco = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        kioscoborrar = new javax.swing.JComboBox<>();
        elimniar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar kiosko | USAC-Delivery");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR NUEVO KIOSCO");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre del kiosco:");

        jLabel4.setText("Código de la región:");

        regiozzz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regiozzzActionPerformed(evt);
            }
        });

        kiosname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiosnameActionPerformed(evt);
            }
        });

        asignacion.setText("Asignar");
        asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignacionActionPerformed(evt);
            }
        });

        tablakiosco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de kiosco", "Nombre del kiosco", "Código de la región"
            }
        ));
        jScrollPane1.setViewportView(tablakiosco);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("KIOSCOS REGISTRADOS");

        kioscoborrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No hay datos" }));

        elimniar.setText("Eliminar");
        elimniar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimniarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("ELIMINAR KIOSCO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(kioscoborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(elimniar))
                                    .addComponent(jLabel6))
                                .addGap(109, 109, 109))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kiosname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(asignacion)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(regiozzz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar)
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kiosname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(regiozzz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(asignacion)
                .addGap(92, 92, 92)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kioscoborrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimniar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        AdminDisplay next = new AdminDisplay();
        next.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void regiozzzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regiozzzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regiozzzActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarregio();
    }//GEN-LAST:event_formWindowOpened

    private void asignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignacionActionPerformed
        //Asignar variables
        
        String namekios = kiosname.getText();
        String item = (String) regiozzz.getSelectedItem();
        
         if (item.isEmpty() || namekios.isEmpty()){
        JOptionPane.showMessageDialog(this, "Llene los espacios en blanco");
        
        }else {
        for (datoskiosco k : kiosco) {
        if (k.getNombrekiosco().equals(namekios)) {
            JOptionPane.showMessageDialog(this, "Este municipio ya está registrado");
            kiosname.setText("");
            return;
        }
    }
     String codigoRegional = obtenerCodigoRegional(item);
     Random r = new Random();
     int numrand = r.nextInt(90000)+10000;
     String codigokios = String.valueOf(numrand);
        datoskiosco nuevokiosco = new datoskiosco(codigokios, namekios, codigoRegional);
        kiosco.add(nuevokiosco);
        JOptionPane.showMessageDialog(null, "Kiosco Registrado.");
         kiosname.setText("");
         lennarkiosco();
         llenareliminar();
        }
    }//GEN-LAST:event_asignacionActionPerformed

    private void kiosnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiosnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kiosnameActionPerformed

    private void elimniarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimniarActionPerformed
        String it = (String) kioscoborrar.getSelectedItem();
    for (int i = 0; i < kiosco.size(); i++) {
        datoskiosco z = kiosco.get(i);
        if (it.equals(z.getCodigokiosco()+" - "+z.getNombrekiosco())) {
            JOptionPane.showMessageDialog(null, "Kiosco eliminado");
            kiosco.remove(i);
            lennarkiosco();
            llenareliminar();
            break; 
        }
    }
    }//GEN-LAST:event_elimniarActionPerformed
public void llenarregio() {
    regiozzz.removeAllItems(); 
    if (municipios.isEmpty()) {
        regiozzz.addItem("No hay datos");
    } else {
        for (Municipio mun : municipios) {
            String codigoRegion = mun.getCodigoreg();
            String region = mun.getRegion();
            String item = codigoRegion + " - " + region;
            regiozzz.addItem(item);
        }
    }
}

private String obtenerCodigoRegional(String item) {
    String[] partes = item.split(" - ");
    if (partes.length != 2) {
        throw new IllegalArgumentException("Este elemento no tiene el formato esperado");
    }
    return partes[0];
}

private void lennarkiosco(){
        DefaultTableModel modeloDefault = new DefaultTableModel(new String []{"Codigo de Kiosco", "Nombre del kiosco", "Codigo de region"}, IPC1PROYECTO1.kiosco.size() );
        tablakiosco.setModel(modeloDefault);
        
        TableModel modeloDatos = tablakiosco.getModel();
        for(int i =0; i<IPC1PROYECTO1.kiosco.size(); i++){
            datoskiosco newkiosco = IPC1PROYECTO1.kiosco.get(i);
            modeloDatos.setValueAt(newkiosco.getCodigokiosco(), i, 0);
            modeloDatos.setValueAt(newkiosco.getNombrekiosco(), i, 1);
            modeloDatos.setValueAt(newkiosco.getCodigoregkiosco(), i, 2);
         
        
        }
    
    }
        
    public void llenareliminar(){
                                                      
    kioscoborrar.removeAllItems(); 
    if(kiosco.isEmpty()) {
        kioscoborrar.addItem("No hay datos");
    } else {
        for(datoskiosco z: kiosco) {
                kioscoborrar.addItem(z.getCodigokiosco()+" - "+z.getNombrekiosco());
            
        }
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignacion;
    private javax.swing.JButton elimniar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> kioscoborrar;
    private javax.swing.JTextField kiosname;
    private javax.swing.JComboBox<String> regiozzz;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tablakiosco;
    // End of variables declaration//GEN-END:variables
}
