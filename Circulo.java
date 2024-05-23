package Tarea_U3_U4;

/**
 *
 * @author estef
 */
public class Circulo extends Figura{
     private int radio;

    public Circulo(int coordenada_x, int coordenada_y, int radio) {
        super(coordenada_x, coordenada_y, radio, radio); // El ancho y alto son iguales al radio
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        setArea(area);
    }
}
