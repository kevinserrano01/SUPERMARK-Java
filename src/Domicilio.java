public class Domicilio {
    
    // Atributos
    private String calle;
    private Integer numero;
    private Integer dep_num;
    private int piso;
    private String localidad;


    // Constructor
    public Domicilio(String calle, Integer numero, Integer dep_num, int piso, String localidad){
        this.calle = calle;
        this.numero = numero;
        this.dep_num = dep_num;
        this.piso = piso;
        this.localidad = localidad;
    }

    // getters y setters
    
    public String getCalle() {
        return this.calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getDep_num() {
        return this.dep_num;
    }

    public void setDep_num(Integer dep_num) {
        this.dep_num = dep_num;
    }

    public int getPiso() {
        return this.piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    // Metodos
}
