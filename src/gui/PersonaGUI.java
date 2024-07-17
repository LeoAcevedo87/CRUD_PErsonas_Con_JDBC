package gui;

import modelo.Persona;
import servicio.PersonaServicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

public class PersonaGUI extends JFrame {
    private PersonaServicio personaServicio = new PersonaServicio();

    private JTextField campoId = new JTextField(20);
    private JTextField campoNombre = new JTextField(20);
    private JTextField campoApellido = new JTextField(20);
    private JTextField campoEdad = new JTextField(20);
    private JTextField campoDni = new JTextField(20);
    private JTextArea areaDisplay = new JTextArea(20, 40);

    public PersonaGUI() {
        setTitle("Gestión de Personas");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espacio entre los componentes

        // Fila 1
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelEntrada.add(new JLabel("ID (solo para editar/eliminar):"), gbc);
        
        gbc.gridx = 1;
        panelEntrada.add(campoId, gbc);

        // Fila 2
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelEntrada.add(new JLabel("Nombre:"), gbc);
        
        gbc.gridx = 1;
        panelEntrada.add(campoNombre, gbc);

        // Fila 3
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelEntrada.add(new JLabel("Apellido:"), gbc);
        
        gbc.gridx = 1;
        panelEntrada.add(campoApellido, gbc);

        // Fila 4
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelEntrada.add(new JLabel("Edad:"), gbc);
        
        gbc.gridx = 1;
        panelEntrada.add(campoEdad, gbc);

        // Fila 5
        gbc.gridx = 0;
        gbc.gridy = 4;
        panelEntrada.add(new JLabel("DNI:"), gbc);
        
        gbc.gridx = 1;
        panelEntrada.add(campoDni, gbc);

        // Fila 6
        gbc.gridx = 0;
        gbc.gridy = 5;
        panelEntrada.add(new JButton("Agregar"), gbc);

        gbc.gridx = 1;
        panelEntrada.add(new JButton("Actualizar"), gbc);

        // Fila 7
        gbc.gridx = 0;
        gbc.gridy = 6;
        panelEntrada.add(new JButton("Eliminar"), gbc);

        gbc.gridx = 1;
        panelEntrada.add(new JButton("Ver Todos"), gbc);

        add(panelEntrada, BorderLayout.NORTH);
        add(new JScrollPane(areaDisplay), BorderLayout.CENTER);

        // Añadir funcionalidad a los botones
        ((JButton) panelEntrada.getComponent(10)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarPersona();
            }
        });

//        ((JButton) panelEntrada.getComponent(11)).addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                actualizarPersona();
//            }
//        });

        ((JButton) panelEntrada.getComponent(12)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPersona();
            }
        });

        ((JButton) panelEntrada.getComponent(13)).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verTodasLasPersonas();
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    conexion.ConexionBaseDatos.cerrarConexion();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarPersona() {
        String nombre = campoNombre.getText();
        String apellido = campoApellido.getText();
        int edad = Integer.parseInt(campoEdad.getText());
        int dni = Integer.parseInt(campoDni.getText());
        Persona persona = new Persona(nombre, apellido, edad, dni);
        try {
            personaServicio.agregarPersona(persona);
            areaDisplay.setText("¡Persona agregada exitosamente! ID: " + persona.getId());
        } catch (SQLException ex) {
            ex.printStackTrace();
            areaDisplay.setText("Error al agregar persona.");
        }
    }

//    private void actualizarPersona() {
//        int id = Integer.parseInt(campoId.getText());
//        String nombre = campoNombre.getText();
//        String apellido = campoApellido.getText();
//        int edad = Integer.parseInt(campoEdad.getText());
//        int dni = Integer.parseInt(campoDni.getText());
//        Persona persona = new Persona(nombre, apellido, edad, dni);
//        persona.setId(id);
//        try {
//            personaServicio.actualizarPersona(persona);
//            areaDisplay.setText("¡Persona actualizada exitosamente!");
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            areaDisplay.setText("Error al actualizar persona.");
//        }
//    }

    private void eliminarPersona() {
        int id = Integer.parseInt(campoId.getText());
        try {
            personaServicio.eliminarPersona(id);
            areaDisplay.setText("¡Persona eliminada exitosamente!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            areaDisplay.setText("Error al eliminar persona.");
        }
    }

    private void verTodasLasPersonas() {
        try {
            List<Persona> personas = personaServicio.obtenerTodasLasPersonas();
            areaDisplay.setText("");
            for (Persona persona : personas) {
                areaDisplay.append(persona.toString() + "\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            areaDisplay.setText("Error al recuperar lista de personas.");
        }
    }

//    public static void main(String[] args) {
//        new PersonaGUI();
//    }
}

