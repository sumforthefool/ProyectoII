package com.miproyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

public class ConexionBD {

    private static final String URL;
    private static final String USUARIO;
    private static final String CONTRASENA;

    static {
        Dotenv dotenv = Dotenv.load();
        URL = dotenv.get("DATABASE_URL");
        USUARIO = dotenv.get("DATABASE_USER");
        CONTRASENA = dotenv.get("DATABASE_PASSWORD");
    }

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}
