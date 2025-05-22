public class Main {
    public static void main(String[] args) {
        System.out.println("----INFORMACION ESTUDIANTE----\n");
        Estudiante estudiante1=new Estudiante("1756120489","Nayely Ayol", "La Ecuatoriana", "nayelyayol9@gmail.com","0989767865","Desarrollo de software","Tercer Semestre");
        estudiante1.mostrarInformacion();
        System.out.println("Edad calculada: " + estudiante1.calculoEdad(1990, 2025));

        System.out.println("\n----INFORMACION DOCENTE----\n");
        Docente docente1=new Docente("1735263782","Santiago Linares","Solanda", "santiago10@gmail.com", "0893756273","ESFOT", "10");
        docente1.mostrarInformacion();
        System.out.println("\n-------DOCENTE EN LINEA------\n");
        Docente_linea doc_lin1=new Docente_linea("1746382765", "Jonathan Hardford","Guayaquil","jonathan@gmail.com","Geometria","20","Finalizado");
        doc_lin1.mostrarInformacionSinTelefono();

        System.out.println("\n----INFORMACION ESTUDIANTE PRESENCIAL----\n");
        Estudiante_Presencial es_pre1=new Estudiante_Presencial("1725364920", "Liam Vega","El Valle", "liam@gmail.com","0998756754","Medicina","Cuarto Semestre",5,"Mañana");
        es_pre1.mostrarInformacion();
        System.out.println("Edad calculada: " + es_pre1.calculoEdad(2000, 2025));

        System.out.println("\n----INFORMACION ESTUDIANTE VIRTUAL----\n");
        Estudiante_Virtual es_vir1=new Estudiante_Virtual("1826372893","Diana Mendoza","Los Chillos", "diana@gmail.com","0987986543", "Diseño", "Quinto semestre", "Edmodo", "Liliana Saenz");
        es_vir1.mostrarInformacion();
        System.out.println("Edad calculada: " + es_vir1.calculoEdad(2001, 2025));
    }
}