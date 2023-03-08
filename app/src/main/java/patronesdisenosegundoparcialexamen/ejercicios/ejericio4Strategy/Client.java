package patronesdisenosegundoparcialexamen.ejercicios.ejericio4Strategy;

public class Client {
    public static void main(String[] args) {
        BaseDatos b = new BaseDatos();
        b.addEstudiante(new Estudiante("a", "b", "c", "d"))
        .addEstudiante(new Estudiante("b", "c", "d", "a"));

        b.setStrategy(new StrategyByCi());
        b.ordenar();
        b.setStrategy(new StrategyByName());
        b.ordenar();
        b.setStrategy(new StrategyByCarrera());
        b.ordenar();
    }
}
