package Tarea_U3_U4;
/**
 *
 * @author estef
 */
public class Triangulo extends Figura {
    public Triangulo(int coordenada_x, int coordenada_y, int base, int altura) {
        super(coordenada_x, coordenada_y, base, altura);
    }

    @Override
    public void calcularArea() {
        double area = 0.5 * getAncho() * getAlto();
        setArea(area);
    }
}
