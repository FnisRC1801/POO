
package examen.u3.u4;

//Sandy

public abstract class Persona {
    public int id;
    public String nombre;
    public int edad;

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
    

    public int getId() {
        return id;
    }

  
    public void setId(int id) {
        this.id = id;
    }

   
    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
