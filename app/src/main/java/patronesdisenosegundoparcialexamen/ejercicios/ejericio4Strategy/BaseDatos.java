package patronesdisenosegundoparcialexamen.ejercicios.ejericio4Strategy;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {

    List<Estudiante> estudiantes = new ArrayList<>();

    private IStrategy strategy;


    public BaseDatos addEstudiante(Estudiante e){
        estudiantes.add(e);
        return this;
    }
    
    public void ordenar(List<Estudiante> estudiantes){
        this.strategy.ordenar(estudiantes);
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

}
