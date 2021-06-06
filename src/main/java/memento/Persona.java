package memento;

public class Persona {
    public Persona(String name, String ci, String edad) {
        super();
        this.name = name;
        this.ci = ci;
        this.edad = edad;
    }

    String name;
    String ci;
    String edad;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void show() {

        System.out.println("");
        System.out.println("Nombre: " + name);
        System.out.println("ci: " + ci);
        System.out.println("edad: " + edad);

    }

}
