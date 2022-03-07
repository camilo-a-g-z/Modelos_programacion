package StatePresentacion;

/**
 *
 * @author Camilo Garcia
 */
public class MainMTT {
    public static void main(String[] args) {
        MyTalkingTom MTT = new MyTalkingTom();

        Menu menu = new Menu(MTT);
        menu.pantalla();
        
    }
    
}
