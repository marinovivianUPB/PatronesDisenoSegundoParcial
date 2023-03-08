package patronesdisenosegundoparcialexamen.ejercicios.ejercicio5State;

public class Reiniciado implements IState {

    @Override
    public void handler(Computadora compu) {
        System.out.println("COMPU REINICIANDO");
        compu.show();
        compu.setCpu(0);
        compu.setRam(0);
        compu.cerrarProgramas();
        compu.show();
        
    }
    
}
