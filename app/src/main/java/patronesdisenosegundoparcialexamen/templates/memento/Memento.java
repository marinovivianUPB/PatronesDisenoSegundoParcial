package patronesdisenosegundoparcialexamen.templates.memento;

public class Memento {

    private ConcreteObject concreteObject;

    public Memento(ConcreteObject concreteObject) {
        this.concreteObject = concreteObject;
    }

    public ConcreteObject getConcreteObject() {
        return concreteObject;
    }
}
