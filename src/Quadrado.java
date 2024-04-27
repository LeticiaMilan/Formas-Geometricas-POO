import interfaces.Forma;

public class Quadrado implements Forma{
    private double lado;

    public Quadrado(double lado) {
        if (lado <= 0) {
            System.out.println("O lado do quadrado deve ser um valor positivo e não nulo.");
        }
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = Math.pow(this.lado, 2);
        System.out.println("Área do quadrado: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 4 * this.lado;
        System.out.println("Perímetro do quadrado: " + perimetro);
    }
}
