package app.persona.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test2 {
	public static void main(String[] args) {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "Banco", "");

			conexion.setAutoCommit(false);

			PreparedStatement ps1 = conexion
					.prepareStatement("INSERT INTO gestor(usuario, password, correo) VALUES (?,?,?) ");
			ps1.setString(1, "gestor10");
			ps1.setString(2, "gestor10");
			ps1.setString(3, "gestor10@correo.com");

			PreparedStatement ps2 = conexion
					.prepareStatement("INSERT INTO gestor(usuario, password, correo) VALUES (?,?,?) ");
			ps2.setString(1, "gestor11");
			ps2.setString(2, "gestor11");
			ps2.setString(3, "gestor11@correo.com");

			PreparedStatement ps3 = conexion
					.prepareStatement("INSERT INTO gestor(usuario, password, correo) VALUES (?,?,?) ");
			ps3.setString(2, "gestor12");
			ps3.setString(3, "gestor12");
			ps3.setString(4, "gestor12@correo.com");

			PreparedStatement ps4 = conexion
					.prepareStatement("INSERT INTO gestor(id, usuario, password, correo) VALUES (?,?,?,?) ");
			ps4.setInt(1, 4);
			ps4.setString(2, "gestor12");
			ps4.setString(3, "gestor12");
			ps4.setString(4, "gestor12@correo.com");

			ps1.execute();
			ps2.execute();
			ps3.execute();

			conexion.commit();

			System.out.println("Programa Finalizado");

		} catch (SQLException e) {
			if (conexion != null) {
				try {
					conexion.rollback();

					System.out.println("Rollback realizado.");

				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
			e.printStackTrace();
		}
	}
}
