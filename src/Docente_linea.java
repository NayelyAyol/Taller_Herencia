public class Docente_linea extends Docente{
    public String contrato;

    public Docente_linea(String cedula, String nombre, String direccion, String correo, String telefono, String FacultadPertenece, String HorasAsignadaClases, String contrato) {
        super(cedula, nombre, direccion, correo, telefono, FacultadPertenece, HorasAsignadaClases);
        this.contrato = contrato;
    }

    public Docente_linea(String cedula, String nombre, String direccion, String correo,  String FacultadPertenece, String HorasAsignadaClases, String contrato) {
        super(cedula, nombre, direccion, correo, FacultadPertenece, HorasAsignadaClases);
        this.contrato = contrato;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Contrato: "+contrato);
    }
}
