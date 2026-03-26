package universidad.usuarios;

public class Estudiante {
    private String nombre;
    private String matricula;
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String matricula, String carrera, int semestre) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestre = semestre;
    }
}
