import java.util.Scanner;

public class Cuadrado extends Figura{

    private double a;

    @Override
    double calcularArea() {
        double area = a*a;
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Ingrese la componente X del punto " + i + ": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto " + i + ": ");
            double y = sc.nextDouble();
            listaPuntos.add(new Punto(x, y, 0)); // Z es 0 porque no utilizamos la componente z para figuras en 2 dimensiones
        }
    }

    @Override
    double calcularPerimetro() {
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        double perimetro = a*4;
        return perimetro;
    }
}
