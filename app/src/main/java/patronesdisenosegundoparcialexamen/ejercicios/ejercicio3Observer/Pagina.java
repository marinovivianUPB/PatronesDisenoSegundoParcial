package patronesdisenosegundoparcialexamen.ejercicios.ejercicio3Observer;

import java.util.ArrayList;
import java.util.List;

public class Pagina implements IPagina {

    private List<IUser> todo = new ArrayList<>();
    private List<IUser> video = new ArrayList<>();

    @Override
    public void notificar(String post) {
        System.out.println("------------------ACTUALIZACION DE LA PAGINA------------------------");
        if(post.equals("video")){
            video.stream().forEach(a -> a.notificacion("SE HA POSTEADO UN NUEVO VIDEO"));
            todo.stream().forEach(a -> a.notificacion("SE HA POSTEADO UN NUEVO VIDEO"));
        } else{
            todo.stream().forEach(a -> a.notificacion("SE HA POSTEADO UNA NUEVA IMAGEN"));
        }
    }

    @Override
    public void suscribir(IUser user) {
        todo.add(user);
    }

    @Override
    public void suscribir(IUser user, String video) {
        if(video.equals("video")){
            this.video.add(user);
        }   
    }
    
}
