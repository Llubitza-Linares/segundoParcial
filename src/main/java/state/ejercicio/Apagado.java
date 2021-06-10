package state.ejercicio;

public class Apagado implements IStateComputadora {

    public Apagado(){

    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Apagado **");
        computadora.setTarjetaVideo(new TarjetaVideo(0,"apagado"));
        computadora.setMemoriaRam(new MemoriaRam(0,"NAN"));
        computadora.setTimeLimit(0);
        System.out.println("********");
    }
}
