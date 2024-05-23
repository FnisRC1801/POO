package tarea_3_4;

/**
 *
 * @author estef
 */
public class Pb_Clave
{

    public static void main(String[] args)
    {

        Clave objClave = new Clave();//->Inicializamos el objeto

        objClave.leer(); //->Aplicamos el leer   
        System.out.println("Su clave generada es: " + objClave.mostrar());//-> Mostramos resultado :D
        objClave.repetir();
        

    }
    

}
