package tema_3_4;

/**
 *
 * @author kike
 */
public class Prueba_escuela {

    public static void main(String[] args) {
        //crear los objetos de las clases hijas
        // Clase_hija nomObj = new Clase_Hija(parametros)
        Alumno objAlu = new Alumno("TIC's", 3, 1
        ,"Julian", "Hernández","22");
        
        objAlu.asistencia();//metodo heredado
        objAlu.verCalificaciones(); //metodo no heredado
    }
    
}
