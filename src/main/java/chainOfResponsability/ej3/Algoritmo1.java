package chainOfResponsability.ej3;

public class Algoritmo1 implements IArray {
    private  IArray next;

    @Override
    public void setNext(IArray handler) {
        this.next=handler;
    }

    @Override
    public IArray next() {
        return this.next;
    }

    @Override
    public void ordenacion (Personas personas) {

        if (personas.getEdad() > 1 && personas.getEdad() <= 20) {
            System.out.println("Las personas tienen un maximo de 20 " );
        } else {
            this.next.ordenacion(personas);
        }
    }
}
