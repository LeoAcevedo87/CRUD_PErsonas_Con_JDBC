// dao/PersonaDAO.java
package dao;

import conexion.ConexionBaseDatos;
import modelo.Persona;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    public void agregarPersona(Persona persona) throws SQLException {
        String consulta = "INSERT INTO personas (nombre, apellido, edad, dni) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionBaseDatos.obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, persona.getNombre());
            pstmt.setString(2, persona.getApellido());
            pstmt.setInt(3, persona.getEdad());
            pstmt.setInt(4, persona.getDni());
            pstmt.executeUpdate();

            // Obtener el ID generado automáticamente
            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    persona.setId(generatedKeys.getInt(1));
                }
            }
        }
    }

    public void editarPersona(int dni, String apellido, String nombre, int edad, int id) throws SQLException {

        try {
            PreparedStatement preparedStatement = null;
            // Establecer la conexión con la base de datos
            Connection conn = ConexionBaseDatos.obtenerConexion();

            // SQL para actualizar los datos de una persona
            String sql = "UPDATE personas SET dni = ?, apellido = ?, nombre = ?, edad = ? WHERE id = ?";

            // Crear el PreparedStatement
            preparedStatement = conn.prepareStatement(sql);

            // Establecer los valores de los parámetros
            preparedStatement.setInt(1, dni);
            preparedStatement.setString(2, apellido);
            preparedStatement.setString(3, nombre);
            preparedStatement.setInt(4, edad);
            preparedStatement.setInt(5, id);

            // Ejecutar la actualización
            int filasActualizadas = preparedStatement.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("La persona fue actualizada exitosamente.");
            } else {
                System.out.println("No se encontró la persona con el ID especificado.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
//        } finally {
//            // Cerrar los recursos
//            try {
//                if (preparedStatement != null) {
//                    preparedStatement.close();
//                }
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
        }
//        String consulta = "UPDATE personas SET nombre = ?, apellido = ?, edad = ?, dni = ? WHERE id = ?";
//        try (Connection conn = ConexionBaseDatos.obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(consulta)) {
//            pstmt.setString(1, persona.getNombre());
//            pstmt.setString(2, persona.getApellido());
//            pstmt.setInt(3, persona.getEdad());
//            pstmt.setInt(4, persona.getDni());
//            pstmt.setInt(5, persona.getId());
//            pstmt.executeUpdate();
//        }
    }

    public void eliminarPersona(int id) throws SQLException {
        String consulta = "DELETE FROM personas WHERE id = ?";
        try (Connection conn = ConexionBaseDatos.obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(consulta)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        }
    }

    //***************
    public Persona obtenerPersona(int id) throws SQLException {
        Persona persona = null;
        String consulta = "SELECT * FROM personas WHERE id = ?";
        try (Connection conn = ConexionBaseDatos.obtenerConexion(); PreparedStatement pstmt = conn.prepareStatement(consulta)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    persona = new Persona();
                    persona.setId(rs.getInt("id"));
                    persona.setNombre(rs.getString("nombre"));
                    persona.setApellido(rs.getString("apellido"));
                    persona.setEdad(rs.getInt("edad"));
                    persona.setDni(rs.getInt("dni"));
                }
            }
        }
        return persona;
    }

    //***************
    public List<Persona> obtenerTodasLasPersonas() throws SQLException {
        List<Persona> personas = new ArrayList<>();
        String consulta = "SELECT * FROM personas";
        try (Connection conn = ConexionBaseDatos.obtenerConexion(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(consulta)) {
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId(rs.getInt("id"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setEdad(rs.getInt("edad"));
                persona.setDni(rs.getInt("dni"));
                personas.add(persona);
            }
        }

        return personas;
    }
}
