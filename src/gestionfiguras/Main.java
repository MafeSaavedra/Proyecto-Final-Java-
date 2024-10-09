package gestionfiguras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema de Gestión de Figuras Geométricas");
            System.out.println("1. Crear Círculo");
            System.out.println("2. Crear Rectángulo");
            System.out.println("3. Crear Triángulo");
            System.out.println("4. Salir");

            System.out.println("Introduce un valor");
            int opcion = scanner.nextInt();
            if (opcion == 4) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.print("Ingrese el color: ");
            String color = scanner.next();

            System.out.print("Ingrese la coordenada X: ");
            int x = scanner.nextInt();
            System.out.print("Ingrese la coordenada Y: ");
            int y = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(color, x, y, radio);
                    circulo.dibujar();
                    System.out.println("Color: " + color);
                    System.out.println("Área: " + circulo.calcularArea());
                    System.out.println("Perímetro: " + circulo.calcularPerimetro());
                    break;
                case 2:
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    double altura = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(color, x, y, base, altura);
                    rectangulo.dibujar();
                    System.out.println("Color: " + color);
                    System.out.println("Área: " + rectangulo.calcularArea());
                    System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.print("Ingrese la base: ");
                    base = scanner.nextDouble();
                    System.out.print("Ingrese la altura: ");
                    altura = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(color, x, y, base, altura);
                    triangulo.dibujar();
                    System.out.println("Color: " + color);
                    System.out.println("Área: " + triangulo.calcularArea());
                    System.out.println("Perímetro: " + triangulo.calcularPerimetro());
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        scanner.close();
    }
}
