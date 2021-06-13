package strategy;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        TiendaRopa t = new TiendaRopa();

        List<Ropa> lista = new LinkedList<Ropa>();

        lista.add(new Ropa("Camisa", 100));
        lista.add(new Ropa("Polera", 150));
        lista.add(new Ropa("Jean", 120));
        lista.add(new Ropa("Chamarra", 80));
        lista.add(new Ropa("Tennis", 1000));

        t.setLista(lista);

        t.setEstrategia(new Primavera());
        t.vender();

        t.setEstrategia(new Verano());
        t.vender();

        t.setEstrategia(new Invierno());
        t.vender();

        t.setEstrategia(new Otoño());
        t.vender();

    }

}
