package chainOfResponsability.ej2;

public class Cajero implements ISoftware{
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

        if ( persona.getFicha()&persona.getCertificadoDeNacimiento()& (!persona.getPagoAlBanco())){
            System.out.println("************ ");
            System.out.println("Cajero: Tome su factura, sera atendido");
            System.out.println(" ");
            persona.setPagoAlBanco(true);
            this.next.procesoCarnetizacion(persona);
        } else {
            this.next.procesoCarnetizacion(persona);
        }
    }
}
