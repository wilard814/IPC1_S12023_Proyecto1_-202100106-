package Interfaz;

import static Interfaz.Login.usuarios;
import ipc1.proyecto1.IPC1PROYECTO1;
import static ipc1.proyecto1.IPC1PROYECTO1.kiosco;
import static ipc1.proyecto1.IPC1PROYECTO1.uskiosco;
import ipc1.proyecto1.Usuario;
import ipc1.proyecto1.datoskiosco;
import ipc1.proyecto1.usuariowithkiosco;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author wilar
 */
public class asignarkiosko extends javax.swing.JFrame {

    public asignarkiosko() {
        initComponents();
                this.setLocationRelativeTo(null);
                llenarTabla();
                llenareliminar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        usuarioszzzzz = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kioscoadd = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablakiosco = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        desasignar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        eliminar = new javax.swing.JComboBox<>();

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
        setTitle("Asignar kiosco | USAC Delivery");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usuarioszzzzz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No hay datos" }));
        usuarioszzzzz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioszzzzzActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Kiosco");

        kioscoadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kioscoaddActionPerformed(evt);
            }
        });

        jButton2.setText("Asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tablakiosco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Nombre kiosco", "Codigo kiosco", "Codigo region"
            }
        ));
        jScrollPane2.setViewportView(tablakiosco);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ASIGNACIÓN DE KIOSCO");

        desasignar.setText("Desasignar");
        desasignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desasignarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ELIMINAR USUARIO DE KIOSCO");

        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(kioscoadd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioszzzzz, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(desasignar))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButton2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(3, 3, 3)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kioscoadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioszzzzz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desasignar)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registrousuario acceso = new Registrousuario();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usuarioszzzzzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioszzzzzActionPerformed

    }//GEN-LAST:event_usuarioszzzzzActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        llenarcombo();
        llenarcombo2();
    }//GEN-LAST:event_formWindowOpened

    private void kioscoaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kioscoaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kioscoaddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String itemz = (String) usuarioszzzzz.getSelectedItem();
        String itemzz = (String) kioscoadd.getSelectedItem();
    
        boolean usuarioRegistrado = false;
        for(usuariowithkiosco uk : uskiosco) {
            if (uk.getNamek().equals(itemz)) {
                usuarioRegistrado = true;
                break;
            }
        }
        if (usuarioRegistrado) {
            JOptionPane.showMessageDialog(this, "Este usuario ya está registrado");
        } else {
            boolean kioscoRegistrado = false;
            for (datoskiosco dk : kiosco) {
                if (dk.getNombrekiosco().equals(itemzz)) {
                    kioscoRegistrado = true;
                    String codigokios = dk.getCodigokiosco();
                    String codigoregkiosco = dk.getCodigoregkiosco();
                    usuariowithkiosco uwk = new usuariowithkiosco(itemz, itemzz, codigokios, codigoregkiosco);
                    uskiosco.add(uwk);
                    JOptionPane.showMessageDialog(null, "Usuario asociado exitosamente.");
                    llenarTabla();
                    llenareliminar();
                    break;
                }
            }
            if (!kioscoRegistrado) {
                JOptionPane.showMessageDialog(this, "No se encontró el kiosco seleccionado.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void desasignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desasignarActionPerformed
        String it = (String) eliminar.getSelectedItem();
            for (int i = 0; i < uskiosco.size(); i++) {
                usuariowithkiosco z = uskiosco.get(i);
                if (it.equals(z.getUsrk()+" - "+z.getNamek())) {
                    JOptionPane.showMessageDialog(null, "Usuario desvinculado del kiosco");
                    uskiosco.remove(i);
                    llenarTabla();
                    llenareliminar();
                    break; 
                }
            }    
    }//GEN-LAST:event_desasignarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarActionPerformed
    public void llenarcombo(){

        usuarioszzzzz.removeAllItems(); 
        if(usuarios.isEmpty()) {
            usuarioszzzzz.addItem("No hay datos");
        } else {
            for(Usuario usuario: usuarios) {
                if(usuario.esAdmin == false) { // filtra los usuarios según su estado booleano
                    usuarioszzzzz.addItem(usuario.getUsr());
                }
            }
        }
    }

    public void llenarcombo2(){

        kioscoadd.removeAllItems(); 
        if(kiosco.isEmpty()) {
            kioscoadd.addItem("No hay datos");
        } else {
            for(datoskiosco ki: kiosco) {
                    kioscoadd.addItem(ki.getNombrekiosco());

            }
        }
    }

     private void llenarTabla(){
            DefaultTableModel modeloDefault = new DefaultTableModel(new String []{"Usuario", "Nombre kiosco", "Codigo kiosco", "Codigo region"}, IPC1PROYECTO1.uskiosco.size() );
            tablakiosco.setModel(modeloDefault);

            TableModel modeloDatos = tablakiosco.getModel();
            for(int i =0; i<IPC1PROYECTO1.uskiosco.size(); i++){
                usuariowithkiosco kios = IPC1PROYECTO1.uskiosco.get(i);
                modeloDatos.setValueAt(kios.getUsrk(), i, 0);
                modeloDatos.setValueAt(kios.getNamek(), i, 1);
                modeloDatos.setValueAt(kios.getCodek(), i, 2);
                modeloDatos.setValueAt(kios.getCoder(), i, 3);




            }

        }

     public void llenareliminar(){

        eliminar.removeAllItems(); 
        if(uskiosco.isEmpty()) {
            eliminar.addItem("No hay datos");
        } else {
            for(usuariowithkiosco z: uskiosco) {
                    eliminar.addItem(z.getUsrk()+" - "+z.getNamek());

            }
        }
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton desasignar;
    private javax.swing.JComboBox<String> eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> kioscoadd;
    private javax.swing.JTable tablakiosco;
    private javax.swing.JComboBox<String> usuarioszzzzz;
    // End of variables declaration//GEN-END:variables
}
