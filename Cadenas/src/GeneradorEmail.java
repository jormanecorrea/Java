public class GeneradorEmail {
    public static void main(String[] args) {
        //EJERCICIO GENERADOR DE EMAIL
        var nombreUsuario = " Ubaldo Acosta Soto ";
        System.out.println("Nombre Usuario = " + nombreUsuario);
        var nombreEmpresa =  "Global Mentoring";
        System.out.println("Nombre Empresa = " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        
        var nombreUsuarioNormalizado = nombreUsuario.strip().toLowerCase().replace(" ", ".");
        var dominioEmailNormalizado = nombreEmpresa.toLowerCase().replace(" ", ".") + extensionDominio;
        var emailGenerado = nombreUsuarioNormalizado + "@" + dominioEmailNormalizado;
        System.out.println("El email Generado es: " + emailGenerado);
    }
}
