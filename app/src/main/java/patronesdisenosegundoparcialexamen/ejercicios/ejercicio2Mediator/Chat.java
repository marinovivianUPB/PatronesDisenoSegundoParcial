package patronesdisenosegundoparcialexamen.ejercicios.ejercicio2Mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements IChat{

    private List<Estudiante> equipoEstudiante = new ArrayList<>();
    private List<Docente> equipoDocente = new ArrayList<>();

    public void addJugador(Jugador jugador){
        if(jugador.getTipo().equals("estudiante")){
            equipoEstudiante.add((Estudiante) jugador);
        } else{
            equipoDocente.add((Docente) jugador);
        }
    }

    @Override
    public void send(String message, Estudiante estudiante, String indicador) {
       if(indicador.equals("equipo")){
            equipoEstudiante.stream().filter(a -> !a.equals(estudiante)).forEach(a -> a.messageReceived(message));
       } else{
        equipoEstudiante.stream().filter(a -> !a.equals(estudiante)).forEach(a -> a.messageReceived(message));
        equipoDocente.stream().forEach(a -> a.messageReceived(message));
       }
    }

    @Override
    public void sebd(String message, Docente docente) {
        equipoDocente.stream().filter(a -> !a.equals(docente)).forEach(a -> a.messageReceived(message));
        equipoEstudiante.stream().forEach(a -> a.messageReceived(message));
    }

    
    
}
