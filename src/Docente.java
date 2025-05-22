public class Docente extends Persona{
    public String FacultadPertenece;
    public String HorasAsignadaClases;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String FacultadPertenece, String HorasAsignadaClases){
        super(cedula, nombre, direccion,correo, telefono);
        this.FacultadPertenece=FacultadPertenece;
        this.HorasAsignadaClases=HorasAsignadaClases;
    }

    public Docente(String cedula, String nombre, String direccion, String correo, String FacultadPertenece, String HorasAsignadaClases){
        this.cedula=cedula;
        this.nombre=nombre;
        this.direccion=direccion;
        this.correo=correo;
        this.FacultadPertenece=FacultadPertenece;
        this.HorasAsignadaClases=HorasAsignadaClases;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad: "+FacultadPertenece+"\nHoras: "+HorasAsignadaClases);
    }
}
