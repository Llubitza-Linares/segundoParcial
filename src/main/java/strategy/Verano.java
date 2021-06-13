package strategy;

import java.util.List;

public class Verano implements IStrategy{

    @Override
    public void vender(List<Ropa> lista) {
        System.out.println("Precios verano: ");
        System.out.println();
        for (Ropa ropa : lista) {
            System.out.println("Nombre del producto: "+ropa.getNombre());
            System.out.println("Precio del producto: "+(ropa.getPrecio()*0.9));
            System.out.println();
        }

    }
}
