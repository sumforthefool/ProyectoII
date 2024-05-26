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

        String sql = "SELECT * FROM Persona WHERE id = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    // Se encontró una persona con el ID proporcionado
                    return new Persona(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("edad")
                    );
                } else {
                    // No se encontró ninguna persona con ese ID
                    return null;
                }
            }
        }
    }

    public List<Persona> obtenerTodasLasPersonas() throws SQLException {

        String sql = "SELECT * FROM Persona";
        List<Persona> personas = new ArrayList<>();

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                personas.add(new Persona(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("edad")
                ));
            }
        }

        return personas;
    }


    public void actualizarPersona(Persona persona) throws SQLException {
        String sql = "UPDATE Persona SET nombre = ?, apellido = ?, edad = ? WHERE id = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setInt(3, persona.getEdad());
            stmt.setInt(4, persona.getId());

            stmt.executeUpdate();
        }
    }

    public void eliminarPersona(int id) throws SQLException {

        String sql = "DELETE FROM Persona WHERE id = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            stmt.executeUpdate();
        }
    }

    private void crearTablaSiNoExiste() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Persona (" +
                "  id INT AUTO_INCREMENT PRIMARY KEY," +
                "  nombre VARCHAR2(255) NOT NULL," +
                "  apellido VARCHAR2(255) NOT NULL," +
                "  edad INT" +
                ")";

        try (Connection conn = ConexionBD.obtenerConexion();
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }

    public PersonaDAO() throws SQLException {
        crearTablaSiNoExiste();
    }

}

