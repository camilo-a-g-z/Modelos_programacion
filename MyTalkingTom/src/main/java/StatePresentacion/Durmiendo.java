package StatePresentacion;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Camilo Garcia
 */
public class Durmiendo implements State {
    MyTalkingTom MTT;
    public Durmiendo() {
    }

    @Override
    public void jugar() {}

    @Override
    public void alimentar() {}

    @Override
    public void dormir() {}

    @Override
    public void queTal() {
        System.out.println("(Esta durmiendo)");
    }

    @Override
    public void setMyTalkingTom(MyTalkingTom MyTalkingTom) {
        this.MTT = MyTalkingTom;
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.MTT.setState(new Hambriento());
            }
        }, 7000);
    }
    
}
