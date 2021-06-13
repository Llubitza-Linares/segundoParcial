package strategy;

import java.util.LinkedList;
import java.util.List;

public class TiendaRopa {
    private IStrategy estrategia;

    private List<Ropa> lista = new LinkedList<Ropa>();


    public void agregarProducto(Ropa r) {
        lista.add(r);
    }

    public IStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(IStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public List<Ropa> getLista() {
        return lista;
    }

    public void setLista(List<Ropa> lista) {
        this.lista = lista;
    }

    public void vender() {
        estrategia.vender(lista);
    }
}
