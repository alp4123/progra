/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5;
import java.util.ArrayList;
/**
 *
 * @author Christian
 */
public class RegistroEstudiantes {

    private ArrayList<String> estudiantes = new ArrayList<>();

    public void agregarEstudiante(String nombre) {
        estudiantes.add(nombre);
    }

    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes:");
        for (String estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }

    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();
        registro.agregarEstudiante("Ana");
        registro.agregarEstudiante("Luis");
        registro.agregarEstudiante("Carlos");
        registro.mostrarEstudiantes();
    }
}
