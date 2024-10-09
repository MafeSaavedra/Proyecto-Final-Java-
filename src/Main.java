import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Usar Locale para aceptar puntos
        boolean exit = false;

        // Agregar algunos estudiantes de ejemplo
        escuela.agregarEstudiante(new Estudiante("Luis", 1, 8.0));
        escuela.agregarEstudiante(new Estudiante("María", 2, 9.5));
        escuela.agregarEstudiante(new Estudiante("Julian", 3, 7.5));

        while (!exit) {
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = 0;
            // Validar que la opción sea un número entero
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el buffer del scanner
                continue; // Volver a mostrar el menú
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese número de identificación: ");
                    int id = scanner.nextInt();
                    double calificacion = 0.0;
                    // Manejo de la entrada de calificación
                    while (true) {
                        try {
                            System.out.print("Ingrese calificación: ");
                            calificacion = scanner.nextDouble();
                            break; // Salir del bucle si la entrada es válida
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número válido para la calificación.");
                            scanner.next(); // Limpiar el buffer del scanner
                        }
                    }
                    escuela.agregarEstudiante(new Estudiante(nombre, id, calificacion));
                    System.out.println("Estudiante agregado."); // Mensaje de confirmación
                    break;
                case 2:
                    System.out.print("Ingrese el número de identificación del estudiante: ");
                    int idBuscar = scanner.nextInt();
                    Estudiante estudiante = escuela.buscarEstudiante(idBuscar);
                    if (estudiante != null) {
                        System.out.println("Estudiante encontrado: " + estudiante.getNombre());
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
