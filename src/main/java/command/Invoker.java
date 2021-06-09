package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IOperacionBuild> listaDeAcciones = new ArrayList<>();

    public void addCommand(IOperacionBuild concreteCommand) {
        listaDeAcciones.add(concreteCommand);
    }

    public void executeCommands() {
        for (IOperacionBuild command : listaDeAcciones) {
            command.execute();
        }
        listaDeAcciones.clear();
    }
}