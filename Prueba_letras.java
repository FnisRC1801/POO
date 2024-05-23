
package tema_3_4;

/**
 *
 * @author THINKPAD
 */
public class Prueba_letras {

    public static void main(String[] args) {
       int i;
        Object arr[]=new W[3];
        arr[0]=new A();
        arr[1]=new A();
        arr[2]=new D();
        
        ((W)arr[0]).propio_w();
        ((A)arr[1]).propio_A();
        ((D)arr[2]).propio_d();
       i=0;
        do {
            System.out.println("arr["+i+"]= "+((W)arr[i]).view());            
            i++;
            
            
        } while (i<arr.length);
        D obj=new D(3,2,1);
        System.out.println("Clase D:\n"+obj.view());
        for (int j = 1; j < arr.length; j++) {
            ((W)arr[j]).beber();
            
        }
       
    }
    
}
