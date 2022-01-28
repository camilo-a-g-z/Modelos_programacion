package Logica;

/**
 *
 * @author User
 */
public class Gigante extends Personaje{
    //se genera gigante con datos aelatorios
    public Gigante(String nombre) {
        super(nombre, "Masculino", "Noble", null, null, null);
        this.arma = randomArma();
        this.est = randomEstadisticas();
        setId_tipo_p(4);
        this.caracteristica = "Enormes, piel clara y poco cabello, son muy amigables pero intimidan por su gran tamaño, sin embargo"
                                + " tienen un gran sentido de la justicia, viven en zonas muy verdes y les gusta la naturaleza.";
    }
    //se genera arma aelatoria
    public Arma randomArma(){
        Arma arma = new Arma();
        switch ((int)(Math. random()*2+1)){
            case 1:
                arma = new Arma("Puño");
                break;
            case 2:
                arma = new Arma("Mazo");
                break;
        }
        return arma;
    }
    //se generan estadisticas aelatoriamente
    public Estadisticas randomEstadisticas(){
        Estadisticas est;
        est = new Estadisticas(String.valueOf((int)(Math. random()*100+1)),
                String.valueOf((int)(Math. random()*10+1)),String.valueOf((int)(Math. random()*50+1))
                ,String.valueOf((int)(Math. random()*100+1)));
        return est;
    }
}
