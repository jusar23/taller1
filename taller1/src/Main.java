public class Main {
    public static void main(String[] args) {
        // Crear instancias
        Usuario usuario1 = new Usuario("María", "González");
        Bibliotecario bibliotecario1 = new Bibliotecario("Carlos", "Pérez");
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "987654321");

        // Mostrar datos iniciales
        bibliotecario1.mostrarDatos();
        usuario1.mostrarDatos();

        // Simular préstamo y devolución de libros
        bibliotecario1.prestarLibro(libro1, usuario1);
        usuario1.mostrarDatos();
        bibliotecario1.devolverLibro(libro1, usuario1);
        usuario1.mostrarDatos();

        // Contar el total de libros prestados (POO)
        int totalLibrosPrestados = (libro1.isDisponible() ? 0 : 1) + (libro2.isDisponible() ? 0 : 1);
        System.out.println("Total de libros prestados (POO): " + totalLibrosPrestados);

        // Contar el total de libros prestados (Funcional)
        Libro[] libros = {libro1, libro2};
        long totalLibrosPrestadosFuncional = java.util.Arrays.stream(libros)
                .filter(libro -> !libro.isDisponible())
                .count();
        System.out.println("Total de libros prestados (Funcional): " + totalLibrosPrestadosFuncional);
    }
}
