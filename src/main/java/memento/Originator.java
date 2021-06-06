package memento;

public class Originator {
    private BaseDeDatos state;

    public void setState(BaseDeDatos state) {
        System.out.println("Guardando estado....");
        state.showInfo();
        this.state = state;
    }

    public Memento createMemento() {
        System.out.println("*Creando estado....");
        state.showInfo();
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getState();
        System.out.println("Restaurando estado....");
        this.state.showInfo();
    }

}
