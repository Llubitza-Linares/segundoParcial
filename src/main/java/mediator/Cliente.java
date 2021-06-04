package mediator;

public class Cliente {
    public static void main(String[] args) {


        Skype skype = new Skype();

        Persona dev1 = new Persona(skype);
        dev1.setCargo("DEV");
        dev1.setNombre("dev1");
        dev1.setCi("111");
        dev1.setLenguaje("Espanol");

        Persona dev2 = new Persona(skype);
        Persona dev3 = new Persona(skype);
        Persona qa1 = new Persona(skype);
        Persona qa2 = new Persona(skype);
        Persona qa3 = new Persona(skype);
        Persona sm1 = new Persona(skype);
        Persona sm2 = new Persona(skype);
        Persona sm3 = new Persona(skype);

        dev2.setCargo("DEV");
        dev2.setNombre("dev2");
        dev2.setCi("1112");
        dev2.setLenguaje("Ingles");

        dev3.setCargo("DEV");
        dev3.setNombre("dev3");
        dev3.setCi("1113");
        dev3.setLenguaje("Espanol");

        qa1.setCargo("QA");
        qa1.setNombre("qa1");
        qa1.setCi("11133");
        qa1.setGrado("Alto");

        qa2.setCargo("QA");
        qa2.setNombre("qa2");
        qa2.setCi("111533");
        qa2.setGrado("Bajo");

        qa3.setCargo("QA");
        qa3.setNombre("qa2");
        qa3.setCi("111533");
        qa3.setGrado("Medio");

        sm1.setCargo("SM");
        sm1.setNombre("sm11");
        sm1.setCi("1115533");
        sm1.setCertificaciones("Develop");

        sm2.setCargo("SM");
        sm2.setNombre("sm11");
        sm2.setCi("1115533");
        sm2.setCertificaciones("Scrum");

        sm3.setCargo("SM");
        sm3.setNombre("sm11");
        sm3.setCi("1115533");
        sm3.setCertificaciones("Develop");

        skype.PersonaAlChat(dev1);
        skype.PersonaAlChat(dev2);
        skype.PersonaAlChat(dev3);
        skype.PersonaAlChat(qa1);
        skype.PersonaAlChat(qa2);
        skype.PersonaAlChat(qa3);
        skype.PersonaAlChat(sm1);
        skype.PersonaAlChat(sm2);
        skype.PersonaAlChat(sm3);

        dev1.send("hola como estan todos los DEVs");
        dev2.send("todo bien DEVs");

        qa2.send("hola a todos los QAs");

        sm1.send("hola a todos!! hoy acaba el sprint");

}
}
