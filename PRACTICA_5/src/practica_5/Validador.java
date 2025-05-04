/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5;
import java.util.Scanner;
/**
 *
 * @author Christian
 */
public class Validador {

    public void leerNumero() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa un número entero: ");
            int numero = Integer.parseInt(sc.nextLine());
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El dato ingresado no es un número válido.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Validador v = new Validador();
        v.leerNumero();
    }
}

