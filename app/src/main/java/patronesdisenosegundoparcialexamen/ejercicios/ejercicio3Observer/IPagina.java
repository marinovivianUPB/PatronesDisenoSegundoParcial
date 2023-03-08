package patronesdisenosegundoparcialexamen.ejercicios.ejercicio3Observer;

public interface IPagina {
    void suscribir(IUser user);
    void suscribir(IUser user, String video);
    void notificar(String post);
}
