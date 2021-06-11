package state.ejerEnClase;

public class Reiniciar implements IComputadora{
    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: REINICIO **");
        System.out.println("MEMORIA RAM ANTES:"+computadora.getConsumoEnMemoriaRam()+" %");
        System.out.println("CONSUMO CPU ANTES:"+computadora.getConsumoEnCPU()+" %");
        computadora.setConsumoEnMemoriaRam(0);
        computadora.setConsumoEnCPU(0);
        computadora.setProgramasAbiertos(new String[20]);
        System.out.println("MEMORIA RAM ACTUAL:"+computadora.getConsumoEnMemoriaRam()+" %");
        System.out.println("CONSUMO CPU ACTUAL:"+computadora.getConsumoEnCPU()+" %");
        System.out.println("LOS PROGRAMAS SE CERRARON");
        System.out.println("********");

    }
}