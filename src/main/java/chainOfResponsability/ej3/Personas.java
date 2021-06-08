package chainOfResponsability.ej3;

public class Personas {
    private String ci;
    private String nombre;
    private int edad;

    public Personas(String ci, String nombre, int edad){
        this.ci=ci;
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void showInfo() {
        System.out.println("Persona > Ci: " + ci);
        System.out.println("Persona > Nombre: " + nombre);
        System.out.println("Persona > Edad: " + edad);
        System.out.println(" ");
    }
}
