package state.ejerEnClase;

public class Apagado implements IComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Apagado **");
        computadora.setConsumoEnMemoriaRam(0);
        computadora.setConsumoEnCPU(0);
        computadora.setProgramasAbiertos(new String[20]);
        System.out.println("MEMORIA RAM:"+computadora.getConsumoEnMemoriaRam()+" %");
        System.out.println("CONSUMO CPU:"+computadora.getConsumoEnCPU()+" %");
        System.out.println("NINGUN PROGRAMA ABIERTO");
        System.out.println("********");

    }
}
