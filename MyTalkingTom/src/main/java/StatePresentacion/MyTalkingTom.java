package StatePresentacion;

/**
 *
 * @author Camilo Garcia
 */
class MyTalkingTom {
    private State stado;

    public MyTalkingTom() {
        setState(new Aburrido());
    }

    void setState(State state) {
        this.stado = state;
        this.stado.setMyTalkingTom(this);
    }
    void alimentar(){
        this.stado.alimentar();
    }
    void dormir(){
        this.stado.dormir();
    }
    void jugar(){
        this.stado.jugar();
    }
    void queTal(){
        this.stado.queTal();
    }
}
