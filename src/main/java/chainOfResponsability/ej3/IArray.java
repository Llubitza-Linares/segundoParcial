package chainOfResponsability.ej3;

public interface IArray {
    void setNext(IArray handler);
    IArray next();
    void ordenacion(Personas personas);
}
