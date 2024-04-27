import interfaces.Forma;

public class Retangulo implements Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            System.out.println("A base e a altura do retângulo devem ser valores positivos e não nulos.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("A base do retângulo deve ser um valor positivo e não nulo.");
            return;
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("A altura do retângulo deve ser um valor positivo e não nulo.");
            return;
        }
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = this.base * this.altura;
        System.out.println("Área do retângulo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = 2 * (this.base + this.altura);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}