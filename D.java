
package tema_3_4;

/**
 *
 * @author THINKPAD
 */
public class D extends A{
    public int d;

    public D() {
    }
    
    public D(int d) {
        this.d = d;
    }
    
    public D(int d, int a, int w) {
        super(a, w);
        this.d = d;
    } 
    @Override
    public String view(){
    return "| D: "+ d + super.view();
    }
    public String viewAll(){
    return "| W: "+w+" | A: "+a+"| D: "+d;
    
    }
    public void propio_d(){
        System.out.println("Soy el metodo de la clase D");
    }
    @Override
    public void beber(){
        System.out.println("Estas bebiendo pepsi");
    }

    
}
