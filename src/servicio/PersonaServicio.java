
// servicio/PersonaServicio.java
package servicio;

import dao.PersonaDAO;
import modelo.Persona;

import java.sql.SQLException;
import java.util.List;

public class PersonaServicio {
    private PersonaDAO personaDAO = new PersonaDAO();

    public void agregarPersona(Persona persona) throws SQLException {
        personaDAO.agregarPersona(persona);
    }

    public void editarPersona(int dni, String apellido, String nombre, int edad, int id) throws SQLException {
        personaDAO.editarPersona(dni, apellido, nombre, edad, id);
    }

    public void eliminarPersona(int id) throws SQLException {
        personaDAO.eliminarPersona(id);
    }

    public List<Persona> obtenerTodasLasPersonas() throws SQLException {
        return personaDAO.obtenerTodasLasPersonas();
    }
    
    public Persona obtenerPersona(int id) throws SQLException {
        return personaDAO.obtenerPersona(id);
    }
}

