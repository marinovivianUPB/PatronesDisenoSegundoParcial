package patronesdisenosegundoparcialexamen.ejercicios.ejericio4Strategy;

import java.util.Comparator;
import java.util.List;

public class StrategyByCarrera implements IStrategy{
    @Override
    public List<Estudiante> ordenar(List<Estudiante> estudiantes) {
        Comparator<Estudiante> porName = (Estudiante a, Estudiante b) -> a.getCarrera().compareTo(b.getCarrera());
        estudiantes.sort(porName);
        return estudiantes;
    }
}
