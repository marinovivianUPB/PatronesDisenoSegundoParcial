package patronesdisenosegundoparcialexamen.ejercicios.ejericio4Strategy;

import java.util.Comparator;
import java.util.List;

public class StrategyByCi implements IStrategy{

    @Override
    public List<Estudiante> ordenar(List<Estudiante> estudiantes) {
        Comparator<Estudiante> porID = (Estudiante a, Estudiante b) -> a.getCi().compareTo(b.getCi());
        estudiantes.sort(porID);
        return estudiantes;
    }
    
}
