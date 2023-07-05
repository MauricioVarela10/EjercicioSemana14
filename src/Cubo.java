import java.util.Scanner;

public class Cubo extends Figura{

    private double a, b, c, d;

    public boolean esCuadrado(){
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        b = listaPuntos.get(0).calcularDistancia(listaPuntos.get(2));
        c = listaPuntos.get(2).calcularDistancia(listaPuntos.get(3));
        d = listaPuntos.get(1).calcularDistancia(listaPuntos.get(3));
        if(a == b && a == c && a == d && b == c && b == d && c == d){
            return true;
        }
        return false;
    }

    @Override
    double calcularArea() {
        double area = 6*Math.pow(a,2);
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
            System.out.println("Ingrese la componente Z del punto " + i + ": ");
            double z = sc.nextDouble();
            listaPuntos.add(new Punto(x, y, z));
        }
    }

    @Override
    double calcularPerimetro() {
        a = listaPuntos.get(0).calcularDistancia(listaPuntos.get(1));
        double perimetro = 12*a;
        return perimetro;
    }
}