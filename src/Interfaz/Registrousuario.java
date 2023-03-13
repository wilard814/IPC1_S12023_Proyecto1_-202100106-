package Interfaz;

import javax.swing.JOptionPane;

import static Interfaz.Login.usuarios;
import ipc1.proyecto1.Usuario;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author wilar
 */
public class Registrousuario extends javax.swing.JFrame {

   
    public Registrousuario() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        llenarTabla();
        llenareliminar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextcorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextDPI = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboRol = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextNacimiento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboGenero = new javax.swing.JComboBox<>();
        Registrarboton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        alias = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        subir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        nacionalidad = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        borrar = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        asignarkiosko = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        elusr = new javax.swing.JComboBox<>();
        eliminarus = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("USUARIOS REGISTRADOS");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("USUARIOS REGISTRADOS");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("REGISTRO DE USUARIOS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de usuarios | USAC Delivery");

        jLabel1.setText(" Correo electrónico");

        jTextcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcorreoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jTextapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextapellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Contraseña");

        jLabel5.setText("Reingresar contraseña");

        jLabel6.setText("DPI");

        jLabel7.setText("Rol");

        jComboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario regular" }));
        jComboRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboRolActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha de nacimiento");

        jLabel9.setText("Género");

        jComboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Prefiero no indicarlo" }));
        jComboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboGeneroActionPerformed(evt);
            }
        });

        Registrarboton.setText("Registrar");
        Registrarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarbotonActionPerformed(evt);
            }
        });

        jLabel10.setText("Nacionalidad");

        jLabel11.setText("Sobrenombre (alias)");

        jLabel12.setText("Télefono");

        subir.setText("Subir");
        subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirActionPerformed(evt);
            }
        });

        jLabel13.setText("dd/mm/aaaa");

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Alemania", "Arabia Saudita", "Argentina", "Australia", "Bélgica", "Bolivia", "Brasil", "Camboya", "Canadá", "Chile", "China", "Colombia", "Corea", "Costa Rica", "Cuba", "Dinamarca", "Ecuador", "Egipto", "El Salvador", "Escocia", "España", "Estados Unidos", "Estonia", "Etiopia", "Filipinas", "Finlandia", "Francia", "Gales", "Grecia", "Guatemala", "Haití", "Holanda", "Honduras", "Indonesia", "Inglaterra", "Irak", "Irán", "Irlanda", "Israel", "Italia", "Japón", "Jordania", "Laos", "Letonia", "Lituania", "Malasia", "Marruecos", "México", "Nicaragua", "Noruega", "\"Nueva Zelanda", "Nueva Zelandia\"", "Panamá", "Paraguay", "Perú", "Polonia", "Portugal", "Puerto Rico", "Republica Dominicana", "Rumania", "Rusia", "Suecia", "Suiza", "Tailandia", "Taiwán", "Turquía", "Ucrania", "Uruguay", "Venezuela", "Vietnam" }));
        nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadActionPerformed(evt);
            }
        });

        borrar.setText("Restablecer Imagen");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        asignarkiosko.setText("Asignar kiosco (Usuario)");
        asignarkiosko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarkioskoActionPerformed(evt);
            }
        });

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo electronico", "Contraseña", "Rol (es admin)", "DPI", "Fecha Nacimiento", "Nacionalidad", "Alias", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("USUARIOS REGISTRADOS");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("ELIMINAR USUARIO");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("REGISTRO DE USUARIOS");

        elusr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No hay datos" }));

        eliminarus.setText("Eliminar");
        eliminarus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextcorreo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextapellido)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel3))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addComponent(jTextDPI, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel13))
                                .addComponent(jComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Registrarboton))
                            .addComponent(jLabel9)))
                    .addComponent(jLabel15)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(regresar)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(telefono)
                                        .addComponent(alias)
                                        .addComponent(asignarkiosko, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(subir)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(74, 74, 74)
                        .addComponent(elusr, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(eliminarus))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(jLabel19)
                    .addContainerGap(391, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regresar)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(subir))
                            .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(borrar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registrarboton)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asignarkiosko))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elusr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarus))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(736, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Login acceso = new Login();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void RegistrarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarbotonActionPerformed
        String nombre2 = jTextname.getText();
        String correo2 = jTextcorreo.getText();
        String apellido2 = jTextapellido.getText();
        String id = jTextDPI.getText();
        String fecha = jTextNacimiento.getText();
        String als = alias.getText();
        String tel = telefono.getText();
        String nacion= nacionalidad.getSelectedItem().toString();
        String contra = new String (jPasswordField1.getPassword() );
        String autentcontra = String.valueOf(jPasswordField2.getPassword());
        boolean admin = jComboRol.getSelectedItem().equals("Administrador");
        //Patron para verificar fecha dd/mm/aaaa
        Pattern patronFecha = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
        if (!contra.equals(autentcontra)){
                        JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
                        jPasswordField1.setText("");
                        jPasswordField2.setText("");
                        return;
                        }
        
        
        for(int i = 0; i<usuarios.size(); i++){
            Usuario usuarioz = usuarios.get(i);
          if (nombre2.isEmpty() || correo2.isEmpty() || apellido2.isEmpty()||id.isEmpty() || fecha.isEmpty() || als.isEmpty()||tel.isEmpty() || nacion.isEmpty() || contra.isEmpty()||autentcontra.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Necesita llenar los espacios en blanco", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        }else if(tel.length()<8 || tel.length()>8 ){
        JOptionPane.showMessageDialog(null, "El numero de telefono debe de ser de 8 digitos.");
                        telefono.setText("");
                      return;
        
        }else if(id.length()<13 || id.length()>13 && !id.matches(".*[a-z].*")){
        JOptionPane.showMessageDialog(null, "El numero de DPI es de 13 Digitos.");
                        jTextDPI.setText("");
                         return;
                         } else if (usuarioz.getUsr().equals(correo2) && !usuarioz.getNombre().equals("admin") && !usuarioz.getAlias().equals("pipe")) {
                        JOptionPane.showMessageDialog(this, "Este usuario ya está registrado");
                                break;
                                
                                
                                
                        }else if (!correo2.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                             JOptionPane.showMessageDialog(null, "El correo electrónico no tiene un formato válido.");
                        jTextcorreo.setText("");
                        return;

                         } else if(!patronFecha.matcher(fecha).matches()) {
                         JOptionPane.showMessageDialog(null, "El formato de la fecha es incorrecto. Utilice el formato dd/mm/aaaa");
                            jTextNacimiento.setText("");
                                return;
                        }               
                         else {
                    // Verificar que la contraseña cumple los requisitos
                    if (verificarPass(contra)) {
                        // Crear el nuevo usuario y agregarlo a la lista
                        Usuario nuevoUsuario = new Usuario(correo2,contra , nombre2, apellido2, nacion , als, fecha, tel,id, admin);
                        usuarios.add(nuevoUsuario);
                        JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente.");
                        llenareliminar();
                        llenarTabla();
                        jTextname.setText("");
                        jTextcorreo.setText("");
                        jTextapellido.setText("");
                        jTextDPI.setText("");
                        jTextNacimiento.setText("");
                        alias.setText("");
                        telefono.setText("");
                        jPasswordField1.setText(""); 
                        jPasswordField2.setText("");
                        break;
                      
                   
                    } else{
                        JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula, una letra mayúscula, un número y un carácter especial.");
                        contra = "";
                        autentcontra = "";
                    }
                    
        }
        }
    }//GEN-LAST:event_RegistrarbotonActionPerformed

    private void jComboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboGeneroActionPerformed

    private void nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadActionPerformed

    private void jTextcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcorreoActionPerformed

    private void subirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirActionPerformed

        JFileChooser fileChooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter(
                        "Archivos de imagen", "jpg", "jpeg", "png", "gif");
                fileChooser.setFileFilter(filter);
        Component panel = null;
                int returnVal = fileChooser.showOpenDialog(panel);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    if (isImageFile(file)) {
                        
                        ImageIcon icon = new ImageIcon(file.getAbsolutePath());
                        Image image = icon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon scaledIcon = new ImageIcon(image);
                        imagen.setIcon(scaledIcon);
                        imagen.setHorizontalAlignment(JLabel.CENTER);
                        imagen.setVerticalAlignment(JLabel.CENTER);
                    } else {
                        JOptionPane.showMessageDialog(panel, "Archivo no admitido. Seleccione una imagen (jpg, jpeg, png, gif).", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
    }//GEN-LAST:event_subirActionPerformed

    private void jTextapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextapellidoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
         
                imagen.setIcon(null);
           
    }//GEN-LAST:event_borrarActionPerformed

    private void jComboRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboRolActionPerformed

    private void asignarkioskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarkioskoActionPerformed
        boolean hayfalso = false;
        for(Usuario usuario : usuarios){
        if(!usuario.esAdmin){
        hayfalso = true;
        break;
        
        }
        
        }
        if (hayfalso){
           asignarkiosko acceso = new asignarkiosko();
        acceso.setVisible(true);
        this.setVisible(false); 
        
        }else{
            JOptionPane.showMessageDialog(this, "No hay usuarios regulares registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        
        
        }
    }//GEN-LAST:event_asignarkioskoActionPerformed

    private void eliminarusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarusActionPerformed
         String it = (String) elusr.getSelectedItem();
    for (int i = 0; i < usuarios.size(); i++) {
        Usuario z = usuarios.get(i);
        if (it.equals(z.getUsr())) {
            JOptionPane.showMessageDialog(null, "Usuario eliminado");
            usuarios.remove(i);
            llenarTabla();
            llenareliminar();
            break; 
        }
    }
    }//GEN-LAST:event_eliminarusActionPerformed
  private boolean verificarPass(String contra) {
        boolean contieneLetraMin = false;
        boolean contieneLetraMay = false;
        boolean contieneNum = false;
        boolean contieneCaracEspecial = false;

        
        for (int i = 0; i < contra.length(); i++) {
            char c = contra.charAt(i);
            if (Character.isLowerCase(c)) {
                contieneLetraMin = true;
            } else if (Character.isUpperCase(c)) {
                contieneLetraMay = true;
            } else if (Character.isDigit(c)) {
                contieneNum = true;
            } else if (!Character.isLetterOrDigit(c)) {
                contieneCaracEspecial = true;
            }
        }

        // Verificar que se cumplan todos los requisitos
        return contieneLetraMin && contieneLetraMay && contieneNum && contieneCaracEspecial;
    }
  
  private void llenarTabla() {
    DefaultTableModel modeloDefault = new DefaultTableModel(new String []{"Nombre", "Apellido", "Correo Electronico", "Contraseña", "Rol", "DPI", "Fecha Nacimiento", "Nacionalidad", "Alias", "Telefono"}, 0);
    tabladatos.setModel(modeloDefault);

    for(int i = 0; i < Login.usuarios.size(); i++) {
        Usuario usuario = Login.usuarios.get(i);
        modeloDefault.addRow(new Object[]{usuario.getNombre(), usuario.getApellido(), usuario.getUsr(), usuario.getPass(), usuario.esAdmin, usuario.getDpi(), usuario.getFecha(), usuario.getNacionalidad(), usuario.getAlias(), usuario.getTelefono()});
    }
}
   
private boolean isImageFile(File file) {
        String name = file.getName();
        String extension = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
        return extension.equals("jpg") || extension.equals("jpeg") || extension.equals("png") || extension.equals("gif");
    }

public void llenareliminar(){
                                                      
    elusr.removeAllItems(); 
    if(usuarios.isEmpty()) {
        elusr.addItem("No hay datos");
    } else {
        for(Usuario z: usuarios) {
                elusr.addItem(z.getUsr());
            
        }
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrarboton;
    private javax.swing.JTextField alias;
    private javax.swing.JButton asignarkiosko;
    private javax.swing.JButton borrar;
    private javax.swing.JButton eliminarus;
    private javax.swing.JComboBox<String> elusr;
    private javax.swing.JLabel imagen;
    private javax.swing.JComboBox<String> jComboGenero;
    private javax.swing.JComboBox<String> jComboRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextDPI;
    private javax.swing.JTextField jTextNacimiento;
    private javax.swing.JTextField jTextapellido;
    private javax.swing.JTextField jTextcorreo;
    private javax.swing.JTextField jTextname;
    private javax.swing.JComboBox<String> nacionalidad;
    private javax.swing.JButton regresar;
    private javax.swing.JButton subir;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables

   
}
