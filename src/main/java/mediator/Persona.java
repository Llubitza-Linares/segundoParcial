package mediator;

public class Persona extends Colleague{
    private String ci;
    private String nombre;
    private String grado;
    private String lenguaje;
    private String certificaciones;
    private String cargo;

    public Persona(ICanalDeComunicacion mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message, this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO-Message Received ");
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

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
