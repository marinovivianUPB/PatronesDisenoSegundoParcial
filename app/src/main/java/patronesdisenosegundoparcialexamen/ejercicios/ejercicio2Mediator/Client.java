package patronesdisenosegundoparcialexamen.ejercicios.ejercicio2Mediator;

public class Client {
    public static void main(String[] args) {
        Chat c = new Chat();

        Estudiante a = new Estudiante("a", "a", "s", c);
        Estudiante a1 = new Estudiante("a1", "a1", "s", c);
        Estudiante a2 = new Estudiante("a2", "a2", "s", c);

        Docente b = new Docente("b", "b", "b", c);
        Docente b1 = new Docente("b1", "b1", "b", c);
        Docente b2 = new Docente("b2", "b2", "b", c);

        c.addJugador(a);
        c.addJugador(a1);
        c.addJugador(a2);
        c.addJugador(b);
        c.addJugador(b1);
        c.addJugador(b2);

        a.send("hola", "equipo");
        a.send("hola", "todos");
        //EN EL EJERCICIO SE INDICO QUE SOLO EL ESTUDIANTE PUEDE ELEGIR SI ENVIAR SOLO A SU EQUIPO O A TODOS
        b.send("hola", "x");
    }
}
