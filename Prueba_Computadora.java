package tema_3_4_interfaces_02;

/**
 *
 * @author THINKPAD
 */
public class Prueba_Computadora {


    public static void main(String[] args) {
        Computadora objCompu = new Computadora("s400", 5,
                "hp", "laptop");
        System.out.println(objCompu.toString());
        objCompu.encender();
        
        System.out.println(" ");
        
        Licuadora objLicua = new Licuadora(100, 10,
                "oster","Licuadora");
        objLicua.encender();
        System.out.println(objLicua.toString());
        Computadora arr[]=new Computadora[2];
        arr[0]=new Computadora("re",4,"hp","Desktop");
        arr[1]=new Computadora("fa",5,"asus","Laptop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
        ManipulaElectronico me= new ManipulaElectronico();
        me.VerificarInsatancia(new Licuadora());
        System.out.println("\n\nCiclo con new String: \n\n");
        for (int i = 0; i < arr.length; i++) {
            me.VerificarInsatancia(new String ());  
        }
        
    }
    
}
