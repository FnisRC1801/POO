package tarea_3_4;

/**
 *
 * @author estef
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clave
{

    Scanner leer = new Scanner(System.in);
    private long numero;
    private char letra;

    public Clave()
    {
        this.letra = ' ';
        this.numero = 0;
    }

    public Clave(long numero)
    {
        this.numero = numero;
        this.letra = numletra();

    }

    //________________________________________________________________________________________//
    public long getNumero()
    {
        return numero;
    }

    public void setNumero(long numero)
    {
        this.numero = numero;
        this.letra = numletra();
    }

    public char getLetra()
    {
        return letra;
    }

    public void setLetra(char letra)
    {
        this.letra = letra;
    }
    //________________________________________________________________________________________//

    public void leer() //->El metodo que leera los numeros dados
    {
        boolean numeroValido = false;

        while (!numeroValido) //->Esto nos ayuda en caso de que no pongan algo valido regrese a ingrese cifra
        {
            System.out.println("---------------------------------------");
            System.out.print("Ingrese una cifra de maximo 8 digitos: ");
            System.out.println("");

            try //Un try en caso de que ingrese letras em vez de numeros :)
            {
                this.numero = leer.nextLong();

                if (String.valueOf(this.numero).length() > 8) //-> Un if en caso que se pase del limite de 8 datos
                {
                    System.out.println("---------------------------------------");
                    System.out.println("Exceso de numeros, porfavor vuelva a intentar!!!!");
                    
                } else
                {
                    numeroValido = true;
                    this.letra = numletra();//->Esto nos ayudara a que designe una letra al numero dado
                }

            } catch (InputMismatchException e)//->El mensaje que dara si pone letras en vez de numeros
            {

                leer.next();
                System.out.println("---------------------------------------");
                System.out.println("Solo se aceptan numeros enteros :(");
            }
        }
    }
    //________________________________________________________________________________________//

    public String mostrar()
    {
        String formato = "%08d-%c";
        return String.format(formato, numero, letra);
    }

    //________________________________________________________________________________________//
    private char numletra()
    { //->Finalente lo que nos forma el estilo de codigo "NNNNNNNN-L"
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return letras.charAt((int)(numero % 26));
    }
    
    //________________________________________________________________________________________//

    public void repetir()//->Esto nos ayuda a que se repita
    {
        Clave ejemplo = new Clave();
        boolean continuar = true;
        while (continuar)
        {
            ejemplo.leer();
            System.out.println("Su clave generada es: " + ejemplo.mostrar());
        }
    }

}
