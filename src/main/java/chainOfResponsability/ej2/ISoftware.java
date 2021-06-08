package chainOfResponsability.ej2;

public interface ISoftware {
    void setNext(ISoftware handler);
    ISoftware next();
    void procesoCarnetizacion(Persona persona);
}
