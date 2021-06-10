package state.ejerEnClase;

import state.ejercicio.Computadora;
import state.ejercicio.MemoriaRam;

public class Reiniciar implements IComputadora{

    public Reiniciar(){}

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Reiniciando **");
        computadora.setConsumoCpu(new ConsumoCpu(0, "apagado"));
        computadora.setMemoriaRam(new MemoriaRam(0, "NAN"));
        computadora.setProgramaAbierto();
        computadora.setTimeLimit(0);
        System.out.println("********");
    }
}
