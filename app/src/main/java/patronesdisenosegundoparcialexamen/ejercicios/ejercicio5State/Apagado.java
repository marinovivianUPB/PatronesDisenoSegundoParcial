package patronesdisenosegundoparcialexamen.ejercicios.ejercicio5State;

public class Apagado implements IState {

    @Override
    public void handler(Computadora compu) {
        System.out.println("COMPU APAGADA");
        compu.setCpu(1);
        compu.setRam(1);
        compu.show();
        
    }
    
}
