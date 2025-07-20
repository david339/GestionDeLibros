public class LibroDigital extends Libro {
    // Nuevos atributos específicos para libros digitales
    private String formato; // PDF, EPUB, MOBI, etc.
    private double tamanioMB; // Tamaño del archivo en megabytes

    // Constructor
    public LibroDigital(String titulo, String autor, String isbn, int yearPublicacion,
                        String formato, double tamanioMB) {
        // Llamada al constructor de la clase padre (Libro)
        super(titulo, autor, isbn, yearPublicacion);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    // Métodos específicos para libros digitales
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    public void setTamanioMB(double tamanioMB) {
        this.tamanioMB = tamanioMB;
    }

    // Sobrescritura del método mostrarInfo para incluir información digital
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método de la clase padre
        System.out.println("Formato: " + formato + ", Tamaño: " + tamanioMB + " MB");
    }
}
