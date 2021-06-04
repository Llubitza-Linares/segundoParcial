package mediator;

import java.util.HashMap;
import java.util.Map;

public class Skype implements ICanalDeComunicacion {

    private Map<Persona, Skype> personaChat = new HashMap();

    public void PersonaAlChat(Persona persona) {

        personaChat.get(persona);
    }


    @Override
    public void send(String message, Colleague personaOrigen) {
        Persona personaParseOrigen = (Persona) personaOrigen;
        for (Persona persona : PersonaAlChat()) {
            if (!personaParseOrigen.getCi().equals(persona.getCi())) {
                if (personaParseOrigen.getCertificaciones().equals("SM")) persona.messageReceived(message);
                if (personaParseOrigen.getGrado().equals("QA") && persona.getGrado().equals("QA"))
                    persona.messageReceived(message);
                if (personaParseOrigen.getLenguaje().equals("DEV") && persona.getLenguaje().equals("DEV"))
                    persona.messageReceived(message);
            }
        }
    }

    private Persona[] PersonaAlChat() {
        return new Persona[0];
    }
}
