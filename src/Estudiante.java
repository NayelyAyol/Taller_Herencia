public class Estudiante extends Persona{
    public String carrera;
    public String nivel;

    public Estudiante(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel){
        super(cedula, nombre, direccion, correo, telefono);
        this.carrera=carrera;
        this.nivel=nivel;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: "+carrera+"\nNivel: "+nivel);
    }

    public int calculoEdad(int anio_nacimiento, int anio_actual){
        return (anio_actual-anio_nacimiento);
    }
}
