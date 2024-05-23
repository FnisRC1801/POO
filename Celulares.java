
package tema_3_4;

/**
 *
 * @author estef
 */
public class Celulares
{
    private String nombre;

    public Celulares()
    {
    }

    public Celulares(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String visualizaNombre()
    {
        return "Nombre= "+this.nombre+" \n";
    } 
}