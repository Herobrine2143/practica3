package app.persona.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
//pagina 367

public class Test {
	public static void main(String[] args) {
		try {

			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "Banco", "");
			System.out.print("Version: " + conexion.getMetaData().getDatabaseProductVersion());
			// System.out.println("Driver: " + conexion.getMetaData().getDriverName());
			System.out.print(" ");
			Statement instruccion = conexion.createStatement();
			System.out.println("Instrucciones: " + instruccion);

//			String query = "INSERT INTO gestor (usuario, password, correo) VALUES ('gestor1','gestor1', 'gestor1@correo.com')";
//			String query = "INSERT INTO gestor (usuario, password, correo) VALUES (?,?,?)";
			String query = "SELECT * from gestor WHERE id IN (?,?)";
			PreparedStatement ps = conexion.prepareStatement(query);
//			
//			ps.setString(1,"gestor10");
			ps.setInt(1,1);
//			ps.setString(2,"gestor10");
			ps.setInt(2,142);
//			ps.setString(3, "gestor10@correo.com");
			
			
			//boolean resultado = instruccion.execute(query);
			
//			if (ps.executeUpdate() != 1) {
//				throw new Exception("Error en la Inserccion");
//			}
			
			System.out.println("\nPrograma finalizado");
			//System.out.println("\nRegistros insertados: "+instruccion.getUpdateCount());}

//			String query = "SELECT * FROM gestor";

		//	ResultSet resultados1 = instruccion.executeQuery(query));
			ResultSet resultados = ps.executeQuery();
			
			System.out.println("\nLista de gestores: ");
			
			while (resultados.next()) {
				System.out.println("Gestor " + resultados.getInt("id"));
				System.out.println("Usuario: " + resultados.getString("usuario"));
				System.out.println("Password: " + resultados.getString("password"));
				System.out.println("Correo: " + resultados.getString("correo"));
				System.out.println("...");
				}

//			while (resultados1.next()) {
//				System.out.println("Gestor " + resultados1.getInt("id"));
//				System.out.println("Usuario: " + resultados1.getString("usuario"));
//				System.out.println("Password: " + resultados1.getString("password"));
//				System.out.println("Correo: " + resultados1.getString("correo"));
//				System.out.println("...");
//			}

			//int registrosInsertados = instruccion.executeUpdate(query);
			
			//System.out.println("Registros insertados: " + registrosInsertados);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}