import interfaces.Forma;

public class Triangulo implements Forma {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        if (base <= 0 || altura <= 0 || lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Os valores da base, altura e dos lados do triângulo devem ser positivos e não nulos.");
        }
        
        if (!verificarTriangulo(base, lado1, lado2, lado3)) {
            System.out.println("Os valores dos lados não formam um triângulo válido.");
        }
        
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularArea() {
        double area = (this.base * this.altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = this.lado1 + this.lado2 + this.lado3;
        System.out.println("Perímetro do triângulo: " + perimetro);
    }
    
    private boolean verificarTriangulo(double base, double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > base) && (lado1 + base > lado2) && (lado2 + base > lado1);
    }
}