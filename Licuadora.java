
package tema_3_4_interfaces_02;

public class Licuadora extends Electronico implements MiInterfaz {
    private int velocidad;

public Licuadora(){}

    public Licuadora(int velocidad, double voltaje, String marca, String tipo) {
        super(voltaje, marca, tipo);
        this.velocidad = velocidad;
    }



    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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
