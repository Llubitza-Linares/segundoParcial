package chainOfResponsability.ej3;

public class Algoritmo3 implements IArray {
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

        if (personas.getEdad() >= 50) {
            System.out.println("Las personas estan entre las edades de 50 para adelante" );
        } else {
            this.next.ordenacion(personas);
        }
    }
}
