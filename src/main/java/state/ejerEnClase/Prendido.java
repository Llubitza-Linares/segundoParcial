package state.ejerEnClase;

import java.util.Random;

public class Prendido implements IComputadora{
    private int programas;
    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: PRENDIDO **");
        computadora.setProgramasAbiertos(abrir());
        computadora.setConsumoEnCPU(computadora.getProgramasAbiertos().length*5);
        computadora.setConsumoEnMemoriaRam(computadora.getProgramasAbiertos().length*5);
        System.out.println("MEMORIA RAM:"+computadora.getConsumoEnMemoriaRam()+" %");
        System.out.println("CONSUMO CPU:"+computadora.getConsumoEnCPU()+" %");
        System.out.println("** PROGRAMAS ABIERTOS **");
        for (int i=0;i<computadora.getProgramasAbiertos().length;i++){
            System.out.println(" "+computadora.getProgramasAbiertos()[i]);

        }

    }

    private String[] abrir() {
        Random random=new Random();
        programas =random.nextInt(20)+1;
        String[] programa=new String[programas];
        for (int i=0;i<programas;i++){
            programa[i]="Programa"+(i+1);
        }
        return programa;
    }
}
