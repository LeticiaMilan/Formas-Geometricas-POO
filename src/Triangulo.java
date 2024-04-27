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
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            System.out.println("A base do triângulo deve ser um valor positivo e não nulo.");
            return;
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("A altura do triângulo deve ser um valor positivo e não nulo.");
            return;
        }
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        if (lado1 <= 0) {
            System.out.println("O lado 1 do triângulo deve ser um valor positivo e não nulo.");
            return;
        }
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        if (lado2 <= 0) {
            System.out.println("O lado 2 do triângulo deve ser um valor positivo e não nulo.");
            return;
        }
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        if (lado3 <= 0) {
            System.out.println("O lado 3 do triângulo deve ser um valor positivo e não nulo.");
            return;
        }
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