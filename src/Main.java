//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Instanciación de objetos
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "123-456", 1967);
        Libro libro2 = new Libro("1984", "George Orwell", "789-012", 1949);

        // Uso de métodos
        libro1.mostrarInfo();
        libro2.setTitulo("1984 (Edición Especial)");
        System.out.println("Nuevo título: " + libro2.getTitulo());

    }
}