package Logica;

/**
 *
 * @author User
 */
public class Arma {
    //atributos de arma
    private int id_arma;
    private String danio;
    private String resistencia;
    private String nombre;

    public Arma() {
    }
    //constructor para agregar todos los datos manualmente
    public Arma(String danio, String resistencia, String nombre) {
        this.danio = danio;
        this.resistencia = resistencia;
        this.nombre = nombre;
    }
    //constructor con datos aelatorios
    public Arma(String nombre) {
        this.danio = String.valueOf((int)(Math. random()*100+1));
        this.resistencia = String.valueOf((int)(Math. random()*100+1));
        this.nombre = nombre;
    }
    //getters y setters
    public int getId_arma() {
        return id_arma;
    }

    public void setId_arma(int id_arma) {
        this.id_arma = id_arma;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDanio() {
        return danio;
    }

    public void setDanio(String danio) {
        this.danio = danio;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }
}
