package chainOfResponsability.ej1;

public interface IEncargado {
    void setNext(IEncargado handler);
    IEncargado next();
    void criteriaHandler(String peticion);
}
