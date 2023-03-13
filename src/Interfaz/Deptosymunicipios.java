package Interfaz;

import ipc1.proyecto1.IPC1PROYECTO1;
import static ipc1.proyecto1.IPC1PROYECTO1.municipios;
import ipc1.proyecto1.Municipio;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author wilar
 */
public class Deptosymunicipios extends javax.swing.JFrame {

    /**
     * Creates new form Deptosymunicipios
     */
    public Deptosymunicipios() {
        initComponents();
        this.setLocationRelativeTo(null);
        llenarmunicipios();
        llenareliminar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombredepto = new javax.swing.JTextField();
        nombremuni = new javax.swing.JTextField();
        regresar = new javax.swing.JButton();
        regio = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablamun = new javax.swing.JTable();
        selec = new javax.swing.JComboBox<>();
        elimnareg = new javax.swing.JButton();

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

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
        setTitle("Departamentos y municipios | USAC Delivery");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DEPARTAMENTOS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MUNICIPIOS");

        jLabel4.setText("Región:");

        jLabel5.setText("Nombre:");

        jLabel7.setText("Nombre:");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        regio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(M) Metropolitana", "(NT) Norte", "(NO) Nororiente", "(SO) Suroriente", "(SOC) Suroccidente", "(NOC) Noroccidente" }));

        tablamun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código de región", "Región", "Nombre departamento", "Código de departamento", "Nombre municipio"
            }
        ));
        jScrollPane2.setViewportView(tablamun);

        selec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecActionPerformed(evt);
            }
        });

        elimnareg.setText("Eliminar");
        elimnareg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elimnaregActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selec, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(elimnareg))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nombredepto)
                                            .addComponent(regio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(nombremuni, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresar)
                        .addGap(221, 221, 221))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(nombremuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombredepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elimnareg))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        AdminDisplay acceso = new AdminDisplay();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Departamento
        String namedepto = nombredepto.getText();
        String item = (String) regio.getSelectedItem();

        //Municipios
        String nombremun = nombremuni.getText();
        if(namedepto.isEmpty() || item.isEmpty() || nombremun.isEmpty()){
        JOptionPane.showMessageDialog(this, "Llene los espacios en blanco");

        }
        else if (namedepto.equals(nombremun)) {
         JOptionPane.showMessageDialog(this, "El nombre de municipio y departamento no pueden ser los mismos");
            nombredepto.setText("");
            nombremuni.setText("");


        }else {
        for (Municipio municipioz : municipios) {
            if (municipioz.getNombreMunicipio().equals(nombremun)) {
            JOptionPane.showMessageDialog(this, "Este municipio ya está registrado");
            nombremuni.setText("");
            return;
        }
    }
        Random r = new Random();
        int coder = r.nextInt(9000)+1000;
        int deptoc = r.nextInt(900)+100;
        String codereg = String.valueOf(coder);
        String deptocode = String.valueOf(deptoc);
        Municipio nuevomun = new Municipio(codereg, item, namedepto, deptocode, nombremun);
        municipios.add(nuevomun);
        JOptionPane.showMessageDialog(null, "Datos registrados.");
        llenarmunicipios();
        llenareliminar();
        nombredepto.setText("");
        nombremuni.setText("");
    }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selecActionPerformed

    private void elimnaregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elimnaregActionPerformed
       String it = (String) selec.getSelectedItem();
    for (int i = 0; i < municipios.size(); i++) {
        Municipio z = municipios.get(i);
        if (it.equals(z.getNombre() + " - " + z.getNombreMunicipio())) {
            JOptionPane.showMessageDialog(null, "Region eliminada");
            municipios.remove(i);
            llenarmunicipios();
            llenareliminar();
            break; 
        }
    }
    }//GEN-LAST:event_elimnaregActionPerformed

    
    private void llenarmunicipios(){
        DefaultTableModel modeloDefault = new DefaultTableModel(new String []{"Codigo region", "Region", "Nombre Departamento", "Codigo Departamento", "Nombre municipio"}, IPC1PROYECTO1.municipios.size() );
        tablamun.setModel(modeloDefault);
        
        TableModel modeloDatos = tablamun.getModel();
        for(int i =0; i<IPC1PROYECTO1.municipios.size(); i++){
            Municipio nuevomun = IPC1PROYECTO1.municipios.get(i);
            modeloDatos.setValueAt(nuevomun.getCodigoreg(), i, 0);
            modeloDatos.setValueAt(nuevomun.getRegion(), i, 1);
            modeloDatos.setValueAt(nuevomun.getNombre(), i, 2);
            modeloDatos.setValueAt(nuevomun.getCodigoDepartamento(), i, 3);
            modeloDatos.setValueAt(nuevomun.getNombreMunicipio(), i, 4);
         
        
        }
    
    }
    
    public void llenareliminar(){
                                                      
    selec.removeAllItems(); 
    if(municipios.isEmpty()) {
        selec.addItem("No hay datos");
    } else {
        for(Municipio z: municipios) {
                selec.addItem(z.getNombre()+" - "+z.getNombreMunicipio());
            
        }
    }
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton elimnareg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombredepto;
    private javax.swing.JTextField nombremuni;
    private javax.swing.JComboBox<String> regio;
    private javax.swing.JButton regresar;
    private javax.swing.JComboBox<String> selec;
    private javax.swing.JTable tablamun;
    // End of variables declaration//GEN-END:variables
}
