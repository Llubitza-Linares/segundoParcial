package memento;

public class Memento {
    private BaseDeDatos state;

    public Memento(BaseDeDatos stateSaved) {
        this.state = stateSaved;
    }

    public BaseDeDatos getState() {
        return state;
    }
}
