package chainOfResponsability.ej1;

public class HandlerManager implements IEncargado {
    private  IEncargado next;

    @Override
    public void setNext(IEncargado handler) {
        this.next=handler;
    }

    @Override
    public IEncargado next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(String peticion) {

        DevOps devOps = new DevOps();
        this.setNext(devOps);

        QA qa = new QA();
        devOps.setNext(qa);

        Developer dev = new Developer();
        qa.setNext(dev);

        Finanzas fin = new Finanzas();
        dev.setNext(fin);

        Support sup = new Support();
        fin.setNext(sup);

        this.next.criteriaHandler(peticion);
    }
}
