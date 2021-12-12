package Logica;

/**
 *
 * @author User
 */
public class Duende extends Personaje{
    //se crea duende con datos aelatorios
    public Duende(String nombre, int edad) {
        super(nombre, "", edad, "Impulsivo", null, null);
        this.arma = randomArma();
        this.est = randomEstadisticas();
        this.genero = randomGenero();
        setId_tipo_p(3);
    }
    //se generan datos aelatorios
    String randomGenero(){
        switch((int)(Math. random()*2+1)){
            case 1:
                return "Masculino";
            case 2:
                return "Femenino";
        }
        return null;
    }
    //se genera arma aelatoria
    Arma randomArma(){
        Arma arma = new Arma();
        switch ((int)(Math. random()*3+1)){
            case 1:
                arma = new Arma("Cuchillo");
                break;
            case 2:
                arma = new Arma("Martillo");
                break;
            case 3:
                arma = new Arma("Hacha");
                break;
        }
        return arma;
    }
    //se generan estadististicas aelatorias
    Estadisticas randomEstadisticas(){
        Estadisticas est;
        est = new Estadisticas(String.valueOf((int)(Math. random()*40+1)),
                String.valueOf((int)(Math. random()*100+1)),String.valueOf((int)(Math. random()*70+1))
                ,String.valueOf((int)(Math. random()*30+1)));
        return est;
    }
}
