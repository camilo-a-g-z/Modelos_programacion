package StatePresentacion;

import java.util.Scanner;

/**
 *
 * @author Camilo Garcia
 */
public class Menu {
    MyTalkingTom MTT;

    public Menu(MyTalkingTom MTT) {
        this.MTT = MTT;
    }
    
    public void pantalla (){
        Scanner scaner = new Scanner(System.in);
        char opcion;
        String mensajeOpciones = "Realizar Accion a)Alimentar b)Dormir c)Jugar d)Preguntar e)Salir";
        while(true){
            System.out.println(mensajeOpciones);
            opcion = scaner.next().charAt(0);
            switch(opcion){
                case 'a':
                    MTT.alimentar();
                    break;
                case 'b':
                    MTT.dormir();
                    break;
                case 'c':
                    MTT.jugar();
                    break;
                case 'd':
                    MTT.queTal();
                    break;
                case 'e':
                    System.out.println("Hasta la proxima");
                    System.exit(0);
                    break;
                default: System.out.println("Opcion no válida");
            }
        }
    }
}
