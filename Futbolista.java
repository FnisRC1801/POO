
package examen.u3.u4;
 
//Sandy 

public class Futbolista extends Persona implements Concentrarse{
   private int dorsal;  
   
   public Futbolista(int id, String nombre, int edad, int dorsal) {
        super(id, nombre, edad);
        this.dorsal = dorsal;
    }
   

    public int getDorsal() {
        return dorsal;
    }

  
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
 
   @Override
    public void concentrarse() {
        System.out.println(nombre + " esta concentrandose para el partido");
    }


    public void viajar() {
        System.out.println(nombre + " esta viajando para el proximo partido");
    }

    public void entrenar() {
        System.out.println(nombre + " esta entrenando para el proximo partido");
    }  
   
}
