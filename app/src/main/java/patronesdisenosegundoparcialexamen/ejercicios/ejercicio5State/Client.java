package patronesdisenosegundoparcialexamen.ejercicios.ejercicio5State;

public class Client {
    public static void main(String[] args) {
        Computadora compu = new Computadora();

        compu.setState(new Apagado());
        compu.accionar();
        compu.setState(new Prendiendo());
        compu.accionar();
        compu.setState(new Reiniciado());
        compu.accionar();
        compu.setState(new Prendiendo());
        compu.accionar();
    }
}
