public class Persona {
    public String cedula;
    public String nombre;
    public String direccion;
    public String correo;
    public String telefono;

    public Persona(String cedula, String nombre, String direccion, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Persona(String cedula, String nombre, String direccion, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }

    public void mostrarInformacion(){
        System.out.println("DATOS PERSONALES:\n\nCedula: "+cedula+"\nNombre: "+nombre+"\nDireccion: "+direccion+"\nCorreo: "+correo+"\nTelefono: "+telefono);
    }

    public void mostrarInformacionSinTelefono(){
        System.out.println("DATOS PERSONALES:\n\nCedula: "+cedula+"\nNombre: "+nombre+"\nDireccion: "+direccion+"\nCorreo: "+correo);
    }
}
