import java.sql.Date;

public class Producto {
    
    // Atributos
    private Integer id;
    private String nombre;
    private String marca;
    private Date f_venc;
    private double precio;
    private Integer stock;
    private static final int maximo=30; //consultar

    // Constructor
    public Producto(String nombre, String marca, Date f_venc, double precio, Integer stock){
        this.nombre = nombre;
        this.marca = marca;
        this.f_venc = f_venc;
        this.precio = precio;
        this.stock = stock;
    }

    // getters y setters
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getF_venc() {
        return this.f_venc;
    }

    public void setF_venc(Date f_venc) {
        this.f_venc = f_venc;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    // Metodos
}
