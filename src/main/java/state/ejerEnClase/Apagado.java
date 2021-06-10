package state.ejerEnClase;

import state.ejercicio.Computadora;
import state.ejercicio.MemoriaRam;;

public class Apagado implements  IComputadora{

    public Apagado(){

    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Apagado **");
        computadora.setConsumoCpu(new ConsumoCpu(0,"apagado"));
        computadora.setMemoriaRam(new MemoriaRam(0,"NAN"));
        computadora.setProgramaAbierto(new ProgramaAbierto("",));
        computadora.setTimeLimit(0);
        System.out.println("********");
    }
}
