import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el titulo del Libro: ");
        String tituloLibro1 = entrada.nextLine();

        // Instanciación de objetos
        Libro libro1 = new Libro(tituloLibro1, "Gabriel García Márquez", "123-456", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", "789-012", 1949);

        // Creación de un libro digital (subclase)
        LibroDigital libroDigital1 = new LibroDigital("El Principito Digital",
                "Antoine de Saint-Exupéry",
                "345-678", 1943,
                "EPUB", 2.5);

        // Uso de métodos
        libro1.mostrarInfo();
        libro2.setTitulo("1984 (Edición Especial)");
        System.out.println("Nuevo título: " + libro2.getTitulo());

        // Usando métodos de la subclase
        libroDigital1.mostrarInfo(); // Llama al método sobrescrito
        System.out.println("Formato del libro digital: " + libroDigital1.getFormato());
    }
}