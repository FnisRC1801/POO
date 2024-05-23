package tema_3_4;

public class Arreglos
{

    char arr[];
    int z;

    public Arreglos()
    {
        this.arr = null;
    }

    public Arreglos(char[] arr)
    {
        this.arr = arr;
    }

    public Arreglos(int z)
    {
        this.arr = new char[z];
        cargarDatos();
    }

    public Arreglos(int z, char c, char ...arr)
    {
        this.arr = arr;
        this.z = z;
    }

    private void cargarDatos()
    {
        int i = 0;
        while (i < arr.length)
        {
            int c;
            do
            {
                c = (int) (Math.random() * 1000);
            } while (c < 65 || c > 91);
            arr[i] = (char) c;
            i++;
        }
    }
    public void mostrar()
    {
        for (int k = 0; k < arr.length; k++)
        {
            System.out.println("arr["+k+"]: "+this.arr[k]);
        }
    }
}


