package gestionfiguras;

public class Rectangulo extends Figura implements Movible, Dibujable {
    private double base;
    private double altura;

    public Rectangulo(String color, int x, int y, double base, double altura) {
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void moverHorizontalmente(int distancia) {
        setX(getX() + distancia);
    }

    @Override
    public void moverVerticalmente(int distancia) {
        setY(getY() + distancia);
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un Rectángulo en las coordenadas (" + getX() + ", " + getY() + ")");
    }

    @Override
    public void rotable() {
        System.out.println("Rotando el Rectángulo.");
    }
}
