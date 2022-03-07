package StatePresentacion;

/**
 *
 * @author Camilo Garcia
 */
public class Aburrido implements State{
    private MyTalkingTom MTT;   
    @Override
    public void jugar() {
        System.out.println("Vamos a jugar!! :3");
        MTT.setState(new Cansado());
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer :/");
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueño");
    }

    @Override
    public void queTal() {
        System.out.println("Estoy aburrido");
    }

    @Override
    public void setMyTalkingTom(MyTalkingTom MyTalkingTom) {
        this.MTT = MyTalkingTom;
    }
    
}
