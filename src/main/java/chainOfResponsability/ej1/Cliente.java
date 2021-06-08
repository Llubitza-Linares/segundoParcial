package chainOfResponsability.ej1;

public class Cliente {
    public static void main(String[] args) {
        HandlerManager handlerManager = new HandlerManager();

        handlerManager.criteriaHandler("Infraestructura");

        handlerManager.criteriaHandler("Bug");

        handlerManager.criteriaHandler("Mejora");

        handlerManager.criteriaHandler("Nueva funcionalidad");

        handlerManager.criteriaHandler("Costos");

        handlerManager.criteriaHandler("Ayuda");

    }
}
