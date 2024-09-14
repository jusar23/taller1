class Usuario extends Persona {
    private int prestamos;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.prestamos = 0;
    }

    public int getPrestamos() {
        return prestamos;
    }

    public void incrementarPrestamos() {
        this.prestamos++;
    }

    public void decrementarPrestamos() {
        this.prestamos--;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Usuario: " + nombre + " " + apellido + " - Libros prestados: " + prestamos);
    }
}