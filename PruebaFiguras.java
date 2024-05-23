package Tarea_U3_U4;
/**
 *
 * @author estef
 */
public class PruebaFiguras {
    
    public static void main(String[] args) {
         
        Triangulo trian = new Triangulo(0, 0, 20, 36);
        Rectangulo rect = new Rectangulo(0, 0, 19, 14);
        Circulo circ = new Circulo(0, 0, 32);
        
        trian.calcularArea();
        rect.calcularArea();
        circ.calcularArea();
        
        // Mostrar las áreas
        System.out.println("      AREA DE LAS FIGURAS      ");
        System.out.println("");   
        System.out.println("Triangulo: "+ trian.getArea()+" unidades cuadradas");
        System.out.println("Rectangulo: "+ rect.getArea()+" unidades cuadradas");
        System.out.println("Circulo: "+ circ.getArea()+" unidades cuadradas");
    }
}