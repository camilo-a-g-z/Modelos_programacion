package Logica;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class FabricaPersonajes {

    private ArrayList<String> nombres = new ArrayList<String>();
    private ArrayList<Personaje> personajes = new ArrayList<Personaje>();
    private String type;
    //constructor
    public FabricaPersonajes(String type, ArrayList<String> nombres) {
        this.type = type;
        this.nombres = nombres;
    }
    //metodo para generar y devolver los personajes creados
    public ArrayList<Personaje> getPersonajes(){
        iniciarPersonajes();
        return personajes;
    }
    //metodo para generar los personajes acorde a los nobres y tipo recibidos
    private void iniciarPersonajes() {
        switch (type) {
            case "Barbaro":
                for (int i = 0; i < nombres.size(); i++) {
                    personajes.add(new Barbaro(nombres.get(i)));
                }
                break;
            case "Arquera":
                for (int i = 0; i < nombres.size(); i++) {
                    personajes.add(new Arquera(nombres.get(i)));
                }
                break;
            case "Duende":
                for (int i = 0; i < nombres.size(); i++) {
                    personajes.add(new Duende(nombres.get(i)));
                }
                break;
            case "Gigante":
                for (int i = 0; i < nombres.size(); i++) {
                    personajes.add(new Gigante(nombres.get(i)));
                }
                break;
            case "Mago":
                for (int i = 0; i < nombres.size(); i++) {
                    personajes.add(new Mago(nombres.get(i)));
                }
                break;
        }
    }
}
