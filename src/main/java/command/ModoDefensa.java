package command;

public class ModoDefensa implements IOperacionBuild{
        private Personaje personaje;

        public ModoDefensa(Personaje personaje){
            this.personaje=personaje;
        }


    @Override
    public void execute() {
        this.personaje.modoDefensa();
    }
}
