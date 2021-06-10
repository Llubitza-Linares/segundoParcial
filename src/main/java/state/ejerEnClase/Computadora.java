package state.ejerEnClase;

public class Computadora {
    private IComputadora state;
    private ProgramaAbierto programaAbierto;
    private ConsumoCpu consumoCpu;
    private MemoriaRam memoriaRam;
    private int timeLimit;


    public IComputadora getState() {
        return state;
    }

    public void setState(IComputadora state) {
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

    public ProgramaAbierto getProgramaAbierto() {
        return programaAbierto;
    }

    public void setProgramaAbierto(ProgramaAbierto programaAbierto) {
        this.programaAbierto = programaAbierto;
    }

    public ConsumoCpu getConsumoCpu() {
        return consumoCpu;
    }

    public void setConsumoCpu(ConsumoCpu consumoCpu) {
        this.consumoCpu = consumoCpu;
    }
}
