package chainOfResponsability.ej1;

public class Developer implements IEncargado {
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
        if (peticion.equals("Nueva funcionalidad") ){
            System.out.println("************ ");
            System.out.println("DEVELOPER: Se estima la nueva funcionalidad");
            System.out.println(" ");
        } else {
            this.next.criteriaHandler(peticion);
        }
    }

}
