import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        Circulo circulo = new Circulo(raio);
        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo(base, altura);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        Quadrado quadrado = new Quadrado(lado);
        quadrado.calcularArea();
        quadrado.calcularPerimetro();

        System.out.print("Digite a base do triângulo: ");
        base = scanner.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        altura = scanner.nextDouble();
        System.out.print("Digite o lado 1 do triângulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o lado 2 do triângulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o lado 3 do triângulo: ");
        double lado3 = scanner.nextDouble();
        Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();

        scanner.close();
    }
}
