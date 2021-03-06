package supermark;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Usuario {
	//atributos
	private int id;
	private String nombre;
	private String apellido;
	private String email;
	private int dni;
	private String contrasenia;
	private boolean isAdmin;
	private Domicilio Domicilio;

	//Constructor por defecto
	public Usuario() {
		
	}
	
	//Constructor Normal
	public Usuario(int id, String nombre, String apellido, String email, int dni, String contrasenia,supermark.Domicilio domicilio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.dni = dni;
		this.contrasenia = contrasenia;
		this.isAdmin = false;
		Domicilio = domicilio;
	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Domicilio getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		Domicilio = domicilio;
	}
	
	
//	@Override
//	public String toString() {
//		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellido=" + apellido
//				+ ", esAdministrador=" + esAdministrador + ", email=" + email + ", fecha_nacimiento=" + fecha_nacimiento
//				+ ", dni=" + dni + "]";	
//		}

}