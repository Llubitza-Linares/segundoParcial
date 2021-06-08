package chainOfResponsability.ej1;

public class Support implements IEncargado {
    private IEncargado next;

    @Override
    public void setNext(IEncargado encargado) {
        this.next = encargado;
    }

    @Override
    public IEncargado next() {
        return this.next;

    }

    @Override
    public void criteriaHandler(String peticion) {
        System.out.println("************ ");
        System.out.println("SUPPORT: Se está evaluando el problema");
        System.out.println(" ");
    }
}
