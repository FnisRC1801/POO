package tema_3_4;

/**
 *
 * @author estef
 */
public class Arreglos02<T>
{

    T[] g;
    int f; //->Declarar variable es tipo de dato + nombre

    public Arreglos02()
    {
        this.g = null;
    }

    public Arreglos02(T[] g)
    {
        this.g = g;
    }

    public Arreglos02(int f, T... g)
    {
        this.g = g;
        this.f = f;
    }

    public Arreglos02(int f, int opc)
    {
        if (opc == 1)
        {
            this.g = (T[]) new Coches[f];
            insertarCoches();

        } else
        {
            this.g = (T[]) new Celulares[f];
            insertarCelulares();
        }
    }

    public void insertarCoches()
    {
        int i = 0;

        while (i < this.g.length)
        {
            this.g[i] = (T) new Celulares();
            i++;
        }
    }

    public void insertarCelulares()
    {
        int i = 0;

        do
        { //-> Para cambiar un while a un do while solo se mueve el while abajo y se colca el do
            this.g[i] = (T) new Celulares();
            i++;
        } while (i < this.g.length);
    }

    public void mostrarInfo()
    {
        int i;
        System.out.println("f: " + this.f);
        System.out.println("___________________\n");
        for (i = 0; i < this.g.length; i++)
        {
            if (this.g[i] instanceof Coches)
            {
                System.out.println("g[" + i + "]= " + ((Coches) this.g[i]).visualizaModelo());
            } else
            {
                if (this.g[i] instanceof Celulares)
                {
                    System.out.println("g[" + i + "]= " + ((Celulares) this.g[i]).visualizaNombre());
                }
            }

        }
    }
}
/**
 * Estructuras basicas FOR = for (in ; comp; inc) WHILE: in; while(comparacion)
 * { i++ } IF: if( w== true) if (w)
 */
