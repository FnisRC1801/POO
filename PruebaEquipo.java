
package examen.u3.u4;

//Sandy 

public class PruebaEquipo {

    
    public static void main(String[] args) {
        
        
        Futbolista futbolista = new Futbolista(1, " Diego ", 25, 10);
        Entrenador entrenador = new Entrenador(2, " Marcos ", 45, "Federación Nacional");

     
     
        System.out.println("Prueba Futbolista:");
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.entrenar();

        System.out.println("\nPrueba Entrenador:");
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.dirigir();
    }
    
}
