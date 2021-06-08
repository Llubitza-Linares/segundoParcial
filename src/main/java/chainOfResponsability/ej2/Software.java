package chainOfResponsability.ej2;

public class Software implements ISoftware {
    private ISoftware next;

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

        if (persona.getCertificadoDeNacimiento()&&persona.getFicha()&& persona.getPagoAlBanco() ){
            System.out.println("************ ");
            System.out.println("Responsable de Carnetizacion: Se realizara el carnet");
            System.out.println(" ");
        } else {
            this.next.procesoCarnetizacion(persona);
        }
    }
}
