package Logica;

/**
 *
 * @author User
 */
public class Barbaro extends Personaje{
    //se crea bararo aelatoriamente
    public Barbaro(String nombre) {
        super(nombre, "Masculino", "Agresiva", null, null);
        this.arma = randomArma();
        this.est = randomEstadisticas();
        setId_tipo_p(2);
    }
    //se crea arma aelatoriamente
    public Arma randomArma(){
        Arma arma = new Arma();
        switch ((int)(Math. random()*3+1)){
            case 1:
                //espada
                arma = new Arma("Espada");
                break;
            case 2:
                //martillo
                arma = new Arma("Martillo");
                break;
            case 3:
                //hacha
                arma = new Arma("Hacha");
                break;
        }
        return arma;
    }
    //se crean estadisticas aelatoriamente
    public Estadisticas randomEstadisticas(){
        Estadisticas est;
        est = new Estadisticas(String.valueOf((int)(Math. random()*100+1)),
                String.valueOf((int)(Math. random()*100+1)),"0",String.valueOf((int)(Math. random()*50+1)));
        return est;
    }
}
