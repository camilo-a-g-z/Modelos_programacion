package Logica;

/**
 *
 * @author User
 */
public class Mago extends Personaje {
    //constructor de mago con datos aelatorios
    public Mago(String nombre) {
        super(nombre, "", "Egocenrtico", null, null, null);
        this.arma = randomArma();
        this.est = randomEstadisticas();
        this.genero = randomGenero();
        setId_tipo_p(5);
        this.caracteristica = "Arrogantes y antipaticos, no les gusta hacer amigos y de mal caracter, siempre miran por encima del hombro"
                                + " y dicen que su poder es el mejor, viven en casas lujosas y con techos muy altos.";
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
    public Estadisticas randomEstadisticas(){
        Estadisticas est;
        est = new Estadisticas(String.valueOf((int)(Math. random()*100+1)),
                String.valueOf((int)(Math. random()*100+1)),String.valueOf((int)(Math. random()*100+1))
                ,String.valueOf((int)(Math. random()*50+1)));
        return est;
    }    

    @Override
    public Arma randomArma() {
        return new Arma("Baculo");
    }
}
