package memento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {

        TakeCare takeCare = new TakeCare();
        Originator originator = new Originator();
        BaseDeDatos datos;
        List<Persona> bd = new ArrayList<>();

        Persona p1 = new Persona("Juan", "10926548", "18");
        Persona p2 = new Persona("Leonardo", "79864532", "21");
        Persona p3 = new Persona("Bruno", "125198452", "20");
        Persona p4 = new Persona("Joaquin", "6543245", "15");
        Persona p5 = new Persona("Lucia", "65468324", "18");

        bd.add(p1);
        bd.add(p2);
        bd.add(p3);
        bd.add(p4);
        bd.add(p5);

        List<Persona> bd1 = new ArrayList<>();

        Persona p6 = new Persona("Andres", "85274196", "30");
        Persona p7 = new Persona("Andrei", "85241635", "31");
        Persona p8 = new Persona("Rodrigo", "15935745", "33");
        Persona p9 = new Persona("Matheo", "98765432", "20");
        Persona p10 = new Persona("Mauricio", "65432198", "40");

        bd1.add(p6);
        bd1.add(p7);
        bd1.add(p8);
        bd1.add(p9);
        bd1.add(p10);

        List<Persona> bd2 = new ArrayList<>();

        Persona p11 = new Persona("Ginno", "10203456", "24");
        Persona p12 = new Persona("Ariane", "16345275", "51");
        Persona p13 = new Persona("Diana", "65433212", "43");
        Persona p14 = new Persona("Samantha", "142536378", "32");
        Persona p15 = new Persona("Kevin", "857419612", "24");

        bd2.add(p11);
        bd2.add(p12);
        bd2.add(p13);
        bd2.add(p14);
        bd2.add(p15);

        List<Persona> bd3 = new ArrayList<>();

        Persona p16 = new Persona("Mikaela", "6548126", "24");
        Persona p17 = new Persona("Denisse", "457482045", "51");
        Persona p18 = new Persona("Nicole", "85749615", "43");
        Persona p19 = new Persona("Rafaela", "410204565", "32");
        Persona p20 = new Persona("Camila", "410520785", "24");

        bd3.add(p16);
        bd3.add(p17);
        bd3.add(p18);
        bd3.add(p19);
        bd3.add(p20);

        List<Persona> bd4 = new ArrayList<>();

        Persona p21 = new Persona("Michelle", "98765412", "51");
        Persona p22 = new Persona("Jayline", "32165479", "49");
        Persona p23 = new Persona("Alejandra", "104706511", "45");
        Persona p24 = new Persona("Andrea", "201948745", "39");
        Persona p25 = new Persona("Maria", "5201466", "29");

        bd4.add(p21);
        bd4.add(p22);
        bd4.add(p23);
        bd4.add(p24);
        bd4.add(p25);

        // CADA 5 GUARDA EL ESTATUS
        datos = new BaseDeDatos("BackupMarzo", bd);
        originator.setState(datos);
        datos = new BaseDeDatos("BackupAbril", bd1);
        originator.setState(datos);
        takeCare.addMemento(originator.createMemento());
        datos = new BaseDeDatos("BackupMayo", bd2);
        originator.setState(datos);
        datos = new BaseDeDatos("BackupJunio", bd3);
        originator.setState(datos);
        takeCare.addMemento(originator.createMemento());
        datos = new BaseDeDatos("BackupJulio", bd4);
        originator.setState(datos);

        // RESTAURAR BACKUPS
        originator.restoreFromMemento(takeCare.getMemento(0));
        originator.restoreFromMemento(takeCare.getMemento(1));

    }
}
