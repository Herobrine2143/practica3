package app.persona.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import app.persona.Cliente;
import app.persona.Gestor;
import app.persona.Mensaje;
import app.persona.Transferencia;

public class Database {

	private Connection conexion;

	public Database() {

		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "Banco", "");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean insertarGestor(Gestor gestor) {

		Statement instruccion = null;

		try {

			// instruccion = conexion.createStatement();

			PreparedStatement ps = conexion
					.prepareStatement("INSERT INTO gestor(usuario, password, correo) VALUES (?,?,?)");

			ps.setString(1, gestor.getUsuario());

			ps.setString(2, gestor.getPassword());

			ps.setString(3, gestor.getCorreo());

			ps.executeUpdate();

			// instruccion.close();

			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public ArrayList<Gestor> getGestores() {

		Statement instruccion = null;

		ArrayList<Gestor> gestores = new ArrayList<Gestor>();

		try {

			instruccion = conexion.createStatement();

			ResultSet resultados = instruccion.executeQuery("SELECT * FROM gestor WHERE 1");

			while (resultados.next()) {

				int id = resultados.getInt("id");
				String usuario = resultados.getString("usuario");
				String password = resultados.getString("password");
				String correo = resultados.getString("correo");

				System.out.println("ID Gestor: " + id);
				System.out.println("Usuario: " + usuario);
				System.out.println("Contraseña: " + password);
				System.out.println("Correo: " + correo);
				System.out.println("\n...\n");

				Gestor gestor = new Gestor(id, usuario, password, correo);
				// Gestor gestor = new Gestor(usuario, correo);
				gestores.add(gestor);
			}

			instruccion.close();

			return gestores;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public String mostrarGestores() {

		Statement instruccion = null;
		try {
			instruccion = conexion.createStatement(); 
			ResultSet resultados = instruccion.executeQuery("SELECT * FROM gestor WHERE 1");

			while (resultados.next()) {
				System.out.println("ID Gestor: " + resultados.getInt("id"));
				System.out.println("Usuario: " + resultados.getString("usuario"));
				System.out.println("Password: " + resultados.getString("password"));
				System.out.println("Correo: " + resultados.getString("correo"));
				System.out.println("\n...\n");
			}
			instruccion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public Gestor getGestor(int id) {

		PreparedStatement instruccion = null;
		Gestor gestor = null;
		try {
			String query = "SELECT * FROM gestor WHERE id = ?";
			instruccion = conexion.prepareStatement(query);
			instruccion.setInt(1, id);

			ResultSet resultados = instruccion.executeQuery();

			if (resultados.next()) {
				gestor = new Gestor();
				gestor.setId(resultados.getInt("id"));
				gestor.setUsuario(resultados.getString("usuario"));
				gestor.setPassword(resultados.getString("password"));
				gestor.setCorreo(resultados.getString("correo"));
			}

			System.out.println(resultados.getMetaData().getColumnCount());

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return gestor;
	}

	public boolean borrarGestor(int id) {

		PreparedStatement instruccion = null;
		try {
			String query = "DELETE FROM gestor WHERE id = ?";
			instruccion = conexion.prepareStatement(query);
			instruccion.setInt(1, id);
			int filasEliminadas = instruccion.executeUpdate();

			return filasEliminadas != 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean actualizarGestores(Gestor gestor) {

		PreparedStatement instruccion = null;
		try {
			String query = "UPDATE gestor SET usuario = ?, password = ?, correo = ? WHERE id = ?";
			instruccion = conexion.prepareStatement(query);
			instruccion.setString(1, gestor.getUsuario());
			instruccion.setString(2, gestor.getPassword());
			instruccion.setString(3, gestor.getCorreo());
			instruccion.setInt(4, gestor.getId());

			// executeUpdate actualiza
			int filaActualizada = instruccion.executeUpdate();
			return filaActualizada != 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean insertarCliente(Cliente cliente) {

		Statement instruccion = null;

		try {

			// instruccion = conexion.createStatement();

			PreparedStatement ps = conexion.prepareStatement(
					"INSERT INTO cliente(id_gestor, usuario, password, correo, saldo) VALUES (?,?,?,?,?)");

			ps.setInt(1, cliente.getIdGestor());

			ps.setString(2, cliente.getUsuario());

			ps.setString(3, cliente.getPassword());

			ps.setString(4, cliente.getCorreo());

			ps.setFloat(5, cliente.getSaldo());

			ps.executeUpdate();

			// instruccion.close();

			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public ArrayList<Cliente> getClientes() {

		Statement instruccion = null;

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		try {

			instruccion = conexion.createStatement();

			ResultSet resultados = instruccion.executeQuery("SELECT * FROM cliente WHERE 1");

			while (resultados.next()) {

				int id = resultados.getInt("id");
				String usuario = resultados.getString("usuario");
				String password = resultados.getString("password");
				String correo = resultados.getString("correo");
				int idGestor = resultados.getInt("id_gestor");
				float saldo = resultados.getFloat("saldo");

				System.out.println("ID Cliente: " + id);
				System.out.println("ID de su Gestor: " + idGestor);
				System.out.println("Usuario: " + usuario);
				System.out.println("Contraseña: " + password);
				System.out.println("Correo: " + correo);
				System.out.println("Saldo: " + saldo + " €");
				System.out.println("\n-----------\n");

				Cliente cliente = new Cliente(id, usuario, password, correo, idGestor, saldo);
				// Gestor gestor = new Gestor(usuario, correo);
				clientes.add(cliente);
			}

			instruccion.close();

			return clientes;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public String mostrarClientes() {

		Statement instruccion = null;
		try {
			instruccion = conexion.createStatement(); 
			ResultSet resultados = instruccion.executeQuery("SELECT * FROM cliente WHERE 1");

			while (resultados.next()) {
				System.out.println("ID Cliente: " + resultados.getInt("id"));
				System.out.println("ID de su Gestor: " + resultados.getInt("id_gestor"));
				System.out.println("Usuario: " + resultados.getString("usuario"));
				System.out.println("Password: " + resultados.getString("password"));
				System.out.println("Correo: " + resultados.getString("correo"));
				System.out.println("Saldo: " + resultados.getFloat("saldo") + " €");
				System.out.println("\n...\n");
			}
			instruccion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	public boolean saldoCliente(float saldo, int id) {
		
		Statement instruccion = null;
		try {
			PreparedStatement ps = conexion.prepareStatement("UPDATE cliente SET saldo = ? WHERE cliente.id = ?");
			ps.setFloat(1, saldo);
			ps.setInt(2, id);
			
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean actualizarClientes(Cliente cliente) {

		PreparedStatement instruccion = null;
		try {
			String query = "UPDATE cliente SET usuario = ?, password = ?, correo = ? WHERE id = ?";
			instruccion = conexion.prepareStatement(query);
			instruccion.setString(1, cliente.getUsuario());
			instruccion.setString(2, cliente.getPassword());
			instruccion.setString(3, cliente.getCorreo());
			instruccion.setInt(4, cliente.getId());

			// executeUpdate actualiza
			int filaActualizada = instruccion.executeUpdate();
			return filaActualizada != 0;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public boolean borrarCliente(int id) {

		PreparedStatement instruccion = null;
		
		try {
			String query = "DELETE FROM cliente WHERE id = ?";
			instruccion = conexion.prepareStatement(query);
			instruccion.setInt(1, id);
			int filasEliminadas = instruccion.executeUpdate();

			return filasEliminadas != 0;
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	public boolean enviarMensaje(Mensaje mensaje) {
		
		PreparedStatement instruccion = null;
		
		try {
		PreparedStatement ps = conexion.prepareStatement("INSERT INTO mensaje (id_origen, id_destino, texto, fecha) VALUES (?,?,?,?)");
		ps.setInt(1, mensaje.getIdOrigen());
		ps.setInt(2, mensaje.getIdDestino());
		ps.setString(3, mensaje.getTexto());
		ps.setTimestamp(4, mensaje.getFecha());
		
		ps.executeUpdate();
				
		return true;
		
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
					
				} catch (SQLException e) {
					e.printStackTrace();
					
				}
			}
		}
		return false;
	}
	
	public String mostrarMensajes() {
		
		Statement instruccion = null;
		try {
			instruccion = conexion.createStatement(); 
			ResultSet resultados = instruccion.executeQuery("SELECT * FROM mensaje WHERE 1");

			while (resultados.next()) {
				System.out.println("ID del Mensaje: " + resultados.getInt("id"));
				System.out.println("ID de origen: " + resultados.getString("id_origen"));
				System.out.println("ID de destino: " + resultados.getString("id_destino"));
				System.out.println("Fecha: " + resultados.getTimestamp("fecha"));
				System.out.println("Mensaje:\n\n> " + resultados.getString("texto"));
				System.out.println("\n...\n");
			}
			instruccion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	
	public boolean enviarTransferencia(Transferencia transferencia) {
		
		Statement instruccion = null;

		try {

			// instruccion = conexion.createStatement();

			PreparedStatement ps = conexion.prepareStatement(
					"INSERT INTO transferencia(id_ordenante, id_beneficiario, importe, concepto, fecha) VALUES (?,?,?,?,?)");

			ps.setInt(1, transferencia.getIdOrdenante());

			ps.setInt(2, transferencia.getIdBeneficiario());

			ps.setDouble(3, transferencia.getImporte());

			ps.setString(4, transferencia.getConcepto());

			ps.setTimestamp(5, transferencia.getFecha());

			ps.executeUpdate();
			
			//coje el numero de la transferencia de la base de datos, restala con el saldo del cliente.
			//El total sera la cantidad restante de saldo del cliente.
			//Para el beneficiario solo sumalo.

			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	public String mostrarTransferencias() {
		
		Statement instruccion = null;
		try {
			instruccion = conexion.createStatement(); 
			ResultSet resultados = instruccion.executeQuery("SELECT * FROM transferencia WHERE 1");

			while (resultados.next()) {
				System.out.println("ID: " + resultados.getInt("id"));
				System.out.println("ID del Ordenante: " + resultados.getString("id_ordenante"));
				System.out.println("ID del Destinatario: " + resultados.getString("id_beneficiario"));
				System.out.println("Importe: " + resultados.getDouble("importe") + " €");
				System.out.println("Concepto > " + resultados.getString("concepto"));
				System.out.println("Fecha: " + resultados.getTimestamp("fecha"));
				System.out.println("\n...\n");
			}
			instruccion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (instruccion != null) {
				try {
					instruccion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
