
package Tarea_U3_U4;

/**
 *
 * @author estef
 */
public abstract class Figura {
    
    private int coordenada_x;
    private int coordenada_y;
    private int ancho;
    private int alto;
    private double perimetro;
    private double area;

    // Constructor 
    public Figura(int coordenada_x, int coordenada_y, int ancho, int alto) {
        this.coordenada_x = coordenada_x;
        this.coordenada_y = coordenada_y;
        this.ancho = ancho;
        this.alto = alto;
    }

    // Getters y Setters
    
    //_______________________________________________________ //
    
    public int getCoordenada_x() {
        return coordenada_x;
    }
    public void setCoordenada_x(int coordenada_x) {
        this.coordenada_x = coordenada_x;
    }

    //_______________________________________________________ //
    
    public int getCoordenada_y() {
        return coordenada_y;
    }
    public void setCoordenada_y(int coordenada_y) {
        this.coordenada_y = coordenada_y;
    }

    //_______________________________________________________ //
    
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    //_______________________________________________________ //
    
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }

    //_______________________________________________________ //
    
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //_______________________________________________________ //
    
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    
    // Método abstracto para calcular el área 
    public abstract void calcularArea();

}
