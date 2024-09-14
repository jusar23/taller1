# taller1

1. Clases y Herencia: La clase abstracta Persona se utiliza como base para Usuario y Bibliotecario, proporcionando un método mostrarDatos personalizado para cada tipo de persona.

2. Encapsulamiento: La clase Libro mantiene sus atributos privados y proporciona métodos de acceso controlados, asegurando que la disponibilidad solo pueda modificarse internamente mediante los métodos prestar() y devolver().

3. Polimorfismo: El método prestarLibro en Bibliotecario se sobrecarga para manejar préstamos de libros y validar las condiciones de préstamo para cada usuario.

4. Interfaces y Abstracción: La interfaz Gestionable define los métodos necesarios para gestionar préstamos y devoluciones, implementados en la clase Bibliotecario.

5. Cohesión y Acoplamiento: Cada clase tiene un propósito claro, y las interacciones se realizan a través de métodos definidos y una interfaz, asegurando bajo acoplamiento.

6. Comparativa de Paradigmas: Se utiliza tanto la Programación Orientada a Objetos como la Programación Funcional para contar el total de libros prestados.
