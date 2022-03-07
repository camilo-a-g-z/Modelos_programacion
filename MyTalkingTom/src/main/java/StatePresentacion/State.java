package StatePresentacion;

/**
 *
 * @author Camilo Garcia
 */
public interface State {
    void jugar();
    void alimentar();
    void dormir();
    void queTal();
        
    void setMyTalkingTom(MyTalkingTom MTT);
}
