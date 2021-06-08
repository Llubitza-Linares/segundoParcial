package chainOfResponsability.ej2;

public class Cliente {
    public static void main (String []ar){
        Carnetizacion carnetizacion = new Carnetizacion();

        carnetizacion.procesoCarnetizacion(new Persona(true, true, true));
        carnetizacion.procesoCarnetizacion(new Persona(false, true, true));
        carnetizacion.procesoCarnetizacion(new Persona(true, false, true));
        carnetizacion.procesoCarnetizacion(new Persona(true, false, false));


    }
}
