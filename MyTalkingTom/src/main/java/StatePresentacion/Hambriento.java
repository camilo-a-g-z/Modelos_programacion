package StatePresentacion;

/**
 *
 * @author Camilo Garcia
 */
public class Hambriento implements State {
    MyTalkingTom MTT;
    public Hambriento() {
    }

    @Override
    public void jugar() {
        System.out.println("No puedo jugar tengo hambre");
    }

    @Override
    public void alimentar() {
        System.out.println("Yum Yum");
        this.MTT.setState(new Aburrido());
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueño");
    }

    @Override
    public void queTal() {
        System.out.println("Tengo hambre");
    }

    @Override
    public void setMyTalkingTom(MyTalkingTom MyTalkingTom) {
        this.MTT = MyTalkingTom;
    }
    
}
