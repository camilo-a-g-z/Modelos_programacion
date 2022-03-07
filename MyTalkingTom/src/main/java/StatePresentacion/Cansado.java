package StatePresentacion;

/**
 *
 * @author Camilo Garcia
 */
public class Cansado implements State {
    MyTalkingTom MTT;
    public Cansado() {
    }

    @Override
    public void jugar() {
        System.out.println("No quiero jugar esoy cansado ._.");
    }

    @Override
    public void alimentar() {
        System.out.println("Tengo sueño no hambre");
    }

    @Override
    public void dormir() {
        System.out.println("A mimir");
        MTT.setState(new Durmiendo());
    }

    @Override
    public void queTal() {
        System.out.println("Estoy cansado");
    }

    @Override
    public void setMyTalkingTom(MyTalkingTom MyTalkingTom) {
        this.MTT = MyTalkingTom;
    }
    
}
