package supermark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

public class Localidad {
	//atributos
	private int id;
	private String provincia;
	private String departamento;
	private String ciudad;
	
	//Constructor por defecto
	public Localidad() {
		
	}
	
	//Constructor Normal
	public Localidad(int id, String provincia, String departamento, String ciudad) {
		super();
		this.id = id;
		this.provincia = provincia;
		this.departamento = departamento;
		this.ciudad = ciudad;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}