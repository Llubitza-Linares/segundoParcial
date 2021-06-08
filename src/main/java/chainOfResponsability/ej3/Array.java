package chainOfResponsability.ej3;

public class Array implements IArray {
        private IArray next;

        @Override
        public void setNext(IArray handler) {
                this.next = handler;
        }

        @Override
        public IArray next() {
                return this.next;
        }

        @Override
        public void ordenacion(Personas personas) {

                Algoritmo1 algoritmo1 = new Algoritmo1();
                this.setNext(algoritmo1);

                Algoritmo2 algoritmo2 = new Algoritmo2();
                algoritmo1.setNext(algoritmo2);

                Algoritmo3 algoritmo3 = new Algoritmo3();
                algoritmo3.setNext(algoritmo3);

                this.next.ordenacion(personas);
        }
}