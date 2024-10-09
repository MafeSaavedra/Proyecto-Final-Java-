package gestionfiguras;

public class Triangulo extends Figura implements Movible, Dibujable {
    private double base;
    private double altura;

    public Triangulo(String color, int x, int y, double base, double altura) {
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Para el perímetro, asumimos un triángulo isósceles (como ejemplo simple)
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return 2 * lado + base;
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
        System.out.println("Estoy dibujando un Triángulo en las coordenadas (" + getX() + ", " + getY() + ")");
    }

    @Override
    public void rotable() {
        System.out.println("Rotando el Triángulo.");
    }
}
