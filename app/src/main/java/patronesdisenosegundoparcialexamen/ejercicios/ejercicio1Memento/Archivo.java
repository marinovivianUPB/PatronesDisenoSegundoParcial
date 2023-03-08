package patronesdisenosegundoparcialexamen.ejercicios.ejercicio1Memento;

import java.util.ArrayList;
import java.util.List;

public class Archivo {
    private List<String> oraciones = new ArrayList<>();
    private String titulo;
    private boolean versionar;
    private int versiones;
    

    public void addOracion(String oracion){
        oraciones.add(oracion);
        if(oracion.split(" ").length>=5){
            versionar=true;
            versiones=oracion.split(" ").length/5;
        }
    }

    public List<String> getOraciones() {
        List<String> news = new ArrayList<>();
        for(String aux: oraciones){
            news.add(aux);
        }
        return news;
    }
    public void setOraciones(List<String> oraciones) {
        this.oraciones = oraciones;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void show(){
        System.out.println("--------------------------------");
        for(String aux: oraciones){
            System.out.println(aux);
        }
    }

    public boolean isVersionar() {
        return versionar;
    }

    public void setVersionar(boolean versionar) {
        this.versionar = versionar;
    }



    public int getVersiones() {
        return versiones;
    }



    public void setVersiones(int versiones) {
        this.versiones = versiones;
    }
    
}
