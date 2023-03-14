package Interfaz;

import Interfaz.usuario.Usuarioregular;
import ipc1.proyecto1.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author wilar
 */
public class Login extends javax.swing.JFrame {
public static ArrayList<Usuario> usuarios = new ArrayList<>(); 
   
private static String esteusuario;

    public Login() {
        
     if (!usuarioExiste("ipc1_202100106@ipc1delivery.com")) {
        usuarios.add(new Usuario("ipc1_202100106@ipc1delivery.com", "202100106", "", "", "", "", "", "", "", true));
    }
   
    initComponents();
    this.setLocationRelativeTo(null);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtuser = new javax.swing.JTextField();
        Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        vercontra = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login | USAC Delivery");

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("INICIAR SESIÓN");

        vercontra.setText("Ver Contraseña");
        vercontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vercontraActionPerformed(evt);
            }
        });

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vercontra)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Ingresar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))
                                    .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(txtuser)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vercontra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresar)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        String usr = txtuser.getText();
        String contra = String.valueOf(txtpass.getPassword());
        esteusuario = txtuser.getText();;
        if(usr.isEmpty() || contra.isEmpty()){
        JOptionPane.showMessageDialog(this,"Llene los campos vacios");
        return;
        }
        
        Usuario usuario = null;
        for(Usuario u : usuarios){
        if(u.getUsr().equals(usr) && u.getPass().equals(contra)){
            usuario = u;
            break;
        }
        }
        if(usuario == null){
        JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrectos","Error", JOptionPane.ERROR_MESSAGE);
        txtuser.setText("");
        txtpass.setText("");
        return;
        }
        
        if(usuario.esAdmin){
            JOptionPane.showMessageDialog(this,"Bienvenido admin");
        AdminDisplay acceso = new AdminDisplay();
        acceso.setVisible(true);
        this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(this,"Bienvenido");
  
        Usuarioregular acceso = new Usuarioregular();
        acceso.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void vercontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vercontraActionPerformed
        if(vercontra.isSelected()){
            txtpass.setEchoChar((char)0);
        
    }else{
        txtpass.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_vercontraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Registrousuario acceso = new Registrousuario();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
   
    public static String guardaresteusuario(){
    return esteusuario;
    }
    
    private boolean usuarioExiste(String usr) {
    for (Usuario u : usuarios) {
        if (u.getUsr().equals(usr)) {
            return true;
        }
    }
    return false;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    private javax.swing.JCheckBox vercontra;
    // End of variables declaration//GEN-END:variables
}
