package supermark;

public class Credenciales {
	
	//Atributos
	 public String JDBC_DRIVER; 
	 public String DB_URL;
	// Credenciales de la BDD
	 public String USER;
	 public String PASS;
	 public String path_log4_properties;
	 
	 public Credenciales(){
		 this.JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		 this.DB_URL = "jdbc:mysql://localhost:3306/supermark_v1";
		 this.USER = "root";
		 this.PASS = "";
		 this.path_log4_properties = "C:/Users/Matias/Desktop/Lenguajes/Java 1000 programadores salte�os/PROYECTO FINAL";
	 }
	 
}
