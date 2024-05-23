
package tema_3_4;

/**
 *
 * @author THINKPAD
 */
public class A extends W {
    
    public int a;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }

    public A(int a, int w) {
        super(w);
        this.a = a;
    }
     @Override
     public String view(){
         return super.view()+"| A: "+a;
     }
     public void propio_A(){
         System.out.println("soy el metodo de la clase A");
     }
        @Override
    public void beber(){
        System.out.println("Estas bebiendo coca");
    }
}
