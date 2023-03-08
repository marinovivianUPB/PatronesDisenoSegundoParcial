package patronesdisenosegundoparcialexamen.ejercicios.ejercicio2Mediator;

public class Docente extends Jugador {

    public Docente(String alias, String nombre, String ranking, IChat chat) {
        super(alias, nombre, ranking, chat);
        this.setTipo("docente");
    }

    @Override
    public void messageReceived(String msg) {
       System.out.println("---------------------------------------");
       this.show();
       System.out.println("MENSAJE RECIBIDO:" );
       System.out.println(msg);
       
    }

    @Override
    public void send(String msg, String indicador) {
        System.out.println("-----------ENVIANDO MENSAJE--------------");
        this.show();
        this.getChat().sebd(msg, this);
    }
    
}
