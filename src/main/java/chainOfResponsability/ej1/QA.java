package chainOfResponsability.ej1;

public class QA implements IEncargado {
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
        if (peticion.equals("Bug") ||  peticion.equals("Mejora")){
            System.out.println("************ ");
            System.out.println("QA: El error sera aislado");
            System.out.println(" ");
        } else {
            this.next.criteriaHandler(peticion);
        }
    }
}
