/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author Leo
 */
public class PersonaFrame extends javax.swing.JFrame {

    PersonaServicio personaServicio = new PersonaServicio();

    public PersonaFrame() {
        initComponents();
        setLocationRelativeTo(null);
        txtId.setVisible(false);
        btnGuardarEdicion.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollP = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        btnGuardarEdicion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(" ");

        jLabel1.setText("DNI:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Edad:");

        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollP.setViewportView(tabla);

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnGuardarEdicion.setText("Guardar Edición");
        btnGuardarEdicion.setBorder(null);
        btnGuardarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEdicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardarEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrarTextoTemporal(String titulo) {
        // Establecer el texto en la etiqueta
        lblTitulo.setText(titulo);

        // Crear un Timer que se ejecutará una vez después de 'milisegundos' milisegundos
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Borrar el texto de la etiqueta
                lblTitulo.setText("");
            }
        });
        // Configurar el Timer para que solo se ejecute una vez
        timer.setRepeats(false);
        // Iniciar el Timer
        timer.start();
    }

    // Crear un modelo de tabla con las columnas

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        String dniText = txtDNI.getText();
        String apellido = txtApellido.getText();
        String nombre = txtNombre.getText();
        String edadText = txtEdad.getText();

        // Validar que los campos no estén vacíos
        if (dniText.isEmpty() || apellido.isEmpty() || nombre.isEmpty() || edadText.isEmpty()) {
            mostrarTextoTemporal("¡Todos los campos son obligatorios!");
            return;
        }

        int dni;
        int edad;

        // Validar que el DNI sea un número entero
        try {
            dni = Integer.parseInt(dniText);
        } catch (NumberFormatException e) {
            mostrarTextoTemporal("¡El DNI debe ser un número entero entre 7 y 8 dígitos!");
            return;
        }

        // Validar que la edad sea un número entero
        try {
            edad = Integer.parseInt(edadText);
        } catch (NumberFormatException e) {
            mostrarTextoTemporal("¡La edad debe ser un número entero!");
            return;
        }

        // Validar que la edad sea un número positivo
        if (edad <= 0) {
            mostrarTextoTemporal("¡La edad debe ser mayor a 0!");
            return;
        }

        // Validar longitud del DNI (si se requiere una longitud específica)
        if (dniText.length() < 7 || dniText.length() > 8) {
            mostrarTextoTemporal("¡El DNI debe tener entre 7 y 8 dígitos!");
            return;
        }

        // Validar que el apellido y el nombre sean solo letras y espacios
        if (!apellido.matches("[a-zA-Z ]+")) {
            mostrarTextoTemporal("¡El apellido debe contener solo letras y/o espacios!");
            return;
        }

        if (!nombre.matches("[a-zA-Z ]+")) {
            mostrarTextoTemporal("¡El nombre debe contener solo letras y/o espacios!");
            return;
        }

        Persona persona = new Persona(nombre, apellido, edad, dni);

        try {
            personaServicio.agregarPersona(persona);
            mostrarTextoTemporal("¡Persona agregada exitosamente!");
            txtDNI.setText("");
            txtApellido.setText("");
            txtNombre.setText("");
            txtEdad.setText("");
            mostrarMensaje("Persona agregada correctamente", "Info", "Guardado exitoso");
            cargarTabla();

        } catch (SQLException ex) {
            String error = ex.getMessage();

            if (error.charAt(0) == 68) {
                mostrarTextoTemporal("¡ERROR! Este DNI ya esta registrado");

            }
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tabla.getRowCount() > 0) {
            //Validacion de seleccion de fila/registro
            if (tabla.getSelectedRow() != -1) {
                //Obtener id de persona seleccionada ( Casteo de Objeto a String y de String a Entero)
                int idPersona = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));

                try {
                    Persona persona = personaServicio.obtenerPersona(idPersona);
                    int id = persona.getId();
                    int dni = persona.getDni();
                    String apellido = persona.getApellido();
                    String nombre = persona.getNombre();
                    int edad = persona.getEdad();
                    //System.out.println(id +" "+ dni + apellido + nombre + edad);

                    txtId.setText(String.valueOf(id));
                    txtDNI.setText(String.valueOf(dni));
                    txtApellido.setText(apellido);
                    txtNombre.setText(nombre);
                    txtEdad.setText(String.valueOf(edad));

                    btnAgregar.setEnabled(false);
                    btnEditar.setEnabled(false);
                    btnEliminar.setEnabled(false);
                    btnGuardarEdicion.setEnabled(true);

                } catch (SQLException ex) {
                    Logger.getLogger(PersonaFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                mostrarMensaje("No selecciono registro de la tabla", "Error", "Error al editar");
            }

        } else {
            mostrarMensaje("La tabla está vacía", "Error", "Error al editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Verificar si tabla no esta vacia
        if (tabla.getRowCount() > 0) {
            //Validacion de seleccion de fila/registro
            if (tabla.getSelectedRow() != -1) {
                //Obtener id de persona seleccionada ( Casteo de Objeto a String y de String a Entero)
                int idPersona = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));

                try {
                    personaServicio.eliminarPersona(idPersona);
                    mostrarMensaje("Persona eliminada correctamente", "Info", "Eliminación exitosa");
                    cargarTabla();
                } catch (SQLException ex) {
                    Logger.getLogger(PersonaFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                mostrarMensaje("No selecciono registro de la tabla", "Error", "Error al eliminar");
            }

        } else {
            mostrarMensaje("La tabla está vacía", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void btnGuardarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEdicionActionPerformed

        int dni = Integer.parseInt(txtDNI.getText());
        String apellido = txtApellido.getText();
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        int id = Integer.parseInt(txtId.getText());
        try {
            personaServicio.editarPersona(dni, apellido, nombre, edad, id);
            cargarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        mostrarTextoTemporal("¡Persona editada exitosamente!");
        txtDNI.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        mostrarMensaje("Persona editada correctamente", "Info", "Editado exitoso");

        btnAgregar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardarEdicion.setEnabled(false);
    }//GEN-LAST:event_btnGuardarEdicionActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarEdicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollP;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        //La tabla no es editable
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //Colocar titulos a las columnas
        String titulos[] = {"ID", "DNI", "APELLIDO", "NOMBRE", "EDAD"};
        modeloTabla.setColumnIdentifiers(titulos);
        List<Persona> listaPersonas;
        try {
            //Traer datos de base de datos
            listaPersonas = personaServicio.obtenerTodasLasPersonas();
            //Setear datos de la base en la tabla
            if (listaPersonas != null) {
                for (Persona perso : listaPersonas) {
                    Object[] objecto = {perso.getId(), perso.getDni(), perso.getApellido(), perso.getDni(), perso.getEdad()};

                    //Agregamos los datos en la fila
                    modeloTabla.addRow(objecto);
                }
            }
            tabla.setModel(modeloTabla);

        } catch (SQLException ex) {
            Logger.getLogger(PersonaFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
