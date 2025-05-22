public class Docente extends Persona{
    public String FacultadPertenece;
    public String HorasAsignadaClases;

    public Docente(String cedula, String nombre, String direccion, String correo, String telefono, String FacultadPertenece, String HorasAsignadaClases){
        super(cedula, nombre, direccion,correo, telefono);
        this.FacultadPertenece=FacultadPertenece;
        this.HorasAsignadaClases=HorasAsignadaClases;
    }

    public Docente(String cedula, String nombre, String direccion, String correo, String FacultadPertenece, String HorasAsignadaClases) {
        super(cedula, nombre, direccion, correo);
        this.FacultadPertenece=FacultadPertenece;
        this.HorasAsignadaClases=HorasAsignadaClases;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad: "+FacultadPertenece+"\nHoras: "+HorasAsignadaClases);
    }

    @Override
    public void mostrarInformacionSinTelefono() {
        super.mostrarInformacionSinTelefono();
        System.out.println("Facultad: "+FacultadPertenece+"\nHoras: "+HorasAsignadaClases);
    }
}
