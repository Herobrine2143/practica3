package app.persona.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private Connection conexion;
	private static final String HOST = "locahost";
	private static final String PORT = "3306";
	private static final String NAME = "banco";
	private static final String USER = "Banco";
	private static final String PASSWORD = "";

	public DatabaseConnection() {
		try {
			conexion = DriverManager
					.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + NAME + "," + USER + "," + PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return conexion;
	}
}
