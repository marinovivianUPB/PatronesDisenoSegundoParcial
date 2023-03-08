package patronesdisenosegundoparcialexamen.ejercicios.ejercicio3Observer;

public class User implements IUser{

    private String name;

    

    public User(String name) {
        this.name = name;
    }

public void show(){
    System.out.println("-----------------------------------");
    System.out.println("USER NAME: "+name);
}

    @Override
    public void notificacion(String mensaje) {
        show();
        System.out.println("NOTIFICACION: "+mensaje);
        
    }
    
}
