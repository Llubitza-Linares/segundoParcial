package chainOfResponsability.ej2;

public class Carnetizacion implements ISoftware {
    private  ISoftware next;

    @Override
    public void setNext(ISoftware handler) {
        this.next=handler;
    }

    @Override
    public ISoftware next() {
        return this.next;
    }

    @Override
    public void procesoCarnetizacion(Persona persona) {

        Notario notario = new Notario();
        this.setNext(notario);

        Cajero cajero = new Cajero();
        notario.setNext(cajero);

        AyudaAlCliente ayudaAlCliente = new AyudaAlCliente();
        cajero.setNext(ayudaAlCliente);

        this.next.procesoCarnetizacion(persona);
    }
}
