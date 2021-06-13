package strategy;

import java.util.List;

public class Invierno implements IStrategy{

    @Override
    public void vender(List<Ropa> lista) {
        System.out.println("Precios invierno: ");
        System.out.println();
        for (Ropa ropa : lista) {
            System.out.println("Nombre del producto: "+ropa.getNombre());
            System.out.println("Precio del producto: "+(ropa.getPrecio()*1.1));
            System.out.println();
        }

    }

}
