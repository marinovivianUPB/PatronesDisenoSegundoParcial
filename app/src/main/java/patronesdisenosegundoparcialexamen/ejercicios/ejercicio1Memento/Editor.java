package patronesdisenosegundoparcialexamen.ejercicios.ejercicio1Memento;

public class Editor {
    private Archivo archivo;
    private Backups backups;

    public void setMemento(Archivo archivo){
        System.out.println("DOCUMENTO LISTO PARA SER GUARDADO");
        this.archivo = archivo;
        if(archivo.isVersionar()){
            archivo.setVersionar(false);
            int aux = archivo.getVersiones();
            while(aux>0){
                backups.addNuevaVersion(createMemento(backups.getNombre()));
                aux--;
            }
            archivo.setVersiones(0);
        }
    }

    public Memento createMemento(String version){
        Archivo aux = new Archivo();
        aux.setOraciones(archivo.getOraciones());
        aux.setTitulo(archivo.getTitulo());
        return new Memento(aux, version);
    }

    public void recuperarVersion(Memento memento){
        archivo = memento.getArchivo();
        System.out.println("SE RECUPERO LA VERSION: "+memento.getNombre());
        archivo.show();
    }

    public void setBackups(Backups backups) {
        this.backups = backups;
    }

    public Backups getBackups() {
        return backups;
    }



}
