public class Docente_linea extends Docente{
    public String contrato;

    public Docente_linea(String cedula, String nombre, String direccion, String correo,  String FacultadPertenece, String HorasAsignadaClases, String contrato) {
        super(cedula, nombre, direccion, correo, FacultadPertenece, HorasAsignadaClases);
        this.contrato = contrato;
    }

    @Override
    public void mostrarInformacionSinTelefono() {
        super.mostrarInformacionSinTelefono();
        System.out.println("Contrato: "+contrato);
    }
}
