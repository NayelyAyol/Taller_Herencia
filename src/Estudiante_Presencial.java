public class Estudiante_Presencial extends Estudiante{
    public int hora_presencial;
    public String horario;

    public Estudiante_Presencial(String cedula, String nombre, String direccion, String correo, String telefono, String carrera, String nivel, int hora_presencial, String horario){
        super(cedula,nombre,direccion, correo,telefono, carrera, nivel);
        this.hora_presencial=hora_presencial;
        this.horario=horario;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Hora presencial: "+hora_presencial+"\nHorario: "+horario);
    }
}
