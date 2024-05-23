
package tema_3_4_interfaces_02;

/**
 *
 * @author THINKPAD
 */
public abstract class Electronico {
    private double voltaje;
    private String marca;
    private String tipo;

    public Electronico() {
    }

    public Electronico(double voltaje, String marca, String tipo) {
        this.voltaje = voltaje;
        this.marca = marca;
        this.tipo = tipo;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public abstract void ProcesoEncender();
    
    @Override
    public String toString(){
    return "Electronicos \n"+"| Voltaje: "+voltaje+
            "| Marca: "+marca+"| Tipo: "+tipo;
    }
    
    
}
