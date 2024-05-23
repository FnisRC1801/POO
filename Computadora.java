package tema_3_4_interfaces_02;

/**
 *
 * @author THINKPAD
 */
public class Computadora extends Electronico implements MiInterfaz{
    private String modelo;
    
    public Computadora(){   
   }

    public Computadora(String modelo, double voltaje, String marca, String tipo){
        super(voltaje, marca, tipo);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void ProcesoEncender() {
        System.out.println("Presiona el boton de encendido");
    }

    @Override
    public double calcularCantidad(double precio) {
        return precio*10;
    }

    @Override
    public void encender() {
        System.out.println("encendido");
    }

    @Override
    public void mostrar() {
        System.out.println("la computadora esta encendida");
    }






    





    
    
}
