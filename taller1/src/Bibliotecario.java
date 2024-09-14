class Bibliotecario extends Persona implements Gestionable {
    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Bibliotecario: " + nombre + " " + apellido);
    }

    @Override
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (usuario.getPrestamos() < 3 && libro.isDisponible()) {
            usuario.incrementarPrestamos();
            libro.prestar();
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado al usuario " + usuario.nombre);
        } else {
            System.out.println("No se puede prestar el libro. El usuario ha alcanzado el máximo de préstamos o el libro no está disponible.");
        }
    }

    @Override
    public void devolverLibro(Libro libro, Usuario usuario) {
        if (usuario.getPrestamos() > 0 && !libro.isDisponible()) {
            usuario.decrementarPrestamos();
            libro.devolver();
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por el usuario " + usuario.nombre);
        } else {
            System.out.println("No se puede devolver el libro. El usuario no tiene préstamos activos o el libro ya está disponible.");
        }
    }
}
