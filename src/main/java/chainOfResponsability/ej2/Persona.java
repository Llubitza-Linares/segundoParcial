package chainOfResponsability.ej2;

public class Persona {
    private Boolean certificadoDeNacimiento;
    private Boolean pagoAlBanco;
    private Boolean ficha;

    public Persona(Boolean certificadoDeNacimiento, Boolean pagoAlBanco, Boolean ficha) {
        this.certificadoDeNacimiento = certificadoDeNacimiento;
        this.pagoAlBanco = pagoAlBanco;
        this.ficha = ficha;
    }

    public Boolean getCertificadoDeNacimiento() {
        return certificadoDeNacimiento;
    }

    public void setCertificadoDeNacimiento(Boolean certificadoDeNacimiento) {
        this.certificadoDeNacimiento = certificadoDeNacimiento;
    }

    public Boolean getPagoAlBanco() {
        return pagoAlBanco;
    }

    public void setPagoAlBanco(Boolean pagoAlBanco) {
        this.pagoAlBanco = pagoAlBanco;
    }

    public Boolean getFicha() {
        return ficha;
    }

    public void setFicha(Boolean ficha) {
        this.ficha = ficha;
    }

    public void showInfo() {
        System.out.println("Persona > Certificado de Nacimiento: " + certificadoDeNacimiento);
        System.out.println("Persona > Pago al Banco: " + pagoAlBanco);
        System.out.println("Persona > Ficha: " + ficha);
        System.out.println(" ");
    }
}