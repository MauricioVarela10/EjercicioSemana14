import java.util.Scanner;

public class Piramide extends Figura {

    private double a, b, c;
    private double h;

    @Override
    double calcularArea() {
        double area = a * (a + Math.sqrt(4 * Math.pow(h, 2) + Math.pow(a, 2)));
        return area;
    }

    @Override
    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese la componente X del punto " + i + ": ");
            double x = sc.nextDouble();
            System.out.println("Ingrese la componente Y del punto " + i + ": ");
            double y = sc.nextDouble();
            System.out.println("Ingrese la componente Z del punto " + i + ": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x, y, z));
        }
    }

    @Override
    double calcularPerimetro() {
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        b = listaPuntos.get(0).calcularDistancia(listaPuntos.get(2));
        c = listaPuntos.get(1).calcularDistancia(listaPuntos.get(2));
        double perimetro = a + b + c;
        return perimetro;
    }
}
