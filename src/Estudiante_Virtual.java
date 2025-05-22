public class Estudiante_Virtual extends Estudiante{
    public String plataforma;
    public String tutor;

    public Estudiante_Virtual(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, String plataforma, String tutor){
        super(cedula, nombre,  direccion, correo, telefono, carrera,nivel);
        this.plataforma=plataforma;
        this.tutor=tutor;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Plataforma: "+plataforma+"\nTutor: "+tutor);
    }

    @Override
    public int calculoEdad(int anio_nacimiento, int anio_actual) {
        return super.calculoEdad(anio_nacimiento, anio_actual);
    }
}
