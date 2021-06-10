package state.ejercicio;

import state.ejerEnClase.ConsumoCpu;

public class Computadora {
    private IStateComputadora state;
    private TarjetaVideo tarjetaVideo;
    private MemoriaRam memoriaRam;
    private int timeLimit;


    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public void request(){
        this.state.handler(this);
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public void setConsumoCpu(ConsumoCpu apagado) {
    }

    public void setProgramaAbierto() {
    }
}
