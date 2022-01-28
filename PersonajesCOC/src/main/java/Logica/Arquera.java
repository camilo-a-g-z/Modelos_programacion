package Logica;

/**
 *
 * @author User
 */
public class Arquera extends Personaje{
    //Constructor de arquera con datos aelatorios
    public Arquera(String nombre) {
        super(nombre, "Femenino", "Audaz", null, null, null);
        this.arma = randomArma();
        this.est = randomEstadisticas();
        setId_tipo_p(1);
        this.caracteristica = "Altas, esbeltas y de piel clara, son amables y de buen humor, les gusta ayudar a las personas"
                                + " y viven en casas de techos altos con una linda chimenea.";
    }
    //generador de armas aelatorias
    public Arma randomArma(){
        Arma arma = new Arma();
        switch ((int)(Math. random()*3+1)){
            case 1:
                arma = new Arma("Arco");
                break;
            case 2:
                arma = new Arma("Ballesta");
                break;
            case 3:
                arma = new Arma("Lanza");
                break;
        }
        return arma;
    }
    //generador de estadisticas aelatorios
    public Estadisticas randomEstadisticas(){
        Estadisticas est;
        est = new Estadisticas(String.valueOf((int)(Math. random()*50+1)),
                String.valueOf((int)(Math. random()*100+1)),"0",String.valueOf((int)(Math. random()*50+1)));
        return est;
    }
}
