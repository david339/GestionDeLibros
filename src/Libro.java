public class Libro {

    // Atributos (encapsulados con private)
    private String titulo;
    private String autor;
    private String isbn;
    private int yearPublicacion;

    // Constructor
    public Libro(String titulo, String autor, String isbn, int yearPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.yearPublicacion = yearPublicacion;
    }

    // Métodos getters y setters (para acceder/modificar atributos)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Más métodos según necesidad (ej: mostrar información)
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
