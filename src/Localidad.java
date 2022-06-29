public class Localidad {
    // atributos
    public int id;
    private String provincia;
    private String departamento;
    private String ciudad;

// SETTERS Y GETTERS

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

// CONSTRUCTORES

    public Localidad(int id, String provincia, String departamento, String ciudad){
        this.id = id;
        this.provincia = provincia;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

//METODOS

    public String toString(){
        return (this.provincia+","+this.ciudad+","+this.departamento);
    }

}