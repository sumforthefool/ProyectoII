package com.miproyecto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

    private static final String INSERT_PERSONA = "INSERT INTO Persona (nombre, apellido, edad) VALUES (?, ?, ?)";
    private static final String SELECT_PERSONA_BY_ID = "SELECT * FROM Persona WHERE id = ?";
    private static final String SELECT_ALL_PERSONAS = "SELECT * FROM Persona";
    private static final String UPDATE_PERSONA = "UPDATE Persona SET nombre = ?, apellido = ?, edad = ? WHERE id = ?";
    private static final String DELETE_PERSONA = "DELETE FROM Persona WHERE id = ?";

    public void insertarPersona(Persona persona) throws SQLException {
        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(INSERT_PERSONA)) {

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setInt(3, persona.getEdad());

            stmt.executeUpdate();
        }
    }

    public Persona obtenerPersonaPorId(int id) throws SQLException {

        return null;
    }

    public List<Persona> obtenerTodasLasPersonas() throws SQLException {

        return null;
    }

    public void actualizarPersona(Persona persona) throws SQLException {

    }

    public void eliminarPersona(int id) throws SQLException {

    }

}

