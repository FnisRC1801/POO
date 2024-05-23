
package examen.u3.u4;

//Sandy 
public class Entrenador extends Persona implements Concentrarse{
    private String federacion;

    public Entrenador(int id, String nombre, int edad, String federacion) {
        super(id, nombre, edad);
        this.federacion = federacion;
    }

    public String getFederacion() {
        return federacion;
    }

  
    public void setFederacion(String federacion) {
        this.federacion = federacion;
    }
    
   
    @Override
    public void concentrarse() {
        System.out.println(nombre + " esta concentrandose para la estrategia del equipo");
    }

    
    public void viajar() {
        System.out.println(nombre + " esta viajando con el equipo para el proximo partido");
    }

    
    public void dirigir() {
        System.out.println(nombre + " estadirigiendo el entrenamiento del equipo");
    }
}
