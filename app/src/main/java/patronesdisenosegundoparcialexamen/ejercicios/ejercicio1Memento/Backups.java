package patronesdisenosegundoparcialexamen.ejercicios.ejercicio1Memento;

import java.util.HashMap;
import java.util.Map;

public class Backups {
    private Map<String, Memento> versiones = new HashMap<>();
    private int version=0;
 
    
    public Backups addNuevaVersion(Memento memento){
        versiones.put(memento.getNombre(), memento);
        version++;
        return this;
    }

    

    public int getVersion() {
        return version;
    }
    
    public String getNombre(){
        return "version"+getVersion();
    }

    public void show(){
        versiones.values().stream().forEach(a -> a.getArchivo().show());
    }

    public Memento getVersion(int version){
        return versiones.get("version"+version);
    }
}
