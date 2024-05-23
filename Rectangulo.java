package Tarea_U3_U4;

/**
 *
 * @author estef
 */
public class Rectangulo extends Figura {
    public Rectangulo(int coordenada_x, int coordenada_y, int ancho, int alto) { 
        super(coordenada_x, coordenada_y, ancho, alto);
    }

    @Override
    public void calcularArea() {
        double area = getAncho() * getAlto();
        setArea(area);
    }
}
