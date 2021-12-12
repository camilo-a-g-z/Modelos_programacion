package Logica;

/**
 *
 * @author User
 */
public class Mago extends Personaje {
    //constructor de mago con datos aelatorios
    public Mago(String nombre, int edad) {
        super(nombre, "", edad, "Egocenrtico", null, null);
        this.arma = new Arma("Baculo");
        this.est = randomEstadisticas();
        this.genero = randomGenero();
        setId_tipo_p(5);
    }
    //generar genero aelatorio
    String randomGenero(){
        switch((int)(Math. random()*2+1)){
            case 1:
                return "Masculino";
            case 2:
                return "Femenino";
        }
        return null;
    }
    //generador de estadisticas aelatorios
    Estadisticas randomEstadisticas(){
        Estadisticas est;
        est = new Estadisticas(String.valueOf((int)(Math. random()*100+1)),
                String.valueOf((int)(Math. random()*100+1)),String.valueOf((int)(Math. random()*100+1))
                ,String.valueOf((int)(Math. random()*50+1)));
        return est;
    }    
}
