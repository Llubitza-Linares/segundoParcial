package chainOfResponsability.ej1;

public class DevOps implements IEncargado {
    private IEncargado next;

    @Override
    public void setNext(IEncargado encargado) {
        this.next=encargado;
    }

    @Override
    public IEncargado next() {
        return this.next;

    }

    @Override
    public void criteriaHandler(String peticion) {
        if (peticion.equals("Infraestructura") ){
            System.out.println("************ ");
            System.out.println("DEVOPS: Se requiere información del error");
            System.out.println(" ");
        } else {
            this.next.criteriaHandler(peticion);
        }
    }


}
