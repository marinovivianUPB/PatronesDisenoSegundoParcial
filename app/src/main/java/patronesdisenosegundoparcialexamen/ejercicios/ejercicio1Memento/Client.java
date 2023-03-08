package patronesdisenosegundoparcialexamen.ejercicios.ejercicio1Memento;

public class Client {
    public static void main(String[] args) {
        Archivo a = new Archivo();
        a.setTitulo("hola");
        
        Backups b = new Backups();
        Editor w = new Editor();

        w.setBackups(b);
        a.addOracion("este documento es una prueba");
        w.setMemento(a);

        w.getBackups().show();

        a.addOracion("el exito solo depende de tu esfuerzo");
        w.setMemento(a);

        w.getBackups().show();

        a.addOracion("prologo");
        w.setMemento(a);

        w.getBackups().show();
    }
}
