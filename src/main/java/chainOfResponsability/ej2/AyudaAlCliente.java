package chainOfResponsability.ej2;

public class AyudaAlCliente implements ISoftware{
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

        if(!persona.getFicha()){
            System.out.println("Faltan muchos requerimientos");
        }else{
            this.next.procesoCarnetizacion(persona);
        }
    }
}
