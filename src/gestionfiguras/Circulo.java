package gestionfiguras;

public class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(String color, int x, int y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color " + getColor() + " en (" + getX() + ", " + getY() + ") con radio " + radio);
    }

    @Override
    public void rotable() {
        System.out.println("La figura fue rotada en las coordenadas (" + getX() + ", " + getY() + ") con radio " + radio);
    }
}
