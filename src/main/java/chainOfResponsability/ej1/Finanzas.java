package chainOfResponsability.ej1;

public class Finanzas implements IEncargado {
    private IEncargado next;

    @Override
    public void setNext(IEncargado encargado) {
        this.next=encargado;
    }

    @Override
    public IEncargado next() {
        return this.next;

    }

    @Override
    public void criteriaHandler(String peticion) {
        if (peticion.equals("Costos") ){
            System.out.println("************ ");
            System.out.println("FINANZAS: Se están evaluando los costos");
            System.out.println(" ");
        } else {
            this.next.criteriaHandler(peticion);
        }
    }


}
