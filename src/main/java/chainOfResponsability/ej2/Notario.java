package chainOfResponsability.ej2;

public class Notario implements ISoftware{
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

        if (persona.getPagoAlBanco() && persona.getFicha() && (!persona.getCertificadoDeNacimiento())){
            System.out.println("************ ");
            System.out.println("NOTARIO: Tome su certificado, sera atendido");
            System.out.println(" ");
            persona.setCertificadoDeNacimiento(true);
            this.next.procesoCarnetizacion(persona);
        } else {
            this.next.procesoCarnetizacion(persona);
        }
    }
}
