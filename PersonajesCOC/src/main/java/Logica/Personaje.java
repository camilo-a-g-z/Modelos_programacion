package Logica;

/**
 *
 * @author User
 */
public class Personaje {
    protected String nombre;
    protected int id_personaje;
    protected int id_tipo_p;
    protected String genero;
    protected int edad;
    protected String personalidad;
    protected Arma arma;
    protected Estadisticas est;
    //constructor por defecto
    public Personaje() {
    }
    //constructor para ingresar datos manualmente
    public Personaje(String nombre, String genero, int edad, String personalidad, Arma arma, Estadisticas est) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.personalidad = personalidad;
        this.arma = arma;
        this.est = est;
    }
    //getters  setters

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public int getId_tipo_p() {
        return id_tipo_p;
    }

    public void setId_tipo_p(int id_tipo_p) {
        this.id_tipo_p = id_tipo_p;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Estadisticas getEst() {
        return est;
    }

    public void setEst(Estadisticas est) {
        this.est = est;
    }
}
