package patronesdisenosegundoparcialexamen.ejercicios.ejericio4Strategy;

public class Estudiante {
    private String nombre;
    private String ci;
    private String fechaNacimiento;
    private String carrera;

   
    

    public Estudiante(String nombre, String ci, String fechaNacimiento, String carrera) {
        this.nombre = nombre;
        this.ci = ci;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCi() {
        return ci;
    }
    public void setCi(String ci) {
        this.ci = ci;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void show(){
        System.out.println("---------------------");
        System.out.println("Nombre: "+nombre);
    }
    
}
