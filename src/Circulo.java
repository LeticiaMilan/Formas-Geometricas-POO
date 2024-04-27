import interfaces.Forma;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            System.out.println("O raio do círculo deve ser um valor positivo e não nulo.");
        }
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * Math.pow(this.raio, 2);
        System.out.println("Área do círculo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * Math.PI * this.raio;
        System.out.println("Perímetro do círculo: " + perimetro);
    }
}
