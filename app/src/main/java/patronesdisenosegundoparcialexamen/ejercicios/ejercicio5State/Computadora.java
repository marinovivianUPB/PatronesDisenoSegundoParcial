package patronesdisenosegundoparcialexamen.ejercicios.ejercicio5State;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Computadora {
    private Stack<String> programas = new Stack<>();
    private double ram;
    private double cpu;

    private IState state;

    
    public double getRam() {
        return ram;
    }
    public void setRam(double ram) {
        this.ram = ram;
    }
    public double getCpu() {
        return cpu;
    }
    public void setCpu(double cpu) {
        this.cpu = cpu;
    }
    public Stack<String> getProgramas() {
        return programas;
    }
    public void setProgramas(Stack<String> programas) {
        this.programas = programas;
    }

    public void addPrograma(String p){
        programas.add(p);
    }

    public void cerrarProgramas(){
        while(!programas.empty()){
            System.out.println("CERRANDO"+programas.pop());
        }
    }

    public void mostrarProgramas(){

        if(!programas.isEmpty()){
            System.out.println("PROGRAMAS ABIERTOS");
            programas.stream().forEach(a -> System.out.println(a));
        }else{
            System.out.println("NO HAY PROGRAMAS ABIERTOS");
        }
    }

    public void show(){
        System.out.println("COMPU: ");
        System.out.println("RAM: "+ram+"% CPU: "+cpu+"%");
        mostrarProgramas();
    }
    public IState getState() {
        return state;
    }
    public void setState(IState state) {
        this.state = state;
    }

    public void accionar(){
        this.state.handler(this);
    }
    
}
