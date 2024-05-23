package tema_3_4_interfaces_02;

/**
 *
 * @author THINKPAD
 */
public class ManipulaElectronico<T> {

    public void VerificarInsatancia(T a) {
        if (a instanceof Computadora) {
            ((Computadora) a).encender();
        } else {
            if (a instanceof Licuadora) {
                Licuadora obj = (Licuadora) a;
                obj.encender();
            }
        }
    }
}
