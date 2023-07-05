import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean opcionsalir;
        List<Figura> figuras = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese la figura que desee calcular perimetro y area: ");
            System.out.println("a: Triangulo");
            System.out.println("b: Cuadrado");
            System.out.println("c: Circulo");
            System.out.println("d: Cubo");
            System.out.println("e: Esfera");
            System.out.println("f: Piramide");
            System.out.println("g: Lista de Figuras");
            System.out.println("h: salir");
            String input = sc.next();
            opcionsalir = true;
            switch (input) {
                case "a":
                    Triangulo tr = new Triangulo();
                    tr.ingresarPuntos();
                    System.out.println("El perimetro del triangulo es: " + tr.calcularPerimetro());
                    System.out.println("El area del triangulo es: " + tr.calcularArea());
                    figuras.add(tr); //Añadir figura a la lista
                    break;
                case "b":
                    Cuadrado cua = new Cuadrado();
                    cua.ingresarPuntos();
                        System.out.println("El perimetro del cuadrado es: " + cua.calcularPerimetro());
                        System.out.println("El area del cuadrado es: " + cua.calcularArea());
                    figuras.add(cua);

                    break;
                case "c":
                    Circulo cr = new Circulo();
                    cr.ingresarPuntos();
                    System.out.println("El perimetro del circulo es: " + cr.calcularPerimetro());
                    System.out.println("El area del circulo es: " + cr.calcularArea());
                    figuras.add(cr);
                    break;
                case "d":
                    Cubo cu = new Cubo();
                    cu.ingresarPuntos();
                    System.out.println("El perimetro del cubo es: " + cu.calcularPerimetro());
                    System.out.println("El area del cubo es: " + cu.calcularArea());
                    figuras.add(cu);
                    break;
                case "e":
                    Esfera es = new Esfera();
                    es.ingresarPuntos();
                    System.out.println("El volumen del circulo es: " + es.calcularPerimetro());
                    System.out.println("El area del circulo es: " + es.calcularArea());
                    figuras.add(es);
                    break;
                case "f":
                    Piramide pr = new Piramide();
                    pr.ingresarPuntos();
                    System.out.println("El perimetro de la Piramide es: " + pr.calcularPerimetro());
                    System.out.println("El area de la Piramide es: " + pr.calcularArea());
                    figuras.add(pr);
                    break;
                case "g":
                    System.out.println("Lista de figuras ingresadas:");
                    if (figuras.isEmpty()) {
                        System.out.println("No se ha ingresado ninguna figura.");
                    } else {
                        int numFilas = figuras.size(); //Numero de Figuras Ingresadas
                        System.out.println("Figura\tPerímetro\tÁrea");
                        System.out.println("--------------------------------");
                        for (int i = 0; i < numFilas; i++) {
                            Figura figura = figuras.get(i);
                            System.out.printf("%s\t%.2f\t\t%.2f\n",
                                    figura.getClass().getSimpleName(),
                                    figura.calcularPerimetro(),
                                    figura.calcularArea()); //Formato Matriz "%s\t%.2f\t\t%.2f\n" tab, 2 decimales, salto de linea
                        }
                    }
                    break;
                default:
                    opcionsalir = false;
                    break;
            }
        } while (opcionsalir);
    }
}