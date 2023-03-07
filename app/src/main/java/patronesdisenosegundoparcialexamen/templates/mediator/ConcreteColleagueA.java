package patronesdisenosegundoparcialexamen.templates.mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String msg) {
        this.mediator.send(msg,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("Mensaje ColleagueA <<<< "+msg);
    }
}