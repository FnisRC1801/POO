
package tema_3_4;

/**
 *
 * @author THINKPAD
 */
interface MiInterface{
    public void beber ();
    public void propio();
}
public abstract class W implements MiInterface{
    public int w;

    public W() {//constructor predeterminado sin argumentos o parametros
    }

    public W(int w) {//constructor con argumentos o parametros
        this.w = w;
    }
    public String view(){
    return "| W: "+this.w;
    }
    
    public void propio_w(){
        System.out.println("Soy el metodo de a clase W");
    }

    @Override
           public void beber(){
               System.out.println("bebeeer ");
           }
    @Override
           public void propio(){
               System.out.println("propiooo W");
           }
     
     
    

}

