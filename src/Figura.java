import java.util.ArrayList;
import java.util.List;

public abstract class Figura {
    List<Punto> listaPuntos = new ArrayList<>();

    abstract double calcularArea();

    abstract void  ingresarPuntos();

    abstract double calcularPerimetro();
}

