package universidad.principal;

import universidad.usuarios.Estudiante;
import universidad.infraestructura.Laboratorio;

public class SistemaCampus {

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Ana Gómez", "A012345", "Ingeniería en Sistemas", 5);
        Estudiante est2 = new Estudiante("Carlos Ruiz", "B067890", "Arquitectura", 2);
        Laboratorio lab1 = new Laboratorio("Laboratorio de Redes Cisco", 30);

        lab1.mostrarInformacion();
        lab1.abrirLaboratorio();
        est1.presentarse();
        est1.estudiar();
        est2.presentarse();
    }

}