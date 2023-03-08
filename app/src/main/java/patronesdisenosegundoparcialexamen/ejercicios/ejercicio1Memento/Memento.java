package patronesdisenosegundoparcialexamen.ejercicios.ejercicio1Memento;

public class Memento {
    private Archivo archivo;
    private String nombre;

    public Memento(Archivo archivo, String nombre) {
        this.archivo = archivo;
        this.nombre = nombre;
    }

    public Archivo getArchivo() {
        Archivo aux = new Archivo();
        aux.setOraciones(archivo.getOraciones());
        aux.setTitulo(archivo.getTitulo());
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    
    
}
