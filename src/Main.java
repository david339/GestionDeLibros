import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String tituloLibro1 ="";
        tituloLibro1 = entrada.nextLine();

        // Instanciación de objetos
        Libro libro1 = new Libro(tituloLibro1, "Gabriel García Márquez", "123-456", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", "789-012", 1949);

        // Uso de métodos
        libro1.mostrarInfo();
        libro2.setTitulo("1984 (Edición Especial)");
        System.out.println("Nuevo título: " + libro2.getTitulo());

    }
}