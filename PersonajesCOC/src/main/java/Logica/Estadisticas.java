package Logica;

/**
 *
 * @author User
 */
public class Estadisticas {
    private int id_estadisticas;
    private String fuerza;
    private String velocidad;
    private String mana;
    private String resitencia;
    //constructor de estadisticas manualmente
    public Estadisticas(String fuerza, String velocidad, String mana, String resitencia) {
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.mana = mana;
        this.resitencia = resitencia;
    }
    //getters y setters

    public int getId_estadisticas() {
        return id_estadisticas;
    }

    public void setId_estadisticas(int id_estadisticas) {
        this.id_estadisticas = id_estadisticas;
    }
    
    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getMana() {
        return mana;
    }

    public void setMana(String mana) {
        this.mana = mana;
    }

    public String getResitencia() {
        return resitencia;
    }

    public void setResitencia(String resitencia) {
        this.resitencia = resitencia;
    }
}
