import java.sql.Date;
public class Remito {
    private int id_fac;
    private char doc_serie;
    private String doc_nro;
    private Date Fecha_hora;
    private String concepto;

//seters y getters

    public int getId_fac() {
        return this.id_fac;
    }

    public void setId_fac(int id_fac) {
        this.id_fac = id_fac;
    }

    public char getDoc_serie() {
        return this.doc_serie;
    }

    public void setDoc_serie(char doc_serie) {
        this.doc_serie = doc_serie;
    }

    public String getDoc_nro() {
        return this.doc_nro;
    }

    public void setDoc_nro(String doc_nro) {
        this.doc_nro = doc_nro;
    }

    public Date getFecha_hora() {
        return this.Fecha_hora;
    }

    public void setFecha_hora(Date Fecha_hora) {
        this.Fecha_hora = Fecha_hora;
    }

    public String getConcepto() {
        return this.concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

// constructor
    public Remito(int id_fac, char doc_serie, String doc_nro, Date Fecha_hora, int Hora, int Minutos, int Segundos, String concepto) {
        this.id_fac = id_fac;
        this.doc_serie = doc_serie;
        this.doc_nro = doc_nro;
        this.Fecha_hora = Fecha_hora;
        this.concepto = concepto;
    }


//Metodos

    public void getRemito() {
        System.out.println("id_fac: " + this.id_fac);
        System.out.println("doc_serie: " + this.doc_serie);
        System.out.println("doc_nro: " + this.doc_nro);
        System.out.println("Fecha_hora: " + this.Fecha_hora);
        System.out.println("concepto: " + this.concepto);
    }

}
