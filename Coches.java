package tema_3_4;

/**
 *
 * @author estef
 */
public class Coches
{
    private String modelo;

    public Coches()
    {
    }

    public Coches(String modelo)
    {
        this.modelo = modelo;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String visualizaModelo()
    {
        return "Modelo= "+this.modelo+" \n";
    } 
}
