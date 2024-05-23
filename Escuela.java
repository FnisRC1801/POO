package tema_3_4;

public class Escuela {

    // #--> protegido(protected)
    // + -->publico
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String edad;

    public Escuela(int id, String nombre, String apellidos, String edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void asistencia() {
        System.out.println("Asistencia: "+this.getNombre()
                +" "+this.getApellidos()+" !!!");
    }

}
//     hija  hereda de padre

class Alumno extends Escuela {

    // - >> private(privado)
    private String carrera;
    private int semestre;

    public Alumno(String carrera, int semestre, int id,
            String nombre, String apellidos, String edad) {
        super(id, nombre, apellidos, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int verCalificaciones() {
        System.out.println("Tienes 93 de calificacion !!");
        return 93;
    }

}

class Profesor extends Escuela {

    private String carrera;
    private String jefatura;

    public Profesor(String carrera, String jefatura, int id,
            String nombre, String apellidos, String edad) {
        super(id, nombre, apellidos, edad);
        this.carrera = carrera;
        this.jefatura = jefatura;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getJefatura() {
        return jefatura;
    }

    public void setJefatura(String jefatura) {
        this.jefatura = jefatura;
    }

    public void asentarCalificacion() {
        System.out.println("Te voy a poner tu calificacion, es: 86");
    }

}

class Administrativo extends Escuela {

    private String area;
    private String horario;

    public Administrativo(String area, String horario, int id, String nombre, String apellidos, String edad) {
        super(id, nombre, apellidos, edad);
        this.area = area;
        this.horario = horario;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void trabajoPendiente(){
        System.out.println("No tengo trabajo pendiente, zzzz!!!");
    }
}
